package com.example.repository;

import com.example.dto.Mood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//WIP (придумать структуру таблицы Mood)

@Repository
public class MoodRepository {

    private final static String  INTO_MOOD_DATA = """
            INSERT INTO
                Mood (userId,
                        moodTypeId,
                        moodValue,
                        moodTimestamp
             ) VALUES (
                ?,
                ?,
                ?,
                ?)
            """;

    private final static String SELECT_ALL_MOOD = "SELECT * FROM Mood";

    @Autowired
    private final JdbcTemplate connection;

    public MoodRepository(JdbcTemplate connection) {
        this.connection = connection;
    }

    public void saveMoodData(Mood mood){
        try{
            connection.update(INTO_MOOD_DATA,
                    mood.getId(),
                    mood.getMoodValue())
        }

    }
}
