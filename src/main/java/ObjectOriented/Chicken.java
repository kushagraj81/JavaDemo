package ObjectOriented;

public class Chicken extends Bird{
    public Chicken(int age, int weight)
    {
        super(age,weight);

    }
//    Use it every time you override a method for two benefits.
//    Do it so that you can take advantage of the compiler checking to make sure you actually are overriding a method when you think you are.
//    This way, if you make a common mistake of misspelling a method name or not correctly matching the parameters,
//    you will be warned that you method does not actually override as you think it does. Secondly,\
//    it makes your code easier to understand because it is more obvious when methods are overwritten.
    @Override
    public void fly()
    {
        System.out.println("chicken can not fly.....");
    }
}
