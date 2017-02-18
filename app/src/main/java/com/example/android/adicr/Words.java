package com.example.android.adicr;

/**
 * Created by Lenovo on 18-02-2017.
 */

public class Words {
    private String place;
    private int mag;
    private String people;

    public Words(String place,int mag, String people){
        this.place = place;
        this.mag = mag;
        this.place = people;

    }

    public String getPlace(){
        return  place;
    }

    public int getMag(){
        return  mag;
    }

    public String getPeople(){
        return  people;
    }
}
