package day31;

public class Method_Calculator_V2_13 {
    public static void main(String[] args) {
        //char operator = '+'; // it can be + - */
        //int num1 = 15;
        //int num2 = 3;
        calculator('-', 15, 30);
        calculator('+', 15, 30);
        calculator('*', 95, 2);
        calculator('/', 1005, 5);

    }

    public static void calculator(char operator, int num1, int num2) {

        switch (operator) {
            case '+':
                System.out.println((num1 + num2));
                break;
            case '-':
                System.out.println((num1 - num2));
                break;
            case '*':
                System.out.println((num1 * num2));
                break;
            case '/':
                System.out.println((num1 / num2));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
