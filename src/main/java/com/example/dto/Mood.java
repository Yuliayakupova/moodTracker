package com.example.dto;

import java.util.Date;

public class Mood {

    private int id;

    private String moodValue;

    private Date moodTimestamp;

    public Mood(int id, String moodValue, Date moodTimestamp) {
        this.id = id;
        this.moodValue = moodValue;
        this.moodTimestamp = moodTimestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMoodValue() {
        return moodValue;
    }

    public void setMoodValue(String moodValue) {
        this.moodValue = moodValue;
    }

    public Date getMoodTimestamp() {
        return moodTimestamp;
    }

    public void setMoodTimestamp(Date moodTimestamp) {
        this.moodTimestamp = moodTimestamp;
    }
}
