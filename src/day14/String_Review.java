package day14;

public class String_Review {
    public static void main(String[] args) {
         String str = " I like Pumpkin";


        System.out.println( str.equals("pumpkin"));
        //contains - checks whether a string exists in another string
        //returns true or false result
        System.out.println("Does it contain Pumpkin");
        System.out.println( str.contains("Pumpkin"));

        boolean gotPumpkin = str.contains("Pumpkin");//true
        System.out.println("gotPumpkin = " + gotPumpkin);//soutv+tab shortcut to print variable value

        //startsWith - checks whether a String starts with another string, and returns true or false result.
        //endsWith - checks whether a String ends with another String, and returns true or false result.

        boolean startedWithI = str.startsWith("I");
        System.out.println("started With I = " + startedWithI);

        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("end With Pumpkin = " + endWithPumpkin);







    }

}
