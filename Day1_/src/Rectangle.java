public class Rectangle {
    private double width;
    private double height;
    String name ; 

    Rectangle(){
        this.width = 0.0;
        this.height = 0.0;
    }

    Rectangle(double width , double height){ // Overload Constr
        this.width = width;
        this.height = height;
    }


    Rectangle(double width, double height , String name){
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public void setSize(double w , double h){
        if(w == 0 && h == 0){
            this.width = 1.0;
            this.height = 1.0;
        } else if(w >=0 && h >=0){
            this.width = w;
            this.height = h;
        }else {
            this.width = Math.abs(w);
            this.height = Math.abs(h);
        }
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public double computeArea(){
        return this.width * this.height;
    }

    public void displayDetail(){
        System.out.println(" === Class Rectangle ===");
        System.out.println("Name : "+ this.name);
        System.out.println("Width : "+ this.width);
        System.out.println("Height : "+ this.height);
        System.out.println("Area : "+ this.computeArea());
    }

}
