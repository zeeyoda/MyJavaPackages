package day50;

public class Subtraction extends Question {

    public Subtraction(int num1, int num2){
        super("-","Subtraction type");
        this.num1 = num1;
        this.num2 = num2;

        if(num1<num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        //after making sure num1>num2
        this.num1 = num1;
        this.num2 = num2;
       }
       @Override
       public void calculate(){
        answer = num1=num2;

        calculated = true;

       }

    @Override
    public String toString() {
        return "Subtraction{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", answer=" + answer +
                ", operator='" + operator + '\'' +
                ", calculated=" + calculated +
                ", questionType='" + questionType + '\'' +
                '}';
    }
}
