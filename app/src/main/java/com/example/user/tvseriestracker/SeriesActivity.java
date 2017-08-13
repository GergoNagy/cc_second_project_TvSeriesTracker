package com.example.user.tvseriestracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;


public class SeriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.series_list);

        ListOfTvSeries tvSeries = new ListOfTvSeries();
        ArrayList<TvSeries> list = tvSeries.getList();

        SeriesAdatper seriesAdatper = new SeriesAdatper(this, list);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(seriesAdatper);
    }

    public void getSeries(View listItem){
        TvSeries series = (TvSeries) listItem.getTag();

        Intent intent = new Intent(this, WatchlistActivity.class);
        intent.putExtra("series", series);

        startActivity(intent);
    }
}