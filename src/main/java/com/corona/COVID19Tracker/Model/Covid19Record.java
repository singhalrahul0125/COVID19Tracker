package com.corona.COVID19Tracker.Model;

import java.util.ArrayList;
import java.util.List;

public class Covid19Record {
   private String country;
   private String state;
   private String cases;



    public Covid19Record(String country, String state, String cases) {
        this.country = country;
        this.state = state;
        this.cases = cases;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }
}
