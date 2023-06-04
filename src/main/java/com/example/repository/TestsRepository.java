package com.example.repository;

import com.example.dto.Questions;
import com.example.dto.Tests;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TestsRepository {

    private final JdbcTemplate jdbcTemplate;

    public TestsRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Tests getTestsById(int testsId) {
        String testsQuery = "SELECT testName FROM Tests WHERE id = ?";
        String questionsQuery = "SELECT questionText FROM Questions WHERE testsId = ?";
        String answersQuery = "SELECT answerText FROM Answers WHERE questionId = ?";

        String testName = jdbcTemplate.queryForObject(testsQuery, String.class, testsId);
        List<String> questionTexts = jdbcTemplate.queryForList(questionsQuery, String.class, testsId);

        List<Questions> questions = new ArrayList<>();
        for (String questionText : questionTexts) {
            int questionId = getQuestionIdByText(questionText);
            List<String> answerOptions = jdbcTemplate.queryForList(answersQuery, String.class, questionId);
            questions.add(new Questions(questionText, answerOptions));
        }

        return new Tests(testName, questions);
    }

    private int getQuestionIdByText(String questionText) {
        String query = "SELECT id FROM Questions WHERE questionText = ?";
        Integer questionId = jdbcTemplate.queryForObject(query, Integer.class, questionText);
        return questionId != null ? questionId : -1;
    }
}
