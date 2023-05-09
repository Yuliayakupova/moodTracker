package com.example.controller;

import com.example.dto.Mood;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@Controller
public class AddMoodController {

    @GetMapping(path="/template")
    public String getMood(){
        return "OK";
    }

    @GetMapping("/moods/add")
    public String get(Model model) {
        model.addAttribute("moodDate", new Date());
        model.addAttribute("mood", "some text1");
        model.addAttribute("pills", "some text2");
        model.addAttribute("note", "some text3");

        return "add_new_mood";
    }

    @PostMapping("/moods/add")
    public String post(
        Model model,
        @RequestParam("moodDate") String moodDate,
        @RequestParam("mood") String mood,
        @RequestParam("pills") String pills,
        @RequestParam("note") String note
    ) {
        model.addAttribute("moodDate", moodDate);
        model.addAttribute("mood", mood);
        model.addAttribute("pills", pills);
        model.addAttribute("note", note);

        //moodRepository.createNewMood(moodDate, mood, pills, note);

        return "add_new_mood";
    }

}
