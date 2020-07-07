package com.corona.COVID19Tracker.controller;

import com.corona.COVID19Tracker.Model.Covid19Record;
import com.corona.COVID19Tracker.Service.Covid19TrackerDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Covid19Tracker")
public class Covid19TrackerController {

    @Autowired
    private Covid19TrackerDataService Covid19TrackerDataService;

    @GetMapping("/getCurrentStats")
    public List<Covid19Record> getCovidStats(){
      return  Covid19TrackerDataService.getCurrentStats();

    }


}
