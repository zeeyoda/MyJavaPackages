package day50;

public abstract class Question {

    int num1, num2, answer;
    String operator;
    boolean calculated;
    String questionType = "Unknown";//setting default value to unknown directly here to avoid null

    public abstract void calculate();

    public Question(String operator, String questionType){
        this.operator = operator;
        this.questionType = questionType;
    }
   public String toString(){
        return "The question type is "+questionType+" : ";
   }


}
