class RadioStation implements MusicSource {
    private String stationName;

    public RadioStation(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public void play() {
        System.out.println("Tuning into radio station: " + stationName);
    }
}
