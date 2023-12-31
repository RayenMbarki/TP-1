public class Course {
    private int courseId;
    private String courseName;
    private Instructor I;

    public Course(int courseId,String courseName,int instructorId,String firstName,String lastName ) {
        this.courseId=courseId;
        this.courseName=courseName;
        I=new Instructor(instructorId,firstName,lastName);
    }

    public int getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getInstructor() {
        return ("prof ID :  " + I.getInstructorId() + " | " + "first Name :  " +  I.getFirstName() + " | "  + " last Name : " +  I.getLastName());
    }
}
