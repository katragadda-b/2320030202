class VolumeControl extends MusicSourceDecorator {
    public VolumeControl(MusicSource decoratedMusicSource) {
        super(decoratedMusicSource);
    }

    @Override
    public void play() {
        decoratedMusicSource.play();
        setVolume();
    }

    private void setVolume() {
        System.out.println("Volume set to a comfortable level.");
    }
}
