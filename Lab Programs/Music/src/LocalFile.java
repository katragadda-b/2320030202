class LocalFile implements MusicSource {
    private String filePath;

    public LocalFile(String filePath) {
        this.filePath = filePath;
    }

    public void play() {
        System.out.println("Playing local file from: " + filePath);
    }
}
