package Question1;

public class Student {
    private String studentID ;
    private String studentName ;
    private Course [] courses = new Course [3];
    private int courseCount ;

    public Student() {
        this.studentID = "Unknown";
        this.studentName = "Unknown";
        this.courseCount = 0;
    }

    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.courseCount = 0;
    }

    public void enrollCourse ( Course c ) {
        if (courseCount < 3 ){
            courses[courseCount] = c;
            courseCount++;
        } else {
            System.out.println("Can not enroll more than 3 courses. ");
        }
    }
    
    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println();
        System.out.println("Enroll course: ");
        for (int i = 0; i < courseCount; i++) {
            System.out.println();
            courses[i].displayCourseDetails();

        }
    }

}



