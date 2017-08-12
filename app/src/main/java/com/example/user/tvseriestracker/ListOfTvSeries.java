package com.example.user.tvseriestracker;

import java.util.ArrayList;

/**
 * Created by user on 11/08/2017.
 */

public class ListOfTvSeries {

    private ArrayList<TvSeries> list;

    public ListOfTvSeries(){
        list = new ArrayList<TvSeries>();
        list.add(new TvSeries("Supernatural", "13 Sep 2005", "44min", "fantasy", "info", "USA", "https://index.hu", "8.6", "Series", 12));
    }

    public ArrayList<TvSeries>getList(){
        return new ArrayList<TvSeries>(list);
    }
}
