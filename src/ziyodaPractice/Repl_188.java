package ziyodaPractice;

public class Repl_188 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,};
        System.out.println(findMax(arr));
        double[]x={10.0,25.9,33.7};
        System.out.println(findMax(x));
    }

    public static double findMax(double[]y) {
        double max=y[0];
        for(double each: y){
            if(each>max){
                max=each;
            }
        }
        return max;

    }
    public static int findMax(int[]x) {
        int max=x[0];
        for(int each: x){
            if(each>max){
                max=each;
            }
        }
        return max;
    }
}
