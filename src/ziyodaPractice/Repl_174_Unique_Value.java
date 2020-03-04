package ziyodaPractice;

public class Repl_174_Unique_Value {
    public static void main(String[] args) {
        int[] nums ={11,11,11,22,22,22,33,33,33,11, 15, 19};
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count ++;
                }

            }
            if(count==1){
                System.out.println(nums[i]);
            }

        }
    }
}
