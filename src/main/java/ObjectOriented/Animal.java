package ObjectOriented;

public class Animal {
    private int age;
    private int weight;
    public Animal(int age, int weight)
    {
        this.age=age;
        this.weight=weight;
    }
    protected void sleep()
    {
        System.out.println("sleeping.....");
    }
    protected void eat()
    {
        System.out.println("eating........");
    }
}
