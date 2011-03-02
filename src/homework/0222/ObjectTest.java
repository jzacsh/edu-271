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
            obj1[i] = "" + i;
            System.out.printf("\t...creating string object #%d of %d: %s\n", i+1, obj1.length, obj1[i].toString());
        }
        Object stringTest =  ObjectCompare.max(obj1);
        System.out.printf("\tlargest object is: %s\n", stringTest.toString());

        //test integers
        Integer [] obj2 = new Integer[aSize];
        System.out.printf("Testing with integers\n");
        for (i = 0; i < obj2.length; i++) {
            obj2[i] = i;
            System.out.printf("\t...creating integer object #%d of %d: %d\n", i+1, obj2.length, obj2[i]);
        }
        Integer intTest = (Integer) ObjectCompare.max(obj2);
        System.out.printf("\tlargest object is: %s\n", intTest.toString());

        //test dates
        System.out.printf("Testing with dates\n");
        java.util.Date[] obj3 = new java.util.Date[aSize];
        for (i = 0; i < obj3.length; i++) {
            obj3[i] = new java.util.Date();
            System.out.printf("\t...creating Date object #%d of %d: %s\t(epoch: %d)\n", i+1, obj3.length, obj3[i].toString(), (int) obj3[i].getTime());
        }
        java.util.Date dateTest = (java.util.Date) ObjectCompare.max(obj3);
        System.out.printf("\tlargest object is: %s\n", (String) dateTest.toString());
        System.out.printf("\tlargest object is: %d\n", (int) dateTest.getTime());
    }
}
