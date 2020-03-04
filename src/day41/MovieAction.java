package day41;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieAction {
    public static void main(String[] args) {
       // Movie m1 = new Movie();
        //System.out.println("m1 = " + m1);
        Movie m1 = new Movie("Cars",1.3, "Family");
        Movie m2 = new Movie("Speed",2.2, "Action");
        Movie m3 = new Movie("Frozen2", 1.5, "Family");
        Movie m4 = new Movie("Cake", 0.5,"Family");
        Movie m5 = new Movie("Scooby-Doo", 2.05, "Family");
        Movie m6 = new Movie("Sabrina", 2.10, "Romance");
        Movie m7 = new Movie("Karate", 2.4, "Action");
        Movie m8 = new Movie("Zoo", 1.5, "Family");
        Movie m9 = new Movie("Dragon", 3.0, "Action");
        Movie m10 = new Movie("Munchkins", 2.1, "Family");

        //System.out.println("m2 = "+m2);
        //System.out.println("m3 = "+m3);
        //System.out.println("m4 = "+m4);
        //System.out.println(m2.getName());
/*Add Setters to Movie Class
Create List<Movie> yourFavoriteMovieLst  add 10 Movie Objects
Print the name of the movies less than 2 hours
Print all the Action movies
If any Movie is longer than 2 hours Update the movie type to  Long(MovieType)
     for example : if type was Action -->> LongAction , Drama--> LongDrama
Find out longest Movie name
 */
        ArrayList<Movie> movies = new ArrayList<>(Arrays.asList(m1,m2,m3,m4, m5, m6, m7, m8, m9, m10));
        for (Movie each: movies) {
            if(each.getLength()>2){
                each.setType("Long"+each.getType());

            }
                    }
        System.out.println(movies);





    }
}
