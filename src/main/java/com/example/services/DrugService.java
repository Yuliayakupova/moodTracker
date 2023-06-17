package com.example.services;

import com.example.dto.Drug;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Service
public class DrugService {

    private static final String SEARCH_DRUG_API_URL = "https://api.fda.gov/drug/drugsfda.json?search=%s&count=products.brand_name.exact";
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public DrugService() {
        httpClient = (HttpClient) java.net.http.HttpClient.newHttpClient();
        objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public List<Drug> searchDrugByName(String drugName) throws URISyntaxException, IOException, InterruptedException {
        String encodedDrugName = URLEncoder.encode(drugName, StandardCharsets.UTF_8);
        final URI uri = new URI(String.format(SEARCH_DRUG_API_URL, encodedDrugName));

        HttpRequest request = HttpRequest.newBuilder(uri).build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new IOException("Failed to get drug by name " + encodedDrugName);
        }

        final String json = response.body();

        return objectMapper.readValue(json, new TypeReference<List<Drug>>(){});
    }

}
