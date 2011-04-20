// Used to show text I/O
import java.util.*;
import java.io.*;


public class Empio1 
{
    public static void main(String[] args) throws Exception
    {
        File efile = new File("emp.txt");
        Scanner ein = new Scanner(efile);
        String fname, lname;
        double salary = 0;
        double total = 0;

        while (ein.hasNext())
        {
            fname = ein.next();
            lname = ein.next();
            salary = ein.nextDouble();
            total += salary;
        }
        
        System.out.printf("Total is %5.2f", total);

        ein.close();
        
    }
}
