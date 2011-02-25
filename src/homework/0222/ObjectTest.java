/**
 * Test class to ObjectCompare
 */
public class ObjectTest {
    public static void main(String[] argv) {
        int i;
        int aSize = 10;

        //test strings
        String[] obs = new String[aSize];
        System.out.printf("Testing with strings\n");
        for (i = 0; i < obs.length; i++) {
            System.out.printf("...Creating object %.0f of %.0f\n", i, obs.length);
            obs[i] = "" + i;
        }
        Object obj = ObjectCompare(obs);
        System.out.printf("largest object is: %s\n", obj.toString());

        //test integers
        int[] obs = new int[aSize];
        System.out.printf("\nTesting with integers\n");
        for (i = 0; i < obs.length; i++) {
            System.out.printf("...Creating object %.0f of %.0f\n", i, obs.length);
            obs[i] = i;
        }
        System.out.printf("largest object is: %s", (String) ObjectCompare(obs));

        //test dates
        System.out.printf("\nTesting with dates\n");
        java.util.Date[] obs = java.util.Date[aSize];
        for (i = 0; i < obs.length; i++) {
            System.out.printf("...Creating object %.0f of %.0f\n", i, obs.length);
            obs[i] = new java.util.Date();
        }
        System.out.printf("largest object is: %s", (String) new ObjectCompare(obs));
    }
}
