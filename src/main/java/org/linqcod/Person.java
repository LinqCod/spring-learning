package org.linqcod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    private MusicPlayer musicPlayer;

    public Person(@Value("${person.name}") String name) {
        this.name = name;
    }

    @Autowired
    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public MusicPlayer getMusicPlayer() {
        return this.musicPlayer;
    }
}
