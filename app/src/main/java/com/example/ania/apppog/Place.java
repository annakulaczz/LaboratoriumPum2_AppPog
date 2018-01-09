package com.example.ania.apppog;

/**
 * Created by Ania on 2018-01-09.
 */

public class Place {
    private String placeName;


    public Place(String placeName, int temperature, String information) {
        this.placeName = placeName;
        this.temperature = temperature;
        this.information = information;
    }

    public Place(String placeName, String information) {
        this.placeName = placeName;
        this.information = information;
    }

    public Place(String placeName, int temperature) {
        this.placeName = placeName;
        this.temperature = temperature;
    }

    private int temperature;
    private String information;

    public String getPlaceName() {return placeName;}

    public void setPlaceName(String placeName) {this.placeName = placeName;}

    public int getTemperature() {return temperature;}

    public void setTemperature(int temperature) {this.temperature = temperature;}

    public String getInformation() {return information;}

    public void setInformation(String information) {this.information = information;}


}

