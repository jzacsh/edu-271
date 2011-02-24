/**
 * Test class to ObjectCompare
 */
public class ObjecTest {
    public static void main(String[] argv) {
        int i;

        //test strings
        System.out.printf("Testing with strings\n");
        for (i = 0; i < obs.getLength(); i++) {
            System.out.printf("...Creating object %.0f of %.0f\n", i, obs.getLength(), ObjectCompare(obs));
            String obs[i] = new String((String) i);
        }
        System.out.printf("largest object is: %s\n", ObjectCompare(obs));

        //test integers
        System.out.printf("\nTesting with integers\n");
        for (i = 0; i < obs.getLength(); i++) {
            System.out.printf("...Creating object %.0f of %.0f\n", i, obs.getLength(), ObjectCompare(obs));
            int obs[i] = new int(i);
        }
        System.out.printf("largest object is: %s", ObjectCompare(obs));

        //test dates
        System.out.printf("\nTesting with dates\n");
        java.util.Date[10] obs = java.util.Date();
        for (i = 0; i < obs.getLength(); i++) {
            System.out.printf("...Creating object %.0f of %.0f\n", i, obs.getLength(), ObjectCompare(obs));
            java.util.Date obs[i] = new java.util.Date();
        }
        System.out.printf("largest object is: %s", ObjectCompare(obs));
    }
}
