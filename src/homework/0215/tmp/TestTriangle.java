public class TestTriangle {
    public static void main(String args[]) {
        Triangle customTr = new Triangle("yellow", true, 1, 1.5, 1);
        System.out.printf("%s\n", customTr); //implicitly calling toString method
    }
}
