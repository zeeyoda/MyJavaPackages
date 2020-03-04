package tasks;

public class Task_Mihtar_CalculateChar_12_27_1 {
    public static void main(String[] args) {
        calculateWithChar(10, 5, '@');
        calculateWithChar(10, 5, '*');
        getGrade(95.7);

    }

    public static void calculateWithChar(int a, int b, char operator) {
        switch (operator) {
            case '-':
                System.out.println(a - b);
                break;
            case '+':
                System.out.println(a + b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

    public static  void getGrade(double grade) {

        if (grade >= 90 && grade <= 100)    {
            System.out.println("A");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("B");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("C");;
        } else if (grade >= 60 && grade < 70) {
            System.out.println("D");
        } else if (grade > 60) {
            System.out.println("F");
        }
    }
}


