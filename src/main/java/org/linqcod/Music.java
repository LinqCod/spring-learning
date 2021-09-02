package org.linqcod;

enum Genre {
    CLASSICAL, ROCK, JAZZ
}

public class Music {
    private Genre genre;

    private String name;
    private String author;

    public Music(String name, String author, Genre genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

}
