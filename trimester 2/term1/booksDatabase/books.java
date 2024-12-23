package booksDatabase;

public class books {
    String title;
    String author;
    double userRating;
    int reviews;
    int price;
    int year;
    String genre;

    public books(String title, String author, double userRating, int reviews, int price, int year, String genre) {
        this.title = title;
        this.author = author;
        this.userRating = userRating;
        this.reviews = reviews;
        this.price = price;
        this.year = year;
        this.genre = genre;
    }
}
