

public class MusicStreamingApp {
    public static void main(String[] args) {

        MusicSource localFile = new LocalFile("song.mp3");
        MusicSource localFileWithFeatures = new VolumeControl(new Equalizer(localFile));
        localFileWithFeatures.play();

        System.out.println();

        MusicSource onlineService = new OnlineStreamingService("spotify.com");
        MusicSource onlineServiceWithEqualizer = new Equalizer(onlineService);
        onlineServiceWithEqualizer.play();

        System.out.println();

        MusicSource radioStation = new RadioStation("Radio 101.1 FM");
        MusicSource radioWithVolumeControl = new VolumeControl(radioStation);
        radioWithVolumeControl.play();
    }
}
