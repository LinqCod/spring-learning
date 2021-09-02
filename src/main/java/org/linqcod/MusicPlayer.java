package org.linqcod;

public class MusicPlayer {
    private Music music;

    private String name;
    private float volume;

    public MusicPlayer() {

    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public Music getMusic() {
        return this.music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getVolume() {
        return this.volume;
    }

    public void playMusic() {
        System.out.printf("Now is playing music of type: %s\n", music.getType());
    }
}
