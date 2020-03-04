package ziyodaPractice;

public class Array_Reverse {
    public static void main(String[] args) {
        String[] groceryItems ={"apple","banana","grape","strawberry","blueberry","kiwi"};
        for (int x =groceryItems.length-1; x >=0 ; x--) {
            System.out.println(groceryItems[x]);
        }
        for (int i = 0; i < groceryItems.length; i++) {
            if(i%2==1){
                System.out.println(groceryItems[i]);
            }

        }
    }
}
