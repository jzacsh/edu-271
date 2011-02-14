
public class Triangle extends GeometricObject {
    public double side1, side2, side3;

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
     * @param: double side 1 of this triangle.
     * @param: double side 2 of this triangle.
     * @param: double side 3 of this triangle.
     */
    public Triangle() {
        super(); //usually done implicitly
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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
        //Is there a way to do this syntactically? like:
        //    return this.side{(String) side} -- or is there no such parameter expansion
        //    in java?
        switch(side) {
            case 1:
                return this.side1;
                break;
            case 2:
                return this.side2;
                break;
            case 3:
                return this.side3;
                break;
            default:
                throw new IllegalArgumentException("Arguments accepted: 1, 2, or 3");
                break;
        }
    }

    /**
     * Calculates the area of the triangle.
     *
     * @return double area of the triangle.
     */
    public double getArea() {
        //@TODO: calculate the height of the triangle:
        double height = NULL;

        return 0.5 * this.side1 * height;
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
        state += "\nSide 1" + this.side1;
        state += "\nSide 2" + this.side2;
        state += "\nSide 3" + this.side3;
        return state;
    }

}
