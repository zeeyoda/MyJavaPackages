package day10;

public class Calculator {

    public static void main(String[] args) {

        //crate a variable called operator with type char
        //Assign a value for one of these four: + - * /
        // use switch statement to do following logic
        //if the operator is + print u r about to add numbers
        // if the operator is - print u r about to subtract
        //if the operator is * print u r about to multiply
        // if the operator is / print u r about to divide numbers
        // if nothing matches print invalid operator

        //USE switch statement to complete this task
         char operator ='*';

         switch(operator){

             case '+':
                 System.out.println("You are about to add");
                 break;
             case '-':
                 System.out.println("You are about to subtract");
                 break;
             case '*':
                 System.out.println("You are about to multiply");
                 break;
             case '/':
                 System.out.println("You are about to divide");
                 break;
             default :
                 System.out.println("Invalid Operator");
                 break;

         }

    }
}
