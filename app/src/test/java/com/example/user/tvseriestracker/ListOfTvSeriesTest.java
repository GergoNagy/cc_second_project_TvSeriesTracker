package com.example.user.tvseriestracker;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 11/08/2017.
 */

public class ListOfTvSeriesTest {

    @Test
    public void getSizeOfTheArray(){
        ListOfTvSeries listOfTvSeries = new ListOfTvSeries();
        assertEquals(1, listOfTvSeries.getList().size());
    }


}
