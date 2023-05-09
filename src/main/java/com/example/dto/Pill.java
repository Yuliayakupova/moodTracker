package com.example.dto;

import java.util.Date;

public class Pill {

    private int id;

    private String pillName;

    private String pillDosage;

    private Date pillTimestamp;

    public Pill(int id, String pillName, String pillDosage, Date pillTimestamp) {
        this.id = id;
        this.pillName = pillName;
        this.pillDosage = pillDosage;
        this.pillTimestamp = pillTimestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPillName() {
        return pillName;
    }

    public void setPillName(String pillName) {
        this.pillName = pillName;
    }

    public String getPillDosage() {
        return pillDosage;
    }

    public void setPillDosage(String pillDosage) {
        this.pillDosage = pillDosage;
    }

    public Date getPillTimestamp() {
        return pillTimestamp;
    }

    public void setPillTimestamp(Date pillTimestamp) {
        this.pillTimestamp = pillTimestamp;
    }
}
