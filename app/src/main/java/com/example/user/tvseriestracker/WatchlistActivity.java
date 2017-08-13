package com.example.user.tvseriestracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class WatchlistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.watchlist_list);

        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        String watchlist = sharedPref.getString("series", new ArrayList<TvSeries>().toString());
        Log.d("My WatchList String", watchlist);

        Gson gson = new Gson();
        TypeToken<ArrayList<TvSeries>> seriesArrayList = new TypeToken<ArrayList<TvSeries>>(){};
        ArrayList<TvSeries> myWatchlist = gson.fromJson(watchlist, seriesArrayList.getType());
        Log.d("myfav", String.valueOf(myWatchlist));

        TvSeries newWatchlist = (TvSeries) getIntent().getSerializableExtra("series");
        myWatchlist.add(newWatchlist);
        Log.d("myfav", String.valueOf(myWatchlist));


        TextView list = (TextView) findViewById(R.id.fav_list);
        String seriesString = " ";

        for(TvSeries series : myWatchlist){
            seriesString += series.getTitle() + " " + series.getRuntime() + "\n";
        }

        list.setText(seriesString);

        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("My Watchlist", gson.toJson(myWatchlist));
        editor.apply();

        Toast.makeText(this, "Added to your list!", Toast.LENGTH_LONG).show();

      }

}







