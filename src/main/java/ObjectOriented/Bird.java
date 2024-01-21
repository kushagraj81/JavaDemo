package ObjectOriented;

public class Bird extends Animal{
    public Bird(int age, int weight)
    {
        super(age,weight);
    }
    protected void fly()
    {
        System.out.println("flying.....");
    }
}
