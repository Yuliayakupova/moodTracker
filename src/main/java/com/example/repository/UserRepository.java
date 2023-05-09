package com.example.repository;

import com.example.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Repository
@Service
public class UserRepository {

//    String SQL_CREATE_USER = "CREATE TABLE User ("
//            + "user_id INTEGER PRIMARY KEY, "
//            + "user_login VARCHAR(50), "
//            + "user_password VARCHAR(50), "
//            + "user_email VARCHAR(100), "
//            + "user_firstName VARCHAR(50), "
//            + "user_lastName VARCHAR(50), "
//            + "user_personalCode CHAR(12)"
//            + "user_gender VARCHAR(50), "
//            + "user_dateOfBirth DATETIME, "
//            + "user_contact VARCHAR(50), "
//            + "role VARCHAR(10) "
//            + ");";

    private final String  SQL_INSERT_USER = "INSERT INTO User (user_login, user_password, user_email, user_personalCode, user_firstName, user_lastName, user_gender, user_dateOfBirth, user_contact, role)\n" +
            "VALUES (:USER_ID, :USER_LOGIN, :USER_PASSWORD, :USER_EMAIL, :USER_FIRSTNAME, :USER_LASTNAME, :USER_PERSONALCODE, :USER_GENDER, :USER_DATEOFBIRTH, :USER_CONTACT, :ROLE);";

    @Autowired
    private final JdbcTemplate connection;

    public UserRepository(JdbcTemplate connection) {
        this.connection = connection;
    }

    public void insertUserData(final UserDTO user) {
        Map<String, Object> params = new HashMap<>();
        params.put("USER_ID", user.getId());
        params.put("USER_LOGIN", user.getLogin());
        params.put("USER_PASSWORD", user.getPassword());
        params.put("USER_EMAIL", user.getUserEmail());
        params.put("USER_FIRSTNAME", user.getUserFirstName());
        params.put("USER_LASTNAME", user.getUserLastName());
        params.put("USER_PERSONALCODE", user.getPersonalCode());
        params.put("USER_GENDER", user.getUserGender());
        params.put("USER_DATEOFBIRTH", user.getDateOfBirth());
        params.put("USER_CONTACT", user.getContact());
        params.put("ROLE", user.getRole());

        connection.update(SQL_INSERT_USER, params);
    }
}
