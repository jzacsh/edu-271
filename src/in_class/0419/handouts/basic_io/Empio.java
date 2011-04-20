// Used to show text I/O
import java.util.*;
import java.io.*;


public class Empio 
{
    public static void main(String[] args) throws Exception
    {
        File efile = new File("emp.txt");
        PrintWriter eout = new PrintWriter(efile);

        eout.print("Barry Smith ");
        eout.println(50500.00);
        eout.print("Lillie Smith ");
        eout.println(51500.00);

        eout.close();
        
    }
}