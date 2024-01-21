package ObjectOriented;

public class Chicken extends Bird{
    public Chicken(int age, int weight)
    {
        super(age,weight);

    }
    @Override
    public void fly()
    {
        System.out.println("chicken can not fly.....");
    }
}
