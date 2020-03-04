package day43;
import day42.Movie;

public class MovieActions {
    public static void main(String[] args) {
        Movie m1 = new Movie("Joker", 2.5, "Drama");
        Movie m2 = new Movie("Cinderella", 1.5, "Family");
        printMovieInformation(m1);
        printMovieInformation(m2);
        printShorterDurationMovieName(m1, m2);
        //Below we are only getting the name of the movie
        Movie result = getJokerMovieObject();
        System.out.println("Name of the movie is "+result.getName());
    }
   public static Movie getJokerMovieObject(){
       Movie j = new Movie("Joker", 2.3, "Horror");
        return j;
   }
    public static void printMovieInformation(Movie movieobj){
        System.out.println("The movie name "+movieobj.getName());
        System.out.println("The length is "+movieobj.getLength());
        System.out.println("The genre is "+movieobj.getGenre());
    }
    public static void printShorterDurationMovieName(Movie movieObj1, Movie movieObj2){
        if(movieObj1.getLength()<movieObj2.getLength()){
            System.out.println(movieObj1.getName());
        }else{
            System.out.println(movieObj2.getName());
        }
    }
}

