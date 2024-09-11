public class EnrollmentManagerImpl implements EnrollmentManager {
    @Override
    public void enroll(Student student, Course course) {
        student.enrollInCourse(course);
        course.enrollStudent(student);
    }
}
