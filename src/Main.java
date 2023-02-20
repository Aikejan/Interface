public class Main {
    public static void main(String[] args) {

       Oceanarum shark = new Shark("Blue shark","Blue",200);
        System.out.println(shark);
         shark.myMethod();
        System.out.println("***********************");
        Oceanarum oceanarum1  = new Duck( " white dusk","white",10);
        oceanarum1.myMethod();
        System.out.println(oceanarum1);
        System.out.println("**************************");
        Oceanarum turtle = new Turtle("adxas","Black",15);
        turtle.myMethod();
        System.out.println(turtle);
    }
}