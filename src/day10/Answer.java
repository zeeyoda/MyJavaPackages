package day10;

public class Answer {
    public static void main(String[] args) {

      String myAnswer = "";
      int myNumber = 46;

      if(myNumber%2 == 0) {
          myAnswer = "Fizz Number";
      }else {
          myAnswer = "not a Fizz Number";
      }
          System.out.println("print my number is " + myNumber + " it is my "+ myAnswer);



    }
}
