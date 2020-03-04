package day24;

import java.util.Arrays;

public class ArraysClassMethod_toString {
    public static void main(String[] args) {
        String[] superHeroes = {"Batman", "Wonderwoman", "Captain America",};
        System.out.println(Arrays.toString(superHeroes));
        // saving the String  result into a variable and print
        String savingSuperHeroesAsString = Arrays.toString(superHeroes);
        System.out.println(savingSuperHeroesAsString);

        //how do we get the first character of superHeroesString variable
        System.out.println(savingSuperHeroesAsString.charAt(0));

        int[] numbers = {35, 45, 69, 87, 32, 78};
        System.out.println(Arrays.toString(numbers));
    }
}
