class OnlineStreamingService implements MusicSource {
    private String url;

    public OnlineStreamingService(String url) {
        this.url = url;
    }

    @Override
    public void play() {
        System.out.println("Streaming music from: " + url);
    }
}
