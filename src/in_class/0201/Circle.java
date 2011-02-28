/*
 * what was the point of this class??
 *
class CircleDrive {
    public int radius;

    public static void main(String[] args) {
        Circle my_circle = new Circle(10);
        System.out.println(my_circle);
    }
}
*/

class Cylinder extends Circle {
    protected int height;

    //constructor
    public Cylinder (int ht, int rad) {
        super(rad); //calling parent constructor
        this.height = ht;
    }

    //overriding a method:
    public double findArea() {
        return 2 * super.findArea() + ( 2 * Math.PI * height * radius );
    }

    public String toString() {
        return super.toString() + "\tCylinder height: " + this.height + "\n\tCylinder Area: " + this.findArea() + "\n";
    }

    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(4, 9);
        System.out.println(cyl);
    }
}

//parent class
class Circle {
    protected int radius;

    //constructor
    public Circle (int rad) {
        this.radius = rad;
    }

    //class method
    public double findArea() {
        return Math.PI * this.radius * this.radius;
    }

    public String toString() {
        return "Circle's rad is: "+ this.radius + "\n\tCircle's Area is: "+ this.findArea() + "\n";
    }

    public static void main(String[] args) {
        Circle cir = new Circle(4);
        System.out.println(cir);
    }
}
