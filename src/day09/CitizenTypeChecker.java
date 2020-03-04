package day09;

public class CitizenTypeChecker {

    public static void main(String[] args) {
        String citizenType;

        int age = 60;
        if(age>65) {
            citizenType = "Senior";
            System.out.println("You are a senior citizen");
        }else{
            citizenType = "Not a Senior";
            System.out.println("You are not a senior citizen");
        }
        System.out.println("The citizen age is " + age +" ,and he is a " + citizenType);
    }
}
