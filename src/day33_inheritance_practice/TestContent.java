package day33_inheritance_practice;

public class TestContent {
    public static void main(String[] args) {
            Movie movie = new Movie("Inception", 148, 2010,
                    "Sci-Fi", 8.8, "Christopher Nolan", 160000000, 829895144);
            movie.displayMovieSummary();
            System.out.println("Recently Released: " + movie.isRecentlyReleased(2024));
            System.out.println("High Rated: " + movie.isHighRated());

            System.out.println();

            Series series = new Series("Breaking Bad", 62, 2008,
                    "Crime", 9.5, 62, 5, false);
            series.displaySeriesSummary();
            System.out.println("Average Episode Duration: " + series.calculateAvgEpisodeDuration());
            series.markAsCompleted();
            System.out.println("Marked as Completed: " + series.isCompleted);
        }
    }
