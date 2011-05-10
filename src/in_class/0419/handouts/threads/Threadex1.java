// Used to show threads
import java.util.*;
import java.io.*;


public class Threadex1 {
    public static void main(String[] args) {
        Thread count1 = new CountDownEven();
        Thread count2 = new CountDownOdd();
        count1.start();
        count2.start();
        System.out.println("Running ..... ");

    }
}

class CountDownEven extends Thread {
    public void run() {
        int k;
        for (k = 10; k > 0 ; k -= 2 )
        {
            System.out.println(this.getName() + " count " + k);
            Thread.yield();
        }
    }
}

class CountDownOdd extends Thread {
    public void run() {
        int k;
        for (k = 9; k > 0 ; k -= 2 )
        {
            System.out.println(this.getName() + " count " + k);
            Thread.yield();
        }
    }
}

