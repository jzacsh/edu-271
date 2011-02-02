public class Student {

    private String name;
    private int id;
    public static String school = "Brookdale";

    //constructor
    private Student (String std_name, int std_id) {
        this.name = std_name;
        this.id = std_id;
    }

    //java will recognize this
    public String toString() {
        return "Name is: " + this.name + "\nID is: " + this.id;
    }

    public static void main (String[] args) {
        System.out.println("Before creating an instance of Student class: School is: " + Student.school + "\n");
        Student sally = new Student("Sally Mae", 1234);
        System.out.println(sally); //will implictly call toString()
    }
}
