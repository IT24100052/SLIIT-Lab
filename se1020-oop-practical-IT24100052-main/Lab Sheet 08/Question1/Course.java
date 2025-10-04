package Question1;

public class Course {
    private String courseCode;
    private String courseTitle;

    public Course(String courseCode, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
    }

    public void displayCourseDetails(){
        System.out.println("The course code is: " + courseCode);
        System.out.println("The course title is: " + courseTitle);
    }
}