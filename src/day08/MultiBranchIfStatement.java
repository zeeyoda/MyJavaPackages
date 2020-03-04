package day08;

public class MultiBranchIfStatement {
    public static void main(String[] args) {

        /*
         *given are yourCurrentSpeed, speedLimit
         * check weather the current speed is
         * more than 90 -->> jail
         * more than 80 and less than 90 -->> reckless driving
         *
         * more than 70  -->> point taken
         * more than 60 and less than 70 -->> warning
         * if not speeding then keep driving happily
         */
        int currentSpeed = 75;
        if (currentSpeed> 90) {

            System.out.println(" If you are going over 90 mph, then you go to jail");
        }else if( currentSpeed >80) {
            System.out.println(" you are fined with reckless driving");
        }else if (currentSpeed>70) {
            System.out.println("You will get 4 points on your license");
        }else if (currentSpeed>60) {
            System.out.println("You will get a warning");
        }else
            System.out.println("You are a responsible driver. Enjoy life.");



       /* int currentSpeed = 45;

        if (currentSpeed > 70) {

                System.out.println("You are speeding more than 70 --points are taken");
                //asking whether it is less than or equal to 70 and more than 60
            } else if (currentSpeed > 70) {
                //when you come to this point, ur speed is not more than 70
                System.out.println("Your speed is not less than 70, but more than 60");
            } else {
                System.out.println("Keep driving, you are good!");
            }
*/
        }
    }

