package com.corona.COVID19Tracker.Service;

import com.corona.COVID19Tracker.Model.Covid19Record;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class Covid19TrackerDataService {
    private static final String DATASERVIVE_URL = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";

    RestTemplate restTemplate = new RestTemplate();

    public List<Covid19Record> getCurrentStats() {
        ResponseEntity<String> response = restTemplate.getForEntity(DATASERVIVE_URL, String.class);
        readCsvData(response);
        return covid19Recordlist;
    }

    List<Covid19Record> covid19Recordlist = new ArrayList<>();

    private void readCsvData(ResponseEntity<String> response) {
        StringReader reader = new StringReader(response.getBody());
        Iterable<CSVRecord> records = null;
        try {
            records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(reader);
        } catch (IOException e) {
            throw new RuntimeException("Error while parsing csv records", e);
        }

        for (CSVRecord record : records) {
            String country = record.get("Country/Region");
            String state = record.get("Province/State");
            String currentStats = record.get(record.size() - 1);

            Covid19Record covid19Record = new Covid19Record(country, state, currentStats);
            covid19Recordlist.add(covid19Record);
        }

    }
}

