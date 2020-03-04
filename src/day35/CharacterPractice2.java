package day35;

public class CharacterPractice2 {
    public static void main(String[] args) {

        String str = "A34B123C4X";
        //task - from above task get the numbers and get the sum
        //optionally create a method
        //for each char in String check if it is number
        //if yes store in a String and use that string to get Integer
        // then sum it up
        char myChar = '7';
        //get int 7
        int myNum = Integer.parseInt(myChar+"");
        System.out.println("myNum = "+myNum);

        //Character.toString(myChar);
        //String.valueOf(myChar);

        char[] allChars = str.toCharArray();
        int sum = 0;
        for (char eachChar: allChars){
            // checking whether eachChar is a number or not
            if( Character.isDigit(eachChar)) {
                System.out.println(eachChar);
                //then turn it into int using parseInt method
                //parseInt only accept String
                //so we need to pass String by adding "" to each
                int eachNum = Integer.parseInt(eachChar+"");
                // now we can numerically add the number to sum
                sum+=eachNum;

            }

        }
        System.out.println(sum);
    }
}
