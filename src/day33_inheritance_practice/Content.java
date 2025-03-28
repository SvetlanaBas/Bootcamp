package day33_inheritance_practice;

public class Content {
    private String title;
    private int duration;
    private int releaseYear;
    private String genre;
    private double rating;

    public Content(String title, int duration, int releaseYear, String genre, double rating) {
        this.title = title;
        this.duration = duration;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isRecentlyReleased(int currentYear) {
        return (currentYear - releaseYear) <= 2;
    }

    public boolean isHighRated() {
        return rating >= 8.0;
    }
}
