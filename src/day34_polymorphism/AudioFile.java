package day34_polymorphism;

public class AudioFile extends MediaFile{
    private String artist;
    private int bitrate; //kbps
    public AudioFile(String title, int lengthInSeconds, String artist, int bitrate) {
        super(title, lengthInSeconds);
        this.artist = artist;
        this.bitrate = bitrate;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getBitrate() {
        return bitrate;
    }

    public void setBitrate(int bitrate) {
        this.bitrate = bitrate;
    }
    public void play() {
        System.out.println("Playing audio: " + getTitle() + " by " + artist + ", bitrate: " + bitrate + " kbps.");
    }
    public void displayAudioDetails() {
        System.out.println("getTitle() = " + getTitle());
        System.out.println("getLengthInSeconds() = " + getLengthInSeconds());
        System.out.println("artist = " + artist);
        System.out.println("bitrate = " + bitrate);
    }
}
