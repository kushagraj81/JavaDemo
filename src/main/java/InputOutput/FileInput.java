package InputOutput;
import java.io.*;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
public class FileInput {
    public static void main(String args[])
    {
        try{
            Path fileName = Path.of("C:\\bartle\\JavaTest.txt");

            // Creating an object of Scanner class
            Scanner sc = new Scanner(fileName);

            // It holds true till there is single element left
            // via hasNext() method
            while (sc.hasNextLine()) {
                // Iterating over elements in object
                System.out.println(sc.nextLine());
            }

            // Closing scanner class object to avoid errors and
            //  free up memory space
            sc.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
