package day15;

public class Name_Contains {
    public static void main(String[] args) {

        //Task 2 whether your name has either character a and e
        //if so -->> name with a and e
        //if you not -->> I don't have both a and e in my name

        String myName = "Ziyoda";
        if (myName.contains("a") || myName.contains("e")) {
            System.out.println("My name contains a or e");
        }else{
            System.out.println("I do not have either a or e in my name");
        }
    }
}
