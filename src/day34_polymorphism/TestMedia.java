package day34_polymorphism;

public class TestMedia {
    public static void main(String[] args) {
        MediaFile mediaFile = new MediaFile("Cool", 23);
        AudioFile audioFile1 = new AudioFile("Year", 60, "Alice", 120);
        AudioFile audioFile2 = new AudioFile("Century", 40, "John", 150);
        VideoFile videoFile1 = new VideoFile("Movie", 1200, "1080p", 40.0);
        VideoFile videoFile2 = new VideoFile("Scene", 3400, "360p", 60.0);

        MediaFile[] files = {mediaFile, audioFile1, audioFile2, videoFile1, videoFile2};
        for (MediaFile file : files) {
            file.play();
        }

    }
}

