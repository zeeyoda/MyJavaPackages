package OfficeHour;

public class Repl_152 {
    public static void main(String[] args) {


    }
    public static void plus_minus(int[] arr){
        int countNeg = 0;
        int countPos = 0;
        int countZero = 0;
        for(int x=0; x<arr.length; x++){
            if(arr[x]<0){
                countNeg++;
            }
            if(arr[x]>0){
                countPos++;
            }
            if(arr[x]==0){
                countZero++;
            }
        }
        System.out.println("positive: "+countPos+", negative: " +countNeg+", zero: "+countZero);
    }
}
