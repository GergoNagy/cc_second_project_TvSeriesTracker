package com.example.user.tvseriestracker;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 11/08/2017.
 */

public class TvSeriesTest {


    TvSeries series;

    @Before
    public void before() {
        series = new TvSeries("Supernatural", "13 Sep 2005", "44min", "fantasy", "info", "USA", "http://index.hu", "8.6", "Series", 12);
    }

    @Test
    public void getTitle(){
        assertEquals("Supernatural", series.getTitle());
    }

    @Test
    public void getReleased() {
        assertEquals("13 Sep 2005", series.getReleased());
    }

    @Test
    public void getRuntime() {
        assertEquals("44min",series.getRuntime());
    }

    @Test
    public void getGenre() {
        assertEquals("fantasy",series.getGenre());
    }

    @Test
    public void getPlot() {
        assertEquals("info",series.getPlot());
    }

    @Test
    public void getCountry() {
        assertEquals("USA",series.getCountry());
    }

    @Test
    public void getPoster() {
        assertEquals("http://index.hu",series.getPoster());
    }

    @Test
    public void getImdbrating() {
        assertEquals("8.6",series.getImdbrating());
    }

    @Test
    public void getType() {
        assertEquals("Series",series.getType());
    }

    @Test
    public void getTotal() {
        assertEquals(12 ,series.getTotal());
    }


}
