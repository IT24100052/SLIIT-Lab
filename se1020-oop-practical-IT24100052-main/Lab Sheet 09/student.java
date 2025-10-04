package Labsheet_09;

    class Student{
        private String studentId;
        private String studentName;
        private static String universityName;

        public Student(String studentId, String studentName) {
            this.studentId = studentId;
            this.studentName = studentName;
        }

        public static String getUniversityName() {
            return universityName;
        }

        public static void setUniversityName(String universityName) {
            Student.universityName = universityName;
        }
        public void displayStudentInfo(){
            System.out.println("Student ID: " + studentId);
            System.out.println("Student Name: " + studentName);
            System.out.println("University: " + universityName);
        }
    }
    public class UniversitySystem {
        public static void main(String[] args) {

            Student.setUniversityName("SLIIT");

            Student s1 = new Student("VTN001","Vithusan");
            Student s2 = new Student("VTN002", "VTN");
            Student s3 = new Student("VTN003", "VTNV");

            Student[] students = new Student[3];
            students[0] = s1;
            students[1] = s2;
            students[2] = s3;

            for(Student s: students){
                s.displayStudentInfo();
                System.out.println();
            }

            Student.setUniversityName("University of Jaffna");
            System.out.println();

            System.out.println("After university name chenged: ");
            for(Student s: students){
                s.displayStudentInfo();
                System.out.println();
            }
        }
    }

