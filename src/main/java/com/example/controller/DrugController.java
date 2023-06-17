package com.example.controller;

import com.example.dto.Drug;
import com.example.services.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
public class DrugController {

    @Autowired
    private final DrugService drugService;

    public DrugController(DrugService drugService){
        this.drugService = drugService;
    }

    @GetMapping("/drug")
    public List<Drug> getDrugsInfo(@RequestParam String drug) throws URISyntaxException, IOException, InterruptedException {
        return drugService.searchDrugByName(drug);
    }
}
