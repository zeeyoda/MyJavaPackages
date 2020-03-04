package OfficeHour;

public class Practice_12_27_1 {
    public static void main(String[] args) {
        oddOrEven(101);

    }
    public static void oddOrEven(int number){
        if(number%2==0){
            System.out.println(number+" is even");
            return;
        }
        System.out.println(number+" is odd number");
    }
}
