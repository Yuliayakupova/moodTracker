package com.example.dto;

import java.util.Date;

public class Mood {

    private int id;

    // Mood from 1 to 7
    private String moodType;

    private Date moodTimestamp;

    public Mood(int id, String moodType, Date moodTimestamp) {
        this.id = id;
        this.moodType = moodType;
        this.moodTimestamp = moodTimestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMoodType() {
        return moodType;
    }

    public void setMoodType(String moodType) {
        this.moodType = moodType;
    }

    public Date getMoodTimestamp() {
        return moodTimestamp;
    }

    public void setMoodTimestamp(Date moodTimestamp) {
        this.moodTimestamp = moodTimestamp;
    }
}
