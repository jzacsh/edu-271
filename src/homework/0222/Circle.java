/**
 * Enhanced Circle class with comparable interface implemented.
 *
 * UML Diagram, per assignment:
 * +--------------------------------------------------------------+
 * | GeometricObject                                              |
 * | + p  color                                                   |
 * | + p  filled                                                  |
 * | + p  dateCreated                                             |
 * | + m  getColor                                                |
 * | + m  setColor                                                |
 * | + m  isFilled                                                |
 * | + m  setFilled                                               |
 * | + m  getDateCreated                                          |
 * | + m  toString                                                |
 * |                                                              |
 * | Comparable                                                   |
 * | + m  compareTo                                               |
 * |                                                              |
 * | Circle                                                       |
 * | - [extends GeometricObject]                                  |
 * | - [implements Comparable]                                    |
 * | + p  radius                                                  |
 * | + m  getRadius                                               |
 * | + m  setRadius                                               |
 * | + m  setArea                                                 |
 * | + m  getArea                                                 |
 * | + m  getDiameter                                             |
 * | + m  getPerimeter                                            |
 * | + m  printCircle                                             |
 * | + m  compareTo                                               |
 * +--------------------------------------------------------------+
 */
public class Circle extends GeometricObject implements Comparable {
    private double radius;

    /**
     * Default constructor.
     */
    public Circle() {
    }

    /**
     * Constructor.
     *
     * @param  double  initial size of the object's radius.
     */
    public Circle(double rad) {
        this.radius = rad;
    }

    /**
     * Accessor.
     *
     * @return double  the object member, this.radius
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Mutator for the object member this.raius.
     *
     * @param  double  the new radius for this object.
     */
    public void setRadius(double rad) {
        this.radius = rad;
    }

    /**
     * Compute the area of this object.
     *
     * @return  double the Circle's area.
     */
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    /**
     * Compute the diameter of this object.
     *
     * @return  double  the diameter of this Circle.
     */
    public double getDiameter() {
        return 2 * this.radius;
    }

    /**
     * Compute the perimeter of this object.
     *
     * @return  double  the perimeter of this Circle.
     */
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    /**
     * Implementation of compareTo().
     * NOTE: Based on the Circle's computed area.
     */
    public int compareTo(Object obj) throws Error {
        if (obj instanceof Circle) {
            double thisArea = this.getArea();
            double otherArea = ((Circle) obj).getArea();

            if (thisArea == otherArea) {
                //objects are the same size
                return 0;
            }
            else if (thisArea < otherArea) {
                //this object is smaller
                return -1;
            }
            else {
                //this object is larger
                return 1;
            }
        }
        else {
            java.util.Formatter err = new java.util.Formatter();
            err.format("You cannot compare the value of two non-like objects; must use an object of the %s Class.", 
                    obj.getClass().getName());
            throw new Error(err.toString());
        }
    }

    /**
     * Print the text information about this object, an even _higher_ level
     * toString().
     */
    public void printCircle() {
        System.out.printf("This circle was created: %s and the radius is: %.2f",
                getDateCreated(), this.radius);
    }

    //main to main compiler happy
    public static void main(String argv[]) {
    }
}
