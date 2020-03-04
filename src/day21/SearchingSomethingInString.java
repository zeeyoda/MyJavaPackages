package day21;

public class SearchingSomethingInString {
    public static void main(String[] args) {
        //find out index of all letter a in case insensitive manner
        //go through each and every letter of the String --> for loop
        // --> every character I can use substring (0,1) and so on
        // --> going from 0 to last character -->> for loop
        //while going through each and every character
        // check whether current character I am looking at
        //equals a or A ---> currentCharacter.equals.IgnoreCase("a");
        // if so I will print the index
        //if not just move on
        //perform this action until I reach last character if I go over last character index I will stop

       /* String name = "Ahil Abduvahid Ahmad";
        int lastCharindex = name.length();
        for (int i = 0; i < lastCharindex; i++) {
            String currentChar = name.substring(i, i + 1);
            if (currentChar.equalsIgnoreCase("a")) {
                System.out.println("The index of a or A " + i);
            }
           */
        //finding ah in the String ( finding 2 characters) 
       /* String name1 = "Ahil Abduvahid Ahmad";
        int lastCharIndex1 = name1.length();
        for (int k = 0; k <= lastCharIndex1 - 2; k++) {
            String currentTwoChar = name1.substring(k, k + 2);
            if (currentTwoChar.equalsIgnoreCase("ah")) {
                System.out.println("The index of a or A " + k);
            }
        }*/
        // finding 3 characters

        String name1 = "Ahil Abduvahid Ahmad";
        int lastCharIndex1 = name1.length()-1;
        int charCount = name1.length();
        int counter = 0;
        for (int k = 0; k <= lastCharIndex1 - 3; k++) {
            String currentThreeChar = name1.substring(k, k + 3);
            if (currentThreeChar.equalsIgnoreCase("duv")) {
                System.out.println("The index of duv " + k);
                counter += 1;
                //counter ++;            }
            }
        }
            System.out.println("counter = " + counter);
        String expression = "I like lavas in Lavaland";
        String storageExp = "";
        int lastCharIndex2 = expression.length();
        int charCount1 = lastCharIndex2;
        int counter2 = 0;
        for(int m=0; m<=lastCharIndex2-2; m++) {
            String twoExpression = expression.substring(m, m + 2);
            if (twoExpression.equalsIgnoreCase("la")) {
                System.out.println("The index of la is " + m);
                counter2++;
            }
        }
            System.out.println("counter2 = " + counter2);

        }

            }





