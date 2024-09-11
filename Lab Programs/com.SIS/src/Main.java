public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("abc", "S001");
        GraduateStudent student2 = new GraduateStudent("xyz", "S002", "AI Research");

        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "Computer Science");

        EnrollmentManager enrollmentManager = new EnrollmentManagerImpl();

        enrollmentManager.enroll(student1, course1);
        enrollmentManager.enroll(student2, course2);

        System.out.println(course1.getCourseName() + " has the following students enrolled:");
        for (Student student : course1.getEnrolledStudents()) {
            System.out.println(student.getName());
        }

        System.out.println(course2.getCourseName() + " has the following students enrolled:");
        for (Student student : course2.getEnrolledStudents()) {
            System.out.println(student.getName());
        }
    }
}
