package com.example.user.tvseriestracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Collections;



public class WatchlistActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.watchlist_list);

        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        String watchlist = sharedPref.getString("series", new ArrayList<TvSeries>().toString());
        Log.d("My WatchList String", watchlist);

        Gson gson = new Gson();
        TypeToken<ArrayList<TvSeries>> seriesArrayList = new TypeToken<ArrayList<TvSeries>>() {
        };
        ArrayList<TvSeries> myWatchlist = gson.fromJson(watchlist, seriesArrayList.getType());
        Log.d("myfav", myWatchlist.toString());

        //new part
        WatchListAdapter watchListAdapter = new WatchListAdapter(this, myWatchlist);
        ListView list = (ListView) findViewById(R.id.fav_list);
        list.setAdapter(watchListAdapter);
        //end of new part

        TvSeries newWatchlist = (TvSeries) getIntent().getSerializableExtra("series");
        myWatchlist.add(newWatchlist);
        myWatchlist.removeAll(Collections.singleton(null));
        Log.d("myfav2", myWatchlist.toString());




//        TextView list = (TextView) findViewById(R.id.fav_list);
//        String seriesString = " ";
//
//        for (TvSeries series : myWatchlist) {
//            seriesString += //series.getPoster()
//                    "\n" + series.getTitle()
//                            + "\n" + "Runtime:  " + series.getRuntime()
//                            + "\n" + "Total season:  " + series.getTotal()
//                            + "\n"
//                            + "\n";
//        }

//        list.setText(seriesString);

        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("series", gson.toJson(myWatchlist));
        editor.apply();


    }

}











