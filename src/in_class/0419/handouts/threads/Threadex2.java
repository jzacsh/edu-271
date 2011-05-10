// Used to show threads
import java.util.*;
import java.io.*;


public class Threadex2 {
    public static void main(String[] args) {
        Thread count1 = new Thread (new CountDownEven());
        Thread count2 = new Thread (new CountDownOdd());
        count1.start();
        count2.start();
        
    }
}

class CountDownEven implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        int k;
        for (k = 10; k > 0 ; k -= 2 )
        {
            System.out.println(t.getName() + " count " + k);
            Thread.yield();
        }
    }
}

class CountDownOdd implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        int k;
        for (k = 9; k > 0 ; k -= 2 )
        {
            System.out.println(t.getName() + " count " + k);
            Thread.yield();
        }
    }
}

