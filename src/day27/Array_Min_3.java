package day27;

public class Array_Min_3 {
    public static void main(String[] args) {

        //Right a program to find the minimum number without using the sort method

        int[] scores = {100, 56, 98, -4568, 652, 4589, 6854, -3, 75};
        int min = scores[0];
        for (int i =0; i<scores.length; i++ ){
            if(min>scores[i]){
                min = scores[i];
            }
        }
        System.out.println("Minimum number is "+min);

        //find the second minimum number
        int secondMin = scores[0];
        for(int x=0; x<scores.length; x++){
            if(scores[x]==min) {
                //if we dont want to use continue statement then we add another condition
                continue;
            }
            if(secondMin>scores[x]){
                secondMin=scores[x];
            }
        }
        System.out.println("Second minimum number is: "+secondMin);

        int thirdMin = scores[0];
        for(int k=0; k<scores.length; k++){
            if(scores[k]==min || scores[k]==secondMin){
                continue;
            }
            if(thirdMin>scores[k]){
                thirdMin = scores[k];
            }
        }
        System.out.println("Third minimum numer is "+thirdMin);
    }
}
