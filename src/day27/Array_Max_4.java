package day27;

public class Array_Max_4 {
    public static void main(String[] args) {

        // find the maximum number without using the sort method
        int[] nums = {65, 25, 165, 102, 5, 89, 97};
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i]){
                max=nums[i];
            }

        }
        System.out.println("The maximum number is "+max);

        //finding the second max number

        int secondMax = nums[0];
        for(int x=0; x<nums.length; x++){
            // instead of using the && method we can also use continue condition instead
            if(secondMax<nums[x] && nums[x] != max){
                secondMax = nums[x];
            }
        }
        System.out.println("The second largest number is "+secondMax);

    }
}
