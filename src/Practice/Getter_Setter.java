package Practice;

public class Getter_Setter {
    private String title;
    private String director;
    private String rating;

    public Getter_Setter(String title, String director, String rating) {
        this.setRating(rating);
        this.setDirector(director);
        this.setTitle(title);

    }

    public String getTitle() {
        return title;
    }
    public String getDirector(){
       return director;
    }
    public String getRating(){
        return rating;
    }

    public void setRating(String rating) {
        if (rating.equals("PG") || rating.equals("PG-13") || rating.equals("R") || rating.equals("G")) {
            this.rating = rating;
        } else {
            this.rating = "Not Rated";
        }
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setDirector(String director){
        this.director = director;
    }

    @Override
    public String toString() {
        return "Getter_Setter{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}

class Movie{
    public static void main(String[] args) {
        Getter_Setter obj = new Getter_Setter("Frozen","Anne Hathaway","NR");
       obj.setRating("Dog");
        System.out.println(obj);

        obj.setDirector("Mike");
        System.out.println(obj);

        obj.setTitle("Blast");
        System.out.println(obj);



    }
}
