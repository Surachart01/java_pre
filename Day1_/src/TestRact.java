public class TestRact {
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle();

        rect1.setWidth(100);
        rect1.setHeight(50);
        rect1.name = "Rect1";
        System.out.println("width = "+ rect1.getWidth());
        System.out.println("height = "+ rect1.getHeight());
        rect1.displayDetail();
    }
}
