package day19;

public class FindingTheCountOfSomething {
    public static void main(String[] args) {
        //you do this
        //from 1-100 print out all the numbers that can be divided by 15 without remainder
        // do this together
        // from 1-100 count how many numbers can be divided by 15

        int counter = 0;
        for( int x = 1; x <=100; x++){
            if(x%15 == 0){
                System.out.println(x);
                //counter = counter +1;
                //counter += 1;
                ++counter;
        }
    }
        System.out.println("counter = " + counter);

        //given a String with value find out how many a showed up in this String
        String name = "Esra Fidan";

        System.out.println(name.charAt(0) == 'a');

        int countOfA = 0;

        for( int index = 0; index < name.length(); index++){
            System.out.print( name.charAt( index ));
            char currentChar = name.charAt(index);
            if(currentChar == 'a'){
                System.out.println("Bingo Found It!!");
                ++countOfA;
            }
        }
        System.out.println("countOfA = " + countOfA);
}
}
