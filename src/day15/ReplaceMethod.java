package day15;

public class ReplaceMethod {
    public static void main(String[] args) {
        // replace method of the String
        //It will go though all part of String and replace and replace any match with new return
        String message = "I love Pumpkin, Pumpkin IS FUN!" ;
        message = message.replace("Pumpkin", "Java");
        System.out.println(message);

        String message2 = "Happy Thanks Giving to All!!";
        //Happy Thanks Giving to All! -->> Happy Thanksgiving to All!

        message2 = message2.replace("Thanks Giving", "Thanksgiving");
        System.out.println(message2);

        message2 = message2.replace("!!", "!");
        System.out.println(message2);

        //remove all space
        //replace space with empty String/space
        message2 = message2.replace(" ", "");
        System.out.println(message2);

       String message3 = "Tomorrow IS OFF NO!";
        // how do we remove NO!
        System.out.println(message3.replace(" NO", ""));




    }
}
