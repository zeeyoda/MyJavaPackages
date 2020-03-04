package day06;

public class CompountOperator {
    public static void main(String[] args) {

        //Assignment operator will save the result of whatever operation on the right side and
        //assign the result to the left side variable;

        int studentOnline = 263 ;
        studentOnline = studentOnline + 5 ;

        System.out.println(" Five people joined the class: " + studentOnline);

        studentOnline = studentOnline - 3;

        System.out.println("Three students left the class: " + studentOnline);

        studentOnline = studentOnline*2;
        // studentOnline = studentOnline + studentOnline;

        System.out.println("Student number doubled: " + studentOnline);

        studentOnline = studentOnline/3 ;

        System.out.println(" The student count  dropped to 1/3:  " + studentOnline);


    }
}
