public class TestAbstFood {

    public static void main(String[] args) {
        AbstFood kfc , pizza ,chester ;

        pizza = new ThePizza();
        callFood(pizza);

        kfc = new Kfc();
        callFood(kfc);

        chester = new Chester();
        callFood(chester);
    }

    public static void callFood(AbstFood obj){
        obj.show();
        System.out.println(obj.call());
    }
}