package day34_polymorphism;

public class MediaFile {
    private String title;
    private int lengthInSeconds;

    public MediaFile(String title, int lengthInSeconds) {
        this.title = title;
        this.lengthInSeconds = lengthInSeconds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public void setLengthInSeconds(int lengthInSeconds) {
        this.lengthInSeconds = lengthInSeconds;
    }
    public void play() {
        System.out.println("Media play");
    }
}
