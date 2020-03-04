package ziyodaPractice;

public class AAAAAA_Day_12 {
    public static void main(String[] args) {
        String name = "Gulnar";
        System.out.println(name.equalsIgnoreCase("gulnar"));

        int number = 44;
        if (number % 2 == 0 && number % 4 == 0) {
            System.out.println("FizzBuzz number");
        } else if (number % 2 == 0) {
            System.out.println("Fizz Number");
        } else if (number % 4 == 0) {
            System.out.println("Buzz number");
        } else {
            System.out.println("Bad Number");
        }

        String userName = "mocha";
        String password = "cookie123";

        if(userName.equals("mocha") && password.equals("cookie123")){
            System.out.println("access granted");
        }else{
            System.out.println("invalid username and/or password");
        }

        String weather = "cold";
        if(weather.equals("cold")){
            System.out.println("Winter");
        }else if(weather.equals("warm")){
            System.out.println("Spring");
        }else if(weather.equalsIgnoreCase("hOT")){
            System.out.println("Summer");
        }else if(weather.equalsIgnoreCase("raINY")){
            System.out.println("Autumn");
        }else{
            System.out.println("Planet earth doesn't have that season");
        }

        String car = "Corolla";
        int budget = 50000;
        int price = 35000;

        if(car.equals("Corolla") || car.equalsIgnoreCase("Tesla") && price<=budget){
            System.out.println("I will buy this car");
        }else{
            System.out.println("I will come back when you have a discount");
        }


    }

}
