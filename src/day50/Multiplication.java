package day50;

public class Multiplication extends Question {

    public Multiplication(int num1, int num2){
        super("X", "Multiplication Question");
        this.num1 = num1;
        this.num2 = num2;

    }
    @Override
    public void calculate(){
        answer = num1*num2;
        calculated = true;
    }

    @Override
    public String toString() {
        return "Multiplication{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", answer=" + answer +
                ", operator='" + operator + '\'' +
                ", calculated=" + calculated +
                ", questionType='" + questionType + '\'' +
                '}';
    }
}
