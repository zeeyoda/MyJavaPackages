package office_02_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssociationExample {
//    create a class called AssociationExample:
//    create 5 objects of the students class
//    create a List of students called CybertekStudents and store those 5 objects into the List
//    create the object of the School and initialize school name to "Cybertek"
//    add two more new students "Denis" and "Irina" to cybertek school' student list
//    use for each loop to print out entire Cybertek student' names

    public static void main(String[] args) {
        Student s1 = new Student("Azat");
        Student s2 = new Student("Saida");
        Student s3 = new Student("Adil");
        Student s4 = new Student("Sabira");
        Student s5 = new Student("Saniya");


        List<Student> cybertekStudents = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));

        School cybertek = new School("Cybertek", cybertekStudents);

        cybertekStudents.add(new Student("Denis"));
        cybertekStudents.add(new Student("Irina"));

        System.out.println(cybertek);
        System.out.println(cybertek.schoolName);
        System.out.println(cybertek.allStudentsList);

        Student[] students = {new Student("Gulnaz"),
                            new Student("Sardar")};
        cybertek.addNewStudent(students);
        System.out.println(cybertek.allStudentsList);

        for (Student each : cybertekStudents) {
            System.out.println(each.studentName);
            //347-785-9417 munavvar
            //donna fro Wic, how she is share info 718 616 4338


        }
    }
}
