package day21;

public class LoopControlStatement2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10 ; i++) {
            if(i%2==1){
                continue;
            }
            System.out.print(i);
            System.out.println();
        }
        //below print all numbers unless divisible by 11
        for ( int x = 11; x<=80; x++){
            if(x%11!=0){
                continue;
            }
            System.out.println(x);
        }
    }
}
