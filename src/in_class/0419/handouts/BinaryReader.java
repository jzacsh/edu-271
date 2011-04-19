// Used to show text I/O
import java.util.*;
import java.io.*;


public class BinaryReader 
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream efile = new FileInputStream("binary.data");
        DataInputStream ein = new DataInputStream(efile);
        String wholename;
        double salary = 0;
        double total = 0;

        while (ein.available() != 0)
        {
            wholename = ein.readUTF();
            salary = ein.readDouble();
            total += salary;
        }
        
        System.out.printf("Total for %s is %5.2f", wholename, total);

        ein.close();
        
    }
}
