package com.example.user.tvseriestracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
        TvSeries tvSeries = (TvSeries) listItem.getTag();
        Log.d("Series title", tvSeries.getTitle());
    }
}



//        public void getMovie(View listItem){
//        Movie movie = (Movie) listItem.getTag(); //hold the movie
//        Log.d("Movie Title: ", movie.getTitle());
//
//        Intent intent = new Intent(this, FavouritesActivity.class); // UPDATED
//        intent.putExtra("movie", movie); // UPDATED
//
//        startActivity(intent); // UPDATED
//        }
//        }