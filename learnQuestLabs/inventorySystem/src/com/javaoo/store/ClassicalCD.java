package com.javaoo.store;

import java.util.Date;

public class ClassicalCD extends Item {
    private String composer;
    private String[] performers = new String[5];
    private String recordingLocation;
    private Date releaseDate;
    private int performerCount = 0;

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
