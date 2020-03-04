package day31;

public class Method_Practice_6_OddNumber {
    public static void main(String[] args) {
        printOddNumbers1to100();

    }
    public static void printOddNumbers1to100(){
        for (int i=1; i<=100; i++){
            if(i%2==1){
                System.out.println(i+" ");
                System.out.println();
            }
        }
    }
}
