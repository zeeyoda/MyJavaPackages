package tasks;

public class Task_Array_TakeAwayElement_12_20 {
    public static void main(String[] args) {
        int[] numbers = {2, 6, 5, 4, 17, 8};
        int[] numbers2 = new int[5];
        for (int x=0; x<numbers.length-1; x++) {

            numbers2[x] = numbers[x];
            System.out.println(numbers2[x]);
        }


    }
}
