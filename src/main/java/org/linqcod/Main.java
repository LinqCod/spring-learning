package org.linqcod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String... args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean(Person.class);

        MusicPlayer musicPlayer = person.getMusicPlayer();
        musicPlayer.playMusic();

        context.close();
    }
}
