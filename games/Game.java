package games;

import java.util.ArrayList;
import reviews.Review;

public class Game {
    private String title;
    private double price;
    private String genre;
    private ArrayList<Review> reviews;

    public Game(String title, double price, String genre) {
        this.title = title;
        this.price = price;
        this.genre = genre;
        this.reviews = new ArrayList<>();
    }

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }

    public String getGenre() {
        return this.genre;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    @Override
    public String toString() {
        return "Game: " + this.title + " - Price: $" + this.price + " - Genre: " + this.genre;
    }
}
