package day33;

public class Return_Number_Actions_2 {
    public static void main(String[] args) {

        System.out.println(getSumFrom1toX(10));
        System.out.println(build_GOT_Email("Ziyoda", "Ablatt"));

        String fullName = "Susan Jones";
        //store this resulting email
       // String part1 = fullName.split(" ")[0];
        //String part2 = fullName.split(" ")[1];
        //String herEmail = build_GOT_Email(part1, part2);
       String[] fullNameSplit = fullName.split(" ");
       String herEmail = build_GOT_Email(fullNameSplit[0],fullNameSplit[1]);
       System.out.println("herEmail = "+herEmail);
    }
    /*getSumFrom1toX
     * this method should calculate the sum
     * the numbers from 1 to the number passed
     * @param  i final number to be added
     * @return the sum of the numbers from 1 to x(Final Number)
     */
    public static int getSumFrom1toX(int num ){
        int sum = 0;
        for (int x=1; x<=num; x++){
            sum+= x;
        }
        return sum;
    }
    /* build_GOT_Email
    This method should build email using user's first and last name
    for example Jon Snow --->> JSnow@NightWatch.com
    @param firstName user's first name
    @param lastName  user's last name
    @return the email created using
    firstName initial+lastname+@NightWatch.com
    */
    public static String build_GOT_Email(String fName, String lName){

        //String email = fName.substring(0,1)+lName+"@NightWatch.com";
        //String email = fName.charAt(0)+lName+"@NightWatch.com";
        //return email;
        return fName.charAt(0)+lName+"@NightWatch.com";


    }
}

