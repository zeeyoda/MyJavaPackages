package day24;

public class Array_Shopping_Practice {
    public static void main(String[] args) {
        //String[] groceryItems = new String[6];
        // String[] groceryItem = new String[]{"apple","banana","grape","strawberry","blueberry","kiwi"};
        String[] groceryItem = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        for (String eachItem : groceryItem) {
            //print arrow after each word
            System.out.println(eachItem + "-->");
        }
        //print everything in one line with arrow and do not put arrow after last one
        //assume u know last item is kiwi
        //if the fruit you are checking is kiwi, just dont add it
        //How to get the last item of any Array --->>> arr[arr.length-1]
        int itemCount = groceryItem.length;
        int lastItemIndex = itemCount - 1;
        String lastFruit = groceryItem[lastItemIndex];// another way to get last item groceryItem[groceryItem.length-1]

        for (String eachFruit : groceryItem) {
            System.out.print(eachFruit);

            // only print arrow when fruit is not the last item
            if (!eachFruit.equals(lastFruit)) {
                System.out.print("-->");
            }
        }
        System.out.println("\n");
        String[] names = {"Ziyoda","Adil","Azat","Saida","Sabira","Ablatt"};
        int namesCount = names.length;
        int lastNamesOnTheList = namesCount-1;
        String lastNameFromList = names[lastNamesOnTheList];
        for( String eachName: names){
            System.out.print(eachName);

            if(!eachName.equals(lastNameFromList) ){
                System.out.print(" * ");
            }
        }

        int[] boxes = new int[]{2, 6, 98, 78, 32};
        for( int eachBox : boxes){
            System.out.print(eachBox);
            if(eachBox != boxes.length-1){
                System.out.print(" || ");
            }
        }
    }
}



