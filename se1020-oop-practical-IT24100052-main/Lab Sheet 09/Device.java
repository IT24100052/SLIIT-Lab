package Labsheet_09;

    interface Enrollable{
        void enrollCourse(String courseName);
    }

    interface Teachable{
        void assignCourse(String courseName);
    }

    static class Student implements Enrollable{

        private String name;

        public Student(String name) {
            this.name = name;
        }

        @Override
        public void enrollCourse(String courseName) {
            System.out.println(name + " Entrolled in course: " + courseName);
        }
    }

    static class Instructor implements Enrollable,Teachable{

        private String name;

        public Instructor(String name) {
            this.name = name;
        }

        @Override
        public void enrollCourse(String courseName) {
            System.out.println(name + " Entrolled in course: " + courseName);
        }

        @Override
        public void assignCourse(String courseName) {
            System.out.println(name + " assigned to teach course: " + courseName);
        }
    }
    public class ELearningPlatform {
        public static void main(String[] args) {
            Enrollable student = new Student("Ahamed");
            Instructor teacher = new Instructor("VTN");

            student.enrollCourse("Information Technology");
            teacher.assignCourse("Software Engineering");
            teacher.enrollCourse("Software Engineering");

        }
    }
}
