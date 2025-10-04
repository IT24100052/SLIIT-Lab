package Question1;

public class Main {
    public static void main(String[] args) {

        Course c1 = new Course("c1","English");
        Course c2 = new Course("c2","Maths");
        Course c3 = new Course("c3","science");

        Student student = new Student("01","kamal");

        student.enrollCourse(c1);
        student.enrollCourse(c2);
        student.enrollCourse(c3);

        student.displayStudentDetails();

    }
}
