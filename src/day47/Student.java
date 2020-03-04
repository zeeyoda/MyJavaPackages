package day47;

public class Student {
    //final instance field
   final  int studentId;

   //public final static field with initial value set
    //this type field name is always suggested to be written all uppercase
    //to make it clear that this a public static field that will never change
    //other languages has specific term called CONSTANT for this
    //if interviewer how do I define constant in JAVA, answer should be
    //I will create public static final field
    public static final String SCHOOL = "Cybertek";
    public static final String COLLEGE = "MIT";

    public Student(int studentId){
        this.studentId = studentId;

    }
}
