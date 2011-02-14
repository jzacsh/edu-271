import chapter9.*;
import pkg.*;
//@TODO: is the above how it is done?

public class TestTriangle {
    public void main(String args[]) {
        Triangle customTr = new Triangle("yellow", true, 1, 1.5, 1);
        System.out.printf("%s\n", customTr()); //implicitly calling toString method
    }
}
