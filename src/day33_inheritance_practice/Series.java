package day33_inheritance_practice;

public class Series extends Content {
    private int episodes;
    private int seasons;
   boolean isCompleted;

    public Series(String title, int duration, int releaseYear,
                  String genre, double rating, int episodes, int seasons, boolean isCompleted) {
        super(title, duration, releaseYear, genre, rating);
        this.episodes = episodes;
        this.seasons = seasons;
        this.isCompleted = isCompleted;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
    public double calculateAvgEpisodeDuration() {
        return (double) episodes / seasons;
    }

    public void markAsCompleted() {
        isCompleted = true;
    }

    public void displaySeriesSummary() {
        System.out.println("Series: " + super.getTitle());
        System.out.println("Genre: " + super.getGenre());
        System.out.println("Release Year: " + super.getReleaseYear());
        System.out.println("Rating: " + super.getRating());
        System.out.println("Seasons: " + seasons);
        System.out.println("Episodes: " + episodes);
        System.out.println("Completed: " + isCompleted);
    }
}
