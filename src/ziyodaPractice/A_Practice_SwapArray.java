package ziyodaPractice;
import java.util.Arrays;


public class A_Practice_SwapArray {
    public static void main(String[] args) {
        int [] arr1= {13,5,7,18,15,25,35};
        int[] arr2=new int [7];
        for (int i =arr1.length-1, j=0; i >=0 ; i--,j++) {
            arr2[j]=arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
