package day13;

public class WarmUp_AmazonShippingCalculator2 {
    public static void main(String[] args) {
        //create a boolean to store the result of doYouWantToShop
        //if yes, do you want to go to the store or shop online
        // if user doesn't wish to shop, print good job, stay home coding


        boolean youWantToShop = false ;
        String preference = "Store";

        //if(youWantToShop)
        if( youWantToShop == true ) {

            if (preference.equals("Store")) {
                System.out.println("Going to store to shopping");
            } else {
                System.out.println("Doing online shopping");
            }
        }else {
            System.out.println("Good job stay home");
            }
        }

    }

