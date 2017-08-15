package com.example.user.tvseriestracker;


import java.io.Serializable;

/**
 * Created by user on 11/08/2017.
 */

public class TvSeries  implements Serializable{

    private String title;
    private String released;
    private String runtime;
    private String genre;
    private String plot;
    private String country;
    private String poster;
    private String imdbrating;
    private String type;
    private int total;

    public TvSeries(String title, String released, String runtime, String genre,
                    String plot, String country, String poster, String imdbrating,
                    String type, Integer total){

        this.title = title;
        this.released = released;
        this.runtime = runtime;
        this.genre = genre;
        this.plot = plot;
        this.country = country;
        this.poster = poster;
        this.imdbrating = imdbrating;
        this.type = type;
        this.total = total;

    }

    public String getTitle(){
        return this.title;
    }

    public String getReleased(){
        return this.released;
    }

    public String getRuntime(){
        return this.runtime;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlot() {
        return plot;
    }

    public String getCountry() {
        return country;
    }

    public String getPoster() {
        return poster;
    }

    public String getImdbrating() {
        return imdbrating;
    }

    public String getType() {
        return type;
    }

    public int getTotal() {
        return total;
    }
}
