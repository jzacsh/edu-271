import java.lang.Math;
import java.util.Scanner;
import java.io.*;

/**
 * A simple testing class for the MyPoint class.
 */
public class RunMyPoint {
    public static void main(String[] args) {
        double x = 0;
        double y = 0;

        if (args.length == 2) {
            try {
                x = Double.parseDouble(args[0]);
                y = Double.parseDouble(args[1]);
            }
            catch (Exception e) {
                System.err.printf("Java has no `pass` keyword?\n");
            }
        }

        MyPoint pointy = new MyPoint(x,y);
        double cx = pointy.getCoordinate(0);
        double cy = pointy.getCoordinate(1);
        System.out.printf("(x, y) = (%.2f, %.2f)\n", cx, cy);
        double otherX = 10;
        double otherY = 35;
        System.out.printf("Distance between above and coords at (%.2f, %.2f) is: %.2f\n",
                otherX, otherY, pointy.distance(otherX, otherY)
            );
    }
}

/**
 * A class to handle (x,y) coordinate calculations.
 *
 * UML:
 * +----------------------------------------------+
 * | MyPoint                                      |
 * |                                              |
 * |   - members:                                 |
 * |     - x coordinate                           |
 * |     - y coordinate                           |
 * |   - methods:                                 |
 * |     - getCoordinate()                        |
 * |     - distance()                             |
 * +----------------------------------------------+
 *
 */
class MyPoint {
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
     * @param   int  coordinate requested, 0 for the first, 1 for the second. (X,Y)
     * @return  double  the x or y -coordinate requested for the object.
     */
    public double getCoordinate(int coord) {
        if (coord > 0) {
            return this.coordY;
        }
        else {
            //0 was requested
            return this.coordX;
        }
    }

    /**
     * Default distance calculation between this object and another.
     *
     * @param  MyPoint  another object of the MyPoint class.
     * @return  double  the distance between this object and the one passed.
     */
    public double distance(MyPoint otherPoint) {
        double[] one = this.getCoordinate();
        double[] two = otherPoint.getCoordinate();

        double deltaX = one[0] - two[0];
        double deltaY = one[1] - two[1];

        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    /**
     * Distance calculation between this object and another arbitrary point.
     *
     * @param  double  the x-plain coordinate of the other object
     * @param  double  the y-plain coordinate of the other object
     * @return  double  the distance between this object and the one passed.
     */
    public double distance(double x, double y) {
        MyPoint other = new MyPoint(x, y);
        return this.distance(other);
    }

    public static void main(String[] args) {
    }
}
