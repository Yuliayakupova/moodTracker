package com.example.dto;

import java.util.Date;

public class Client extends UserDTO{

    public Client(int id, String login, String password, String userEmail, String userFirstName, String userLastName, String personalCode, String userGender, Date dateOfBirth, String contact, String role) {
        super(id, login, password, userEmail, userFirstName, userLastName, personalCode, userGender, dateOfBirth, contact, role);
    }
}
