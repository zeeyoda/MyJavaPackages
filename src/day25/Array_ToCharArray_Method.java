package day25;

public class Array_ToCharArray_Method {
    public static void main(String[] args) {
        String name = "Abdulahat";
        char[] nameChar = name.toCharArray();
        int count = 0;
        for (char eachChar: nameChar){
            if(eachChar=='a'){
                count++;
        }

        }
        System.out.println("Count of a is "+count);
        System.out.println("------------------------------");

        String book = "Catch me if you can in the fields of Neverland";
        char[] bookChar = book.toCharArray();
        int counta = 0;
        int counti = 0;

        for(char eachBook: bookChar) {
            if (eachBook == 'a') {
                counta++;
            }

                if (eachBook == 'i') {
                    counti++;

            }
        }
        System.out.println("Count of 'a' is "+counta);
            System.out.println("Count of 'i' is "+counti);

    }
}
