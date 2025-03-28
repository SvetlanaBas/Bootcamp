package day34_polymorphism;

public class VideoFile extends  MediaFile{
    private String resolutions;
    private double frameRate;

    public VideoFile(String title, int lengthInSeconds, String resolutions, double frameRate) {
        super(title, lengthInSeconds);
        this.resolutions = resolutions;
        this.frameRate = frameRate;
    }

    public String getResolutions() {
        return resolutions;
    }

    public void setResolutions(String resolutions) {
        this.resolutions = resolutions;
    }

    public double getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(double frameRate) {
        this.frameRate = frameRate;
    }
    public void play() {
        System.out.println("Playing video: " + getTitle() + ", resolution: " + resolutions + ", framerate: " + frameRate + " fps.");
    }
    public void displayVideoDetails() {
        System.out.println("getTitle() = " + getTitle());
        System.out.println("getLengthInSeconds() = " + getLengthInSeconds());
        System.out.println("resolutions = " + resolutions);
        System.out.println("frameRate = " + frameRate);
    }
}
