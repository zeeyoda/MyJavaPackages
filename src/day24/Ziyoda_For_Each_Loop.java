package day24;

public class Ziyoda_For_Each_Loop {
    public static void main(String[] args) {

        int myFavouriteNumber = 300;
        int yourFavNumber = myFavouriteNumber;
        yourFavNumber = 315;
        System.out.println(myFavouriteNumber);
        System.out.println(yourFavNumber);

        long[] num = {10, 30, 50};
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]*2);//this wont change the actual value of the array
        }
        for(long eachNum: num){
            eachNum=100;//we changed the value of each item to 100
            System.out.println(eachNum);
        }

    }
}
