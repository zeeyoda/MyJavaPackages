package day26;

import java.util.Arrays;

public class CountItemInAnArray {
    public static void main(String[] args) {
        String[] heroes = {"Iron Man", "Captain America","Spiderman",
                            "Black Panther", "Hulk","Black Widow","Wanda","Captain Marvel",
                            "Iron Man", "Captain America","Spiderman",
                            "Black Panther", "Hulk","Black Widow","Wanda","Captain Marvel",
                            "Black Panther", "Hulk","Black Widow"}     ;

        System.out.println("Heroes "+ Arrays.toString(heroes));
        int sizeOfArray = heroes.length;

        System.out.println("Heroes count "+sizeOfArray);

        String itemToSearch = "Iron Man";
        int countOfItem = 0;
        for(String eachHero : heroes){
           // if(eachHero.equals(itemToSearch)){
            if(eachHero.toLowerCase().contains("black")){
                countOfItem++;
            }
        }
        System.out.println("Count of Item "+ countOfItem);
        System.out.println("-------------------------------");
    }
}
