package day47;

public class FinalVariablePractice {
    public static void main(String[] args) {
        //declaring and assigning initial value
        //declaring and initializing a variable
        int x = 10;

        //re-assigning new value to the variable
        //storing/giving new value to the variable
        //changing the original value of the variable
        x = 100;

        //declaring and initializing  final value/variable
        //declaring and assigning initial value to final variable
        final int y = 20;


        //final word below makes the value for s1 object a final object.
        //we cannot change this object to something else
        final Student s1 = new Student(345);
       // s1 = new Student(102);-----> this will not word as s1 object is final
        //example if s1 is Ziyoda it cannot be changed to Sabira
        //you can still change internal data attached to the object
        //as long as it is the same object s1 pointing to
        //as long as the address does not change
        //s1.studentId = 200;
        System.out.println(s1.studentId);

        Student s2 = new Student(145);
        System.out.println(s2.studentId);

        System.out.println(Student.SCHOOL);
        //below we cannot reassign value because it is final
        //Student.school = "abc";

        System.out.println(Byte.MAX_VALUE);

        //PI in Java
        System.out.println(Math.PI);
        printDoubledNumber(12);
    }
    /**
     * a void method that accept a number and print out doubled number
     *
     * @param x
     */
    // anywhere we declare a variable we have option to make it final (including method parameter)
    // making method parameter final
    // it will make the method only use the argument user passed without modifying it ;
    public static void printDoubledNumber(final int x) {
//        x = x * 2 ;
//        System.out.println("x*2 = " + x );

        System.out.println("x*2 = " + x * 2);


    }


}
