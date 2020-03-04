package day10;

public class MultiBranch_Practice {
    public static void main(String[] args) {

        String order = "";
        int itemNumber = 35;

        switch (itemNumber){

            case 11 :
            System.out.println("you have selected 11");
            order = "burger";
            break;// if break does not show u here, it will move on to next case
            case 5:
            System.out.println("you have selected 5");
            order = "fries";
                break;
            case 8:
                System.out.println("you have selected 8");
             order = "chai";
             break;
            case 35 :
                System.out.println("you have selected 35");
                order = "water";
                break;
            default:
                System.out.println("We do not have the selected item");
        }


       /* System.out.println("Welcome to McDonalds. What would you like to order? ");
        //11 Burger
        //5 French Fries
        //8 Nuggets
        //35 Ice Cream
        //55 Coke

        String order = "";
        int itemNumber = 35;
        if (itemNumber == 1) {
            System.out.println("You have selected 11");
            order = "Burger";
        } else if (itemNumber == 5) {
            System.out.println("Your have selected 5");
            order = "French Fries";
        } else if (itemNumber == 8) {
        System.out.println("You have selected 6");
        order = "Ice Cream";
        }else if(itemNumber == 4) {
            System.out.println("You have selected 4");
            order = "Coffee";
        }else{
            System.out.println("you have selected unknown");
            order = "unknown";
        }*/
    }
}
