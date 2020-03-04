package day16;

public class Count_10_1 {
    public static void main(String[] args) {
        //I want to start with 10 and decrease the value by one
        //so that I can get out of the loop
       /* int count = 10;
       while ( count >=1 ) {
          System.out.println(count);
           --count;
       }*/
        int count = 10 ;
        while ( count !=0){
            System.out.println(count);
            --count;
        }
        System.out.println("Final value of count is " + count);

    }
}
