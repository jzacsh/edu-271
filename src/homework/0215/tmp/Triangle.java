//@TODO: because I placed a "package" statement of `chapter9` in
//GeometricObject.java file, do I have to do the same here? or does it not
//matter, because this is only _utilizing_ the package?

//@TODO: if I want my `TestClass` files to be able to 'import' from this file,
//I need to have a `package` statement here, correct?

/**
 * UML Diagram of Triangle and GeometricObject
 *
 * +-----------------------------------------+
 * | [m] = method                            |
 * | [p] = property/field                    |
 * |-----------------------------------------|
 * | GeometricObject                         |
 * | + m  getColor                           |
 * | + m  setColor                           |
 * | + m  isFilled                           |
 * | + m  getFilled                          |
 * | + m  getDateCreated                     |
 * | + m  toString                           |
 * | + p  color                              |
 * | + p  filled                             |
 * | + p  dateCreated                        |
 * |                                         |
 * | Triangle (extends GeometricObject)      |
 * | + p  side1                              |
 * | + p  side2                              |
 * | + p  side3                              |
 * | + m  getSide                            |
 * | + m  getArea                            |
 * | + m  getPerimeter                       |
 * +-----------------------------------------+
 */

public class Triangle extends GeometricObject {
//  public double side1 side2, side3;
    public double side1;
    public double side2;
    public double side3;

    /**
     * Default constructor.
     */
    public Triangle() {
        super(); //usually done implicitly
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    /**
     * Constructor.
     *
     * @param: String color of the object.
     * @param: boolean if the object is filled.
     * @param: double side 1 of this triangle.
     * @param: double side 2 of this triangle.
     * @param: double side 3 of this triangle.
     */
    public Triangle(String color, boolean fill, double s1, double s2, double s3) {
        super(); //usually done implicitly
        this.setColor(color);
        this.setFilled(fill);
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    /**
     * Accessors.
     *
     * @TODO: professor, based on previous homework I assume you don't mind me
     * intelligently combining three seemingly-unnecessary accessors into a
     * single one, here:
     */
    /**
     * Single accessor method for all three sides. pass the side-number you'd
     * like the return of, eg.: `1` for side 1 of 3.
     *
     * @return: double size of the requested side of the triangle.
     */
    public double getSide(int side) throws IllegalArgumentException {
        //@TODO: professor, question:
        //Is there a way to do the below `switch` logic syntactically? eg.:
        //      return this.side{(String) side}
        //    so if side=3, then it would be interpolated and run as:
        //      return this.side3
        //    -- or is there no such parameter expansion in java?
        double ret = 0; //done purley because the compiler gets confused, (see `git log -p`)
        switch(side) {
            case 1:
                ret = this.side1;
                break;
            case 2:
                ret = this.side2;
                break;
            case 3:
                ret = this.side3;
                break;
            default:
                throw new IllegalArgumentException("Arguments accepted: 1, 2, or 3");
        }

        return ret; //only for the compiler's sake
    }

    /**
     * Calculates the area of the triangle.
     *
     * @return double area of the triangle.
     */
    public double getArea() {
        //formula taken from: Prog-Exercise 5.19, ISBN 0-13-222158-6;
        double s = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }

    /**
     * Calculate the perimeter of the triangle.
     *
     * @return double the perimeter of the triangle.
     */
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    /**
     * Accessor.
     *
     * @return: String full-sentence representation of the state of the
     * object's current properties.
     */
    public String toString() {
        String state = "Triangle. " + super.toString();
        state += "\nSide 1: " + this.side1;
        state += "\nSide 2: " + this.side2;
        state += "\nSide 3: " + this.side3;
        return state;
    }

}
