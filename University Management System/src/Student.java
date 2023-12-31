import java.util.ArrayList;
public class Student {
    private int studentId;
    private String firstName;
    private String lastName;

    private ArrayList <Course> L;

    public Student (int studentId,String firstName,String lastName) {
        this.studentId=studentId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.L=new ArrayList <> ();
    }
    public int getStudentId() {
        return studentId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public ArrayList<Course> getCourses () {
        return L;
    }
    public void enroll(Course course) {
        L.add(course);
        /*boolean True=true;
        for (int i=0;i<L.size();i++) {
            if (L.get(i).getCourseName().equals(course.getCourseName())) {throw new AlreadyExistException();True=false;}
        }
        if (t==true)*/

    }

    public void affiche_courses() {
        int i=1;
        for (Course element : L) {
            System.out.println("course  " + i  +  " : " +  element.getCourseName());
            i++;
        }
    }


}
