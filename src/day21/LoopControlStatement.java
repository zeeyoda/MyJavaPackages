package day21;

public class LoopControlStatement {
    public static void main(String[] args) {

        // break
        //if line contains break reaches the loop will stop

        /*for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
            break;
        }*/
        // while iterating from 1 to 10
        //break out of the loop when it is 5
       /* for (int i = 0; i <=10; i++) {
            System.out.println(i);
            if(i==5){
                break;
            }
        } */
        //I am adding money to my bank account from day 1 till day 10
        //day 1 I add 1$
        //day 2 I add 2$
        //day 3 I add $3
        //....
        //day 10 I add 10$
        //but my bank account can only hold $40, I need to stop adding money once it reaches 40

        int sum = 0;
        int counter = 0;
        for (int x = 1; x <= 10; x++) {

            System.out.println("current sum is " + sum);
            System.out.println("If I add " + x + " dollars, it would be " + (sum + x));
            if (sum + x > 40) {
                break;// breaking out of the loop when certain condition is met
            }

            //we need to add the sum after we make sure it did not go over 40

            sum = sum + x;
        }
        //System.out.println("sum = " + sum);

        //continue
        //if line contains continue break reaches the loop it will skip to next iteration
    }
}
