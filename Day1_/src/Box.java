public class Box extends Rectangle{
    private double depth;

    Box(){
        super();
        this.depth = 1.0;
    }
    Box(double w, double h , double d){
        super.setSize(w, h);
        this.depth = d;
    }

    public void setDepth(double depth){
        if(depth == 0){
           this.depth = 1.0; 
        }else{
            this.depth = Math.abs(depth);
        }
        
    }

    public double getDepth(){
        return this.depth;
    }

    public void setSize(double w , double h , double d){
        if (w == 0 && h == 0 && d == 0){
            this.depth = 1.0;
            super.setSize(1.0, 1.0);
        }else if (w >= 0 && h >= 0 && d >= 0){
            super.setSize(w, h);
            this.depth = d;
        }else {
            super.setSize(w * -1, h * -1);
            this.depth = Math.abs(d);
        }
    }

    public void displayDetail(){
        System.out.println("=== Class Box ===");
        System.out.println("Depth : "+this.depth);
        System.out.println("Height : "+super.getHeight());
        System.out.println("Width : "+super.getWidth());
        System.out.println("Avg : "+this.computeVolume());
    }
    
    public double computeVolume(){
        return super.computeArea() * this.depth;
    }
}
