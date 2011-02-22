public class TestCircle {
    //@TODO: find out boolean syntax for Formatter
    public static void main(String argv[]) {
        double baseRad = 4;
        System.out.printf("Testing compareTo() of two Circle object.\n");
        Circle circ = new Circle(baseRad);

        System.out.printf("\tcalled circ1 = Circle(%.0f); circ2 = Circle(4).\n", baseRad);
        Circle sameObj = new Circle();
        System.out.println("\tcirc1.compareTo(circ2) = "+ circ.compareTo(sameObj));

        System.out.printf("\tcalled circ1 = Circle(%.0f); circ2 = Circle(3).\n", baseRad);
        Circle diffObj = new Circle();
        System.out.println("\tcirc1.compareTo(circ2) = "+ circ.compareTo(diffObj));

        System.out.printf("Testing equals() of Circle object, circ1, and Object object.\n");
        Object genericObj = new Object();
        circ.compareTo(genericObj);
    }
}
