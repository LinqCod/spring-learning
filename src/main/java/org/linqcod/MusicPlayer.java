package org.linqcod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> musicPlaylist;

    @Value("${musicPlayer.model}")
    private String model;
    @Value("${musicPlayer.volume}")
    private float volume;

    public MusicPlayer() {
        initDefaultPlaylist();
    }

    public void addMusicToPlaylist(Music music) {
        musicPlaylist.add(music);
    }

    public void initDefaultPlaylist() {
        musicPlaylist = new ArrayList<>();

        musicPlaylist.add(new Music("jude", "awdfg", Genre.ROCK));
        musicPlaylist.add(new Music("adwwdw", "vafwwf", Genre.JAZZ));
        musicPlaylist.add(new Music("awdfeg", "afegh", Genre.CLASSICAL));
    }

    public String getModel() {
        return this.model;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getVolume() {
        return this.volume;
    }

    public void playMusic() {
        for (Music music: musicPlaylist) {
            System.out.printf("Playing song: %s\n", music.getName());
        }
    }
}
