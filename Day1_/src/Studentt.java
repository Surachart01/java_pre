public class Studentt {
    private String Name ; 
    private String id ;
    private int score , THAI, ENG, SCI ,MATH , OOP,AVG;

    Studentt(){
        this.Name = "none";
        this.id = "000000";
        this.score = 0;
        this.THAI = 0;
        this.ENG = 0;
        this.SCI = 0;
        this.MATH = 0;
        this.OOP = 0;
    }

    Studentt(String Name, String id,int score,int THAI , int ENG,int SCI , int MATH , int OOP){
        this.Name = Name;
        this.id = id;
        this.score = score;
        this.THAI = THAI;
        this.ENG = ENG;
        this.SCI = SCI;
        this.MATH = MATH;
        this.OOP = OOP;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return id;
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

    public int getTHAI() {
        return THAI;
    }

    public void setTHAI(int tHAI) {
        THAI = tHAI;
    }

    public int getENG() {
        return ENG;
    }

    public void setENG(int eNG) {
        ENG = eNG;
    }

    public int getSCI() {
        return SCI;
    }

    public void setSCI(int sCI) {
        SCI = sCI;
    }

    public int getMATH() {
        return MATH;
    }

    public void setMATH(int mATH) {
        MATH = mATH;
    }

    public int getOOP() {
        return OOP;
    }

    public void setOOP(int oOP) {
        OOP = oOP;
    }

    public void Avg (){
        this.AVG = (this.ENG+this.MATH+this.OOP+this.SCI+this.THAI)/5; 
    }
    public void Display (){
        System.out.println("===============");
        System.out.println("AVG : "+this.AVG);
        System.out.println("===============");
    }
}
