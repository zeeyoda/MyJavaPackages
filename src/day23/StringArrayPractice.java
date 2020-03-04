package day23;

import java.util.Spliterator;

public class StringArrayPractice {
    public static void main(String[] args) {
        String[] shows = {"Gifted", "Flash","Friends", "Cookies", "Hello","Candy", "Dogs"};

        int showsCount = shows.length;
        System.out.println("shows count " + showsCount);
        for (int i = 0; i < shows.length; i++) {
            // I want to know the length of each and every show
           // String currentShow = shows[i];
            // System.out.println(currentShow + " has character count: " + currentShow.length());
            System.out.println(shows[i] + " has character count: " + shows[i].length());//direct shot of printing

        }
    }
}
