package day08;

public class IfStatement {

    public static void main(String[] args) {

        int speedLimit = 60;
        int yourCurrentSPeed = 45;
        //if the yourCurrentSPeed is more than speedLimit
        //get pulled over by the police
        //given tickets by the police
        //taken away some points on your license
        //go to court

        boolean amISpeeding = (yourCurrentSPeed > speedLimit);
        // Inside parentheses we can only put
        //Boolean value; true false
        //boolean variable
        //any expression that return boolean value

        //if (amISpeeding) {
        //if (true){
        if (amISpeeding)         {
            System.out.println("Get pulled over by the police");
            System.out.println("get a ticket");
            System.out.println("get points taken away");
            System.out.println("go to court");
        }else{
            System.out.println("go shopping");
            System.out.println("buy candy");
            System.out.println("Enjoy life");
        }
    System.out.println("The end.");
        //if not over the speedLimit
        // go shopping

        // outside if statement, say the end

    }
}
