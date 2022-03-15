package com.javaoo.store;

import java.util.Date;

public class CD extends Item {
    private Artist artist;
    private Date releaseDate;

    public CD(String title, double price, int quantity,
              Artist artist, Date date){
        super(title, price, quantity);
        this.setArtist(artist);
        this.setReleaseDate(date);
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
