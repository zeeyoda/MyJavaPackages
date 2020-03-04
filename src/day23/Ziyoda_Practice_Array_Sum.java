package day23;

public class Ziyoda_Practice_Array_Sum {
    public static void main(String[] args) {
        int[] bills = new int[]{456, 956, 789, 852, 325};
        int sum = 0;
        int average = 0;
        int itemCount = bills.length;
        for( int x=0; x<bills.length; x++){
            int currentItem = bills[x];
            sum=sum+bills[x];
        }
        System.out.println(" Sum of all the numbers is: "+sum);
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("Average bill is "+ sum/itemCount);
    }
}
