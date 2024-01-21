package Javaloops;

public class Loops {
    private static Integer count=0;
   public Loops()
    {
        System.out.println("inside Loops class");
    }

    public void printCount()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(count);
            count+=2;
        }
    }
}

