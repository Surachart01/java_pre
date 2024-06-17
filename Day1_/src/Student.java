public class Student {
    private String name;
    private String id;
    private int score;
    private int[] data;

    Student(){
        this.name = "test";
        this.id = "5050505050";
        this.score = 0;
    }

    Student(String name , String id ){
        this.name = name;
        this.id = id;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setData(int[] data){
        int count = data.length;
        if(count >0){
            this.data = data;
        }else{
            this.data[0] = 123;
        }
        
    }

    public int[] getData(){
        return this.data;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void grade(){
        int count  = this.data.length;
        for(int i = 0 ; i < count ;i++){
            this.score += this.data[i];
        }
    }

    public void displayDetail(){
        int count = this.data.length;
        System.out.println("============================");
        for( int i = 0 ; i < count ; i++){
            System.out.println("วิชาที่["+i+"] : "+this.data[i]);
        }
        System.out.println("ค่าเฉลี่ย : "+(this.score/count));

    }


    
}
