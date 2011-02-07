import java.util.Scanner;
import java.io.*;

/**
 * A simple testing class for the MyPoint class.
 */
public class TestMyPoint {
    MyPoint pointy = new MyPoint();
    double cx = pointy.getCoordinate(0);
    double cy = pointy.getCoordinate(1);
    System.out.printf("(x,y)\n(%d,%d)\n", cx, cy);
}

/**
 * A class to handle (x,y) coordinate calculations.
 */
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

    /**
     * Default accessor method.
     *
     * @return  double[]  array of doubles representing the (x,y) coordinates
     * of this object.
     */
    public double[] getCoordinate() {
        return new double[]{ this.coordX, this.coordY};
    }

    /**
     * Accessor method.
     *
     * @param  short  coordinate requested, 0 for the first, 1 for the second. (X,Y)
     * @return  double  the x or y -coordinate requested for the object.
     */
    public double getCoordinate(short coord) {
        if (coord) {
            return this.coordY;
        }
        else {
            //0 was requested
            return this.coordX;
        }
    }

    /**
     * The silly way to do accessors:
     */
//  /**
//   * Accessor method for X coordinate.
//   */
//  public double getCoordX() {
//      return this.coordX;
//  }

//  /**
//   * Accessor method for Y coordinate.
//   */
//  public double getCoordY() {
//      return this.coordY;
//  }


    public static void main() {
        //
    }
}
