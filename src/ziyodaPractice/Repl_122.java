package ziyodaPractice;

public class Repl_122 {
    public static void main(String[] args) {
        //Given an array nums with 7 integers
        // every element is repeated twice - except one. Find that element
        // and print it to console.

        int[] nums = {1, 1, 2, 3, 4, 3, 4 };

        for (int i=0; i<nums.length; i++) {
            int count = 0;
            for (int k = 0; k < nums.length; k++) {
                if (nums[i] == nums[k]) {
                    count++;

                }
            }
            if (count == 1) {

                System.out.println(nums[i]);
                System.out.println("--------------------------------");
            }
        }

         int[] sizes = { 25, 85, 36, 45, 25, 36};
         for(int x=0; x<sizes.length; x++){
          int counter = 0;
          for(int m=0; m<sizes.length; m++) {
              if (sizes[x] == sizes[m]) {
                  counter++;
              }
          }
              if (counter == 1) {
              System.out.println(sizes[x]);
          }

         }


                /*int count=0;
    for( int i: nums){
      for( int j: nums){
        if(i==j)
        count++;
      }
    }
      if(count<2){
        System.out.println(i);
      }
      count=0;*/
            }
        }




