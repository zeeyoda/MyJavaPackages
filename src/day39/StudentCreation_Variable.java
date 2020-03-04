package day39;

public class StudentCreation_Variable {
    public static void main(String[] args) {
        //how do we create an object out of template

        Student_Creation_Template s1 = new Student_Creation_Template();
        s1.name = "Karima";
        s1.age = 18;
        s1.gender = 'F';
        System.out.println("s1 name "+s1.name);

        Student_Creation_Template s2 = new Student_Creation_Template();
        s2.name = "Juma";
        s2.age = 31;
        s2.gender = 'M';
        System.out.println("s2 age is "+s2.age);
        //Juma's old age
        int oldAge = s2.age;
        s2.age = 28;
        System.out.println(s2.name+ "|"+s2.age+"|"+s2.gender);
        System.out.println(s2.name+"'s old age is "+oldAge);

        // what is the age difference between old age and new age

        System.out.println("The difference of Juma's old and new age is "+(oldAge-s2.age));



    }
}
