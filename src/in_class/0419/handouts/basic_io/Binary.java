// Used to show text I/O
import java.util.*;
import java.io.*;


public class Binary 
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream efile = new FileOutputStream("binary.data");
        ObjectOutputStream eout = new ObjectOutputStream(efile);

        Date now = new Date();

        eout.writeUTF("Barry Smith ");
        eout.writeDouble(50500.00);
        eout.writeObject(now);
        eout.writeUTF("Lillie Smith ");
        eout.writeDouble(51500.00);
        eout.writeObject(now);

        eout.close();
        
    }
}
