package day12;

public class CarShopping {
    public static void main(String[] args) {
        //Buy corolla or Tesla (only if Tesla is within the budget)
        //There's only one surprise car
        //we don't know what brand it is, and the price
        //we check whether it's Toyota, if it is we buy it without checking the price
        //if it's not we check if it is a Tesla and also check whether it's w/in the budget


        String carBrand = "corolla";
        int budget = 40000;
        int carPrice = 30000;
       if(carBrand.equals("corolla")) {
           System.out.println("car acquired");
       }else if( carBrand.equals("Tesla")&& carPrice <= budget) {
           System.out.println("car acquired!");
       }else{
           System.out.println("Not what I am looking for");


       /* if (carBrand.equals("corolla") | carBrand.equals("Tesla") && carPrice <= 40000) {
        System.out.println("Car is acquired");
    }else{
            System.out.println("Not what I am looking for");
            */
        }


    }
}
