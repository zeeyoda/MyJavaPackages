package day27;

public class Ziyoda_Array_Practice_Min_Max {
    public static void main(String[] args) {
        int[] scores = {256, 98, -8, -45, 65};
        int min = scores[0];
        int secondMin = scores[0];
        int max = scores[0];
        //finding min number
        for (int x=0; x<scores.length; x++){
            if(scores[x]<min){
                min=scores[x];
            }
        }
        System.out.println("Minimum number is "+ min);
        //finding the secondMin number

        for (int k = 0; k < scores.length ; k++) {
            if(scores[k]==min){
                continue;
            }
            if ( scores[k]<secondMin){
                secondMin=scores[k];
            }
        }
        System.out.println("Second minimum number is: "+secondMin);

        System.out.println("------------------------------------");
        for (int i = 0; i <scores.length ; i++) {
            if(scores[i]>max) {
                max = scores[i];
            }
        }
        System.out.println("The maximum number is: "+max);
        System.out.println("------------------------------------------------");
        int secondMax = scores[0];
        for (int j=0; j<scores.length; j++){
            //if(scores[j]==max){
            //    continue;
            //}
            //if(scores[j]>secondMax){
            if(scores[j]>secondMax && scores[j] != max){
            secondMax=scores[j];
            }
        }
        System.out.println("The second max number is: "+secondMax);
    }
}
