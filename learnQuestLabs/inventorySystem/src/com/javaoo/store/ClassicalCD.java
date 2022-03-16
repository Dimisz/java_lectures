package com.javaoo.store;

import java.util.Date;

public class ClassicalCD extends Item {
    private String composer;
    private String[] performers = new String[5];
    private String recordingLocation;
    private Date releaseDate;
    private int performerCount = 0;

    public ClassicalCD(String title, double price, int quantity, String composer, String[] performers, String recordingLocation, Date releaseDate) {
        super(title, price, quantity);
        this.composer = composer;
        this.recordingLocation = recordingLocation;
        this.releaseDate = releaseDate;

        for(int i = 0; i < performers.length; i++){
            if(performers[i] != null){
                addPerformer(performers[i]);
            }
        }
    }

    public void showPerformers(){
        if(performerCount > 0) {
            for (int i = 0; i < performerCount; i++) {
                System.out.println(performers[i]);
            }
        }
        else{
            System.out.println("No performers on the list yet");
        }
    }


    public void addPerformer(String performer){
        if(performerCount < performers.length){
            performers[performerCount] = performer;
            performerCount++;
        }
        else {
            System.out.println("No more performers can be added!");
        }
    }



    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getRecordingLocation() {
        return recordingLocation;
    }

    public void setRecordingLocation(String recordingLocation) {
        this.recordingLocation = recordingLocation;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
