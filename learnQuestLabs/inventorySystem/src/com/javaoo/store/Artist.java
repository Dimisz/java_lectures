package com.javaoo.store;

public class Artist {
    private String name;
    private String[] memberNames = new String[20];
    private String[] memberInstruments = new String[20];

    public Artist(String name){
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
