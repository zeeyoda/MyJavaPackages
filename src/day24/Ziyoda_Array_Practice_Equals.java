package day24;

public class Ziyoda_Array_Practice_Equals {
    public static void main(String[] args) {
         int[] nums1 = {6,5,89, 65, 6 } ;
         int[] nums2 = {5, 8, 7, 65, 23};
         boolean checkIFArraysEqual = true;
         if(nums1.length != nums2.length) {
             checkIFArraysEqual=false;
             System.out.println("Arrays are not equal. Have different amount of elements");
         }else{
             for(int i=0; i<nums1.length; i++){
                 if(nums1[i]!=nums2[i]){
                     checkIFArraysEqual=false;
                     break;
                 }
             }
         }
        System.out.println(checkIFArraysEqual);
         }

 }
