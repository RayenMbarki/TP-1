import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int id;
        String first;
        String last;
        System.out.println("enter student id : ");
        id = s.nextInt();
        s.nextLine();
        System.out.println("enter student first name : ");
        first=s.nextLine();
        System.out.println("enter student last name : ");
        last=s.nextLine();

        Student A=new Student(id,first,last);
        String cname,prof,proflastname;


        System.out.println("course 1 : ");

        System.out.println("----");

        System.out.println("enter  1st course id : ");
        id = s.nextInt();
        s.nextLine(); // to avoid input problems
        System.out.println("1st course name : ");
        cname=s.nextLine();
        System.out.println("prof first name : ");
        prof=s.nextLine();
        System.out.println("prof last name : ");
        proflastname=s.nextLine();


        Course M=new Course(id,cname,100,prof,proflastname);


        System.out.println("course 2 : ");

        System.out.println("----");
        System.out.println("enter 2nd  course id : ");
        id = s.nextInt();
        s.nextLine(); // because without it causes problems after s.nextInt() when input
        System.out.println("2nd course name : ");
        cname=s.nextLine();
        System.out.println("prof first name : ");
        prof=s.nextLine();
        System.out.println("prof last name : ");
        proflastname=s.nextLine();

        s.close();
        Course P=new Course(id,cname,110,prof,proflastname);
        A.enroll(M);
        A.enroll(P);

        System.out.println("student firstname : " + A.getFirstName());
        System.out.println("student lastname : " + A.getLastName());
        System.out.println("student Id : " + A.getStudentId());
        System.out.println("student   "  + A.getFirstName() + " pursue courses : " );
        A.affiche_courses();


        System.out.println("-------");





        System.out.println("course :  " + M.getCourseName() + " is presented by Mr / Mrs  : " +  M.getInstructor());
        System.out.println("course :  " + P.getCourseName() + " is presented by Mr / Mrs : " +  P.getInstructor());






    }
}

