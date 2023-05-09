package com.example.dto;

import java.util.Date;

public class Doctor extends UserDTO{

    private String specialization;

    public Doctor(int id, String login, String password, String userEmail, String userFirstName, String userLastName, String personalCode, String userGender, Date dateOfBirth, String contact, String role) {
        super(id, login, password, userEmail, userFirstName, userLastName, personalCode, userGender, dateOfBirth, contact, role);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
