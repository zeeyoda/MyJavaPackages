package OfficeHour;

public class Practice_12_10 {
    public static void main(String[] args) {
        String[] cars ={"bmw", "Tesla", "Audi"};

        //for loop is used to print all the value at once
        for(String carModel : cars){
            System.out.println("I am done assigning the car "+carModel);
        }
        int[] ages = {23, 43, 5, 7, 87};
        System.out.println( ages[2]);// this is used when I can to print the 2nd index
        System.out.println(ages[3]-ages[2]);//this is when we want to print 2
        //in order to print every value at once we use for each value
        for(int ageOfStudent : ages){
            System.out.println(" age of a student is: "+ageOfStudent);
            System.out.println("I am done");
        }
    }
}
