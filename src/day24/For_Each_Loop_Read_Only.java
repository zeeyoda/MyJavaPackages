package day24;

public class For_Each_Loop_Read_Only {
    public static void main(String[] args) {

        int yourFavNumber = 300;
        int myFavNumber = yourFavNumber;

        myFavNumber = 299;
        System.out.println(yourFavNumber);

        long[]num = {10, 40, 20};
        num[0] = num[0]*2;//num[0]*=2
        //how do I double only the first item in the array
        for (int x = 0; x <3 ; x++) {
            long eachItem = num[x];
            eachItem = 100;
        }
        for(long eachItem : num){
            eachItem = 100;//never use for each loop for modify array items

           // num[x]=num[x]*2;here we are doubling the value of each item
            System.out.println("After we modify the value");
        for (int x = 0; x < 3; x++) {
            System.out.println(num[x]);

        }

        }
}


    }

