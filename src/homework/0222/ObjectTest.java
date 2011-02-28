/**
 * Test class to ObjectCompare
 */
public class ObjectTest {
    public static void main(String[] argv) {
        int i;
        int aSize = 10;

        //test strings
        String[] obj1 = new String[aSize];
        System.out.printf("Testing with strings\n");
        for (i = 0; i < obj1.length; i++) {
            System.out.printf("...Creating object %.0f of %.0f\n", i, obj1.length);
            obj1[i] = "" + i;
        }
        String stringTest = (String) ObjectCompare.max(obj1);
        System.out.printf("largest object is: %s\n", stringTest.toString());

        //test integers
        int[] obj2 = new int[aSize];
        System.out.printf("\nTesting with integers\n");
        for (i = 0; i < obj2.length; i++) {
            System.out.printf("...Creating object %.0f of %.0f\n", i, obj2.length);
            obj2[i] = i;
        }
        // why would passage of int[] aray to max() fail??
        if (obj2 instanceof Object) {
            int intTest = ObjectCompare.max(obj2);
            System.out.printf("largest object is: %s", intTest.toString());
        }

        //test dates
        System.out.printf("\nTesting with dates\n");
        java.util.Date[] obj3 = java.util.Date[aSize];
        for (i = 0; i < obj3.length; i++) {
            System.out.printf("...Creating object %.0f of %.0f\n", i, obj3.length);
            obj3[i] = new java.util.Date();
        }
        java.util.Date dateTest = ObjectCompare.max(obj3);
        System.out.printf("largest object is: %s", (String) dateTest.toString());
    }
}
