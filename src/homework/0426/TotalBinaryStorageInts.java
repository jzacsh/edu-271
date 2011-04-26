import java.lang.Math;
import java.util.*;
import java.io.*;

/**
 * Jonathan Zacsh <jzacsh@gmail.com>
 * Comp 271 - Java
 * Lab #11; page 633; Exercise #18.3
 */

public class TotalBinaryStorageInts {
    private static String fileName = "Exercise18_3.dat";
    private int correctTotal = 0;

    //for debugging purposes
    public TotalBinaryStorageInts() throws Exception {
        //write something to a file, for testing.
        FileOutputStream outputFile = new FileOutputStream(this.fileName);
        ObjectOutputStream output = new ObjectOutputStream(outputFile);

        int currentNum = 0,
            randomQuantity = (int) (Math.random() * 100);

        System.out.printf("Writing %d numbers to file...\n", randomQuantity);
        for (int i = 0; i < randomQuantity; i++) {
            currentNum = (int) (Math.random() * 1000);
            correctTotal += currentNum;
            output.writeInt(currentNum);
        }
        System.out.printf("Total Quantity written to file:\t%d.\n", correctTotal);

        output.close();
    }

    public static void main(String[] args) throws Exception {
        TotalBinaryStorageInts run = new TotalBinaryStorageInts();

        try {
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
            catch (EOFException ex) { 
                System.out.printf("Total found in file was:\t%d.\n", sum);
                if (sum != run.correctTotal) {
                    System.err.printf("Fail! Incorrect total found. Should've been:\t%d.\n",
                            run.correctTotal);
                }
            }
            finally {
                numbers.close();
            }
        }
        catch(Exception err) {
            System.err.printf("problem initializing file and/or object.\n");
            return;
        }
    }
}
