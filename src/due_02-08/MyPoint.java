import java.io.*;

public class MyPoint {
    //
    //class data members
    //
    double coordX;
    double coordY;

    /**
     * default (no-arg) constructor
     */
    MyPoint () {
        //redundant, just for clarity:
        this.coordX = 0;
        this.coordY = 0;
    }

    /**
     * Instance constructor.
     *
     * @param  double  x-coordinate
     * @param  double  y-coordinate
     */
    MyPoint (double cX, double cY) {
        this.coordX = cX;
        this.coordY = cY;
    }

    //
    //class methods:
    //


    public static void main() {
        //
    }
}
