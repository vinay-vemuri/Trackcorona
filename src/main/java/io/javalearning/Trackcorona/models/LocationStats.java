package io.javalearning.Trackcorona.models;

import org.springframework.web.servlet.view.script.ScriptTemplateConfig;

public class LocationStats {

    private String state;
    private String country;
    private String latestTotalCases;

    public int getDifffromprev() {
        return difffromprev;
    }

    public void setDifffromprev(int difffromprev) {
        this.difffromprev = difffromprev;
    }

    private int difffromprev;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = String.valueOf(latestTotalCases);
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases='" + latestTotalCases + '\'' +
                '}';
    }


}
