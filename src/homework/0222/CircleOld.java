/**
 * Original Circle class from page 304; Listing 9.2
 */
public class CircleOld extends GeometricObject {
    private double radius;

    /**
     * Default constructor.
     */
    public CircleOld() {
    }

    /**
     * Constructor.
     *
     * @param  double  initial size of the object's radius.
     */
    public CircleOld(double rad) {
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
