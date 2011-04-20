// Used to show text I/O
import java.util.*;
import java.io.*;


public class BinaryReader 
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream efile = new FileInputStream("binary.data");
        ObjectInputStream ein = new ObjectInputStream(efile);
        String wholename = "";
        double salary = 0;
        double total = 0;
        Date then;

        try {
            while (true)
            {
                wholename = ein.readUTF();
                salary = ein.readDouble();
                then = (Date) ein.readObject();
                total += salary;
            }
        }
        catch (EOFException exp) { ; }
        
        System.out.printf("Total for %s is %5.2f\n", wholename, total);

        ein.close();
        
    }
}
