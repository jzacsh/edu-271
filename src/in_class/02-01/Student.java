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

        System.out.println("Creating enough space for 5 instantiations of the Student structure, or 'class'.");
        //does NOT invoke Student default constructor:
        Student students[] = new Student[5];
        //simply creates enough null pointers of size Student
//      System.out.println("index[1] of students stuff is: " + students[1].id);

        System.out.println("Instantiating a Student object in the first allocated index[0].");
        students[0] = new Student("Jack", 1003);
        System.out.println("index[0] of students stuff is: " + students[0]);
    }
}
