package office_02_10;
//    WarmUp:
//    Task1:
//    create a class called Student:
//    instance variables: String studentName
//    initialize the ins variable within a constructor
//    create a class called School:
//    instance variables: String schoolName
//    List<Student> AllStudentsList;
//    initialize instance variables within a constructor
//    create a method called addNewStudent() that can add students to the AllStudentsList

import java.util.Arrays;
import java.util.List;

public class Student {
    String studentName;

    public Student(String studentName){
        this.studentName=studentName;
    }
    public String toString(){
        return "Student name is "+studentName;
    }


}
class School{
    String schoolName;
    List<Student> allStudentsList;

    public School(String schoolName, List<Student> allSLst){
        this.schoolName = schoolName;
        allStudentsList = allSLst;
    }
    public void addNewStudent(String studentName) {
        Student s1 = new Student(studentName);
        allStudentsList.add(s1);
    }
    public void addNewStudent(Student[] str){
        allStudentsList.addAll(Arrays.asList(str));
    }
    public void addNewStudent(List<Student> list){
        allStudentsList.addAll(list);
    }
    @Override
    public String toString(){
        return "All students are = "+ allStudentsList;
    }


}
