package ziyodaPractice;

public class Array_CharCount_Grocery {
    public static void main(String[] args) {
        String[] groceries ={"apple","banana","grape","strawberry","blueberry","kiwi"};
        int charCount=groceries.length;
        char currentChar;
        for( int x=0; x<charCount; x++){

            System.out.println("The "+groceries[x]+" is in location "+groceries[x].length());
        }

    }
}
