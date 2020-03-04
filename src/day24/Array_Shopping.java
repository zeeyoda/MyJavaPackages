package day24;

public class Array_Shopping {
    public static void main(String[] args) {
        //create a String array of 6 items to store GroceryItem
        //{"apple","banana","grape","strawberry","blueberry","kiwi"}
        //create a float array 6 float values to store prices
        //{ 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  }
        //String[] groceryItems = new String[6];
        String[] groceryItems ={"apple","banana","grape","strawberry","blueberry","kiwi"};
        for (String fruit: groceryItems) {
            System.out.print(fruit);
            System.out.println("-->");
        }// print everything in one line with arrow and do not put arrow after last one
            //
            //array[arr.length-1]
            int itemCount = groceryItems.length;
            int lastItemIndex = itemCount-1;
            String lastFruit = groceryItems[lastItemIndex];//groceryItems[groceryItems.length-1]
            for(String eachFruit: groceryItems){
                System.out.println(eachFruit);
                //only print arrow when the fruit is not last item
                if(!eachFruit.equals(lastFruit)){
                    System.out.println("-->");
                }
            }

        }
    }

