// Used to show text I/O
import java.util.*;
import java.io.*;


public class Binary 
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream efile = new FileOutputStream("binary.data");
        DataOutputStream eout = new DataOutputStream(efile);

        eout.writeUTF("Barry Smith ");
        eout.writeDouble(50500.00);
        eout.writeUTF("Lillie Smith ");
        eout.writeDouble(51500.00);

        eout.close();
        
    }
}
