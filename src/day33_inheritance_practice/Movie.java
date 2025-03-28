package day33_inheritance_practice;

public class Movie extends Content{
    private String director;
    private double budget;
    private double boxOfficeGross;

    public Movie(String title, int duration, int releaseYear,
                 String genre, double rating, String director, double budget, double boxOfficeGross) {
        super(title, duration, releaseYear, genre, rating);
        this.director = director;
        this.budget = budget;
        this.boxOfficeGross = boxOfficeGross;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getBoxOfficeGross() {
        return boxOfficeGross;
    }

    public void setBoxOfficeGross(double boxOfficeGross) {
        this.boxOfficeGross = boxOfficeGross;
    }

    public double calculateProfit() {
        return boxOfficeGross - budget;
    }

    public void displayMovieSummary() {
        System.out.println("Movie: " + super.getTitle());
        System.out.println("Director: " + director);
        System.out.println("Genre: " + super.getGenre());
        System.out.println("Release Year: " + super.getReleaseYear());
        System.out.println("Rating: " + super.getRating());
        System.out.println("Profit: " + calculateProfit());
    }
}
