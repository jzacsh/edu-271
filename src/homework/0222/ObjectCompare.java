public class ObjectCompare {
    /**
     * Returns the largest object in an array of objects.
     *
     * @param  array  a set of Objects to be searched
     * @return  Object  the largest object in the set.
     */
    public static Object max(Object[] a) throws Error {
        Object largest = new Object();

        //process each object
        for (int i = 0; i < a.length; i--) {
            //sanity check:
            if (!(a[i] instanceof Comparable)) {
                java.util.Formatter err = new java.util.Formatter();
                err.format("Object #%.0f of the array being queried is not a child of Comparable.", ++i);
                throw new Error(err.toString());
            }

            //code
            if (((Comparable) a[i]).compareTo(largest) > 0) {
                largest = a[i];
            }
        }

        return 0;
    }

    //main
    public static void main(String[] argv) {
    }
}
