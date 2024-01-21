package ObjectOriented;

public class Handler {
    public static void main(String args[])
    {
        Bird bird1= new Bird(12,22);

        Chicken chicken1= new Chicken(12,34);
        chicken1.sleep();
        chicken1.eat();
        bird1.fly();
        chicken1.fly();
    }

}
