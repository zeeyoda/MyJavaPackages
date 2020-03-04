package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Task_1 {
    public static void main(String[] args) {
          /*
        Create an ArrayList of String to store 12 elements.
        Each element should contains product information separated by comma  :
        at index 0 -->> iPhone 6s, 499 , 18.71 and so on
         */
        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18"));

//         * Task 1 : print only items name
        System.out.println(productLst);
        for (String each: productLst) {

            String namePart = each.split(",")[0];
            System.out.println("namePart = " + namePart);
        }
        //below is for loop version of Task 1;
        for (int i = 0; i < productLst.size(); i++) {
            String namePart = productLst.get(i).split(",")[0];
        }
//         * Task 2 : print all the prices more than 500
        for (String eachProduct: productLst) {
            double price = Double.parseDouble(eachProduct.split(",")[1]);

            if(price>500){
                System.out.println("price = " + price);

            }

        }


//         * Task 3 : print average price

//         * Task 4 : print all the items name that has less than 20$ monthly payment.

//         * Task 5 : Print the monthly payments of all the iPhone no matter what model.

//         * Task 6 : Print all information about most expensive items.

//         * Task 7 : Update Dyson price to 80% off
//         *          (Monthly payment (24 month) should also be calculated accordingly)

//         * Task 8 : Count the items prices more than average price.

//         * OPTIONALLY :
//         * Task 9 : Remove all the items has more than average price.


//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :

    }
}
