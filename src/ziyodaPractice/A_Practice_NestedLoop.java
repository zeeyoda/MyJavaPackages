package ziyodaPractice;

public class A_Practice_NestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i*j)+" ");
            }
            System.out.println();
        }
        System.out.println("======================================================================");
        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=2 ; j++) {
                System.out.println((i*j)+" ");

            }
        }
        System.out.println();
        System.out.println(("*****************************************************************"));
        for (int i = 1; i <=2 ; i++) {
            for (int j = 1; j <=3 ; j++) {
                System.out.println(i+" "+j+" six");
             }
        }
        System.out.println();
        System.out.println("Printing stars");
        for (int i = 0; i <=5 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*"+" ");

            }
            System.out.println();
            }
        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");

            }
            System.out.println();

        }

    }
}
