package day25;

public class Ziyoda_Array_Sorting {
    public static void main(String[] args) {

        int[] nums = {5, 8, 7, 3, 4};
        //int[] nums = {5, 6, 7, 8};
        boolean isSorted = true;
        for(int x=0; x<nums.length-1; x++) {
            System.out.println("Is " + nums[x] + " less than " + nums[x + 1] + " ? " + (nums[x] < nums[x + 1]));

            if (!(nums[x] < nums[x + 1])) {
                System.out.println("Array is not sorted");
                isSorted = false;
                break;
            }


            System.out.println("Array is sorted " + isSorted);
        }
    }
}
