package day23;

public class Ziyoda_Array_Min_Max {
    public static void main(String[] args) {
        int[] bills = new int[]{456, 956, 789, 852, 325};
        int max = bills[0];
        int min = bills[0];
        for (int index = 0; index < bills.length; index++) {

            if (bills[index] > max)
                max = bills[index];
            if (bills[index] < min)
                min = bills[index];
        }
        System.out.println("The maximum amount of all bills is: " + max);
        System.out.println("The minimum amount of all bills is: " + min);
    }
}
