package OOPs;

import java.util.ArrayList;

//17. Write a Java program to create a class called "Movie" with attributes
// for title, director, actors, and reviews, and methods for adding and retrieving reviews
class Movie
{
    private String title,director;
    public ArrayList<String> actors;
    public ArrayList<String> reviews;
    public Movie(String title,String director)
    {
       this.title=title;
       this.director=director;
       this.actors=new ArrayList<>();
       this.reviews=new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public void addActor(String actor) {
        actors.add(actor);
    }
    public void addReview(String review) {
        reviews.add(review);
    }
    public ArrayList<String> getReviews() {
        return reviews;
    }

    public String getDetails() {
        return "Title: " + title + "\nDirector: " + getDirector() + "\nActors: " + actors.toString();
    }
}
public class Oops17 {
    public static void main(String[] args) {
        Movie m=new Movie("Rx100","srija");
        m.addActor("siva");
        m.addActor("indu");
        m.addReview("super movie");
        System.out.println(m.getDetails());
        System.out.println(m.getReviews());

    }
}
