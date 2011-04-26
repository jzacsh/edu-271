import java.util.*;
import java.io.*;

/**
 * Jonathan Zacsh <jzacsh@gmail.com>
 * Comp 271 - Java
 * Lab #11; page 633; Exercise #18.3
 */

public class TotalBinaryStorageInts {
    private static String fileName = "Exercise18_3.dat";

    public TotalBinaryStorageInts() {
        //write something to a file, for testing.
        FileOutputStream outputFile = FileOutputStream(this.fileName);
        ObjectOutputStream output = ObjectOutputStream(outputFile);

        int randomQuantity = (int) (Math.random() * 100);
        int secretTotal = 0;
        System.out.printf("Writing %d numbers to file.\n", randomQuantity);
        for (int i; i < randomQuantity; i++) {
            output.writeInt(secretTotal += (int) (Math.random() * 1000));
        }
        System.out.printf("Total Quantity written to file: %d.\n", secretTotal);

        output.close();
    }

    public static void main(String[] args) {
        FileInputStream binaryNumbers = new FileInputStream(TotalBinaryStorageInts.fileName);
        ObjectInputStream numbers = new ObjectInputStream(binaryNumbers);
        int sum = 0;

        try {
            int currentNumber = 0;
            while (true) {
                currentNumber = numbers.readInt();
                sum += currentNumber;
            }
        }
        catch (EOFException exp) { 
            System.out.printf("total found in file = %d\n", sum);
        }
        finally {
            numbers.close();
        }

    }
}
