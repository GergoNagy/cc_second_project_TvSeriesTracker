package com.example.user.tvseriestracker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Collections;

import static android.app.PendingIntent.getActivity;


public class WatchlistActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.watchlist_list);

        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        String watchlist = sharedPref.getString("series", new ArrayList<TvSeries>().toString());
        Log.d("My WatchList String", watchlist);

        final Gson gson = new Gson();
        TypeToken<ArrayList<TvSeries>> seriesArrayList = new TypeToken<ArrayList<TvSeries>>() {
        };
        final ArrayList<TvSeries> myWatchlist = gson.fromJson(watchlist, seriesArrayList.getType());
        Log.d("myfav", myWatchlist.toString());

        final WatchListAdapter watchListAdapter = new WatchListAdapter(this, myWatchlist);
        final ListView list = (ListView) findViewById(R.id.fav_list);

        TvSeries newWatchlist = (TvSeries) getIntent().getSerializableExtra("series");

        myWatchlist.add(newWatchlist);
        myWatchlist.removeAll(Collections.singleton(null));
//        Log.d("myfav2", myWatchlist.toString());


        final SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("series", gson.toJson(myWatchlist));
        editor.apply();

        list.setAdapter(watchListAdapter);
        //




        //

        list.setOnItemLongClickListener(
                new AdapterView.OnItemLongClickListener() {
                    @Override
                    public boolean onItemLongClick(AdapterView<?> adapter,
                                                   View item, int pos, long id) {

                        Log.d(this.getClass().toString(), "TRY HERE AGAIN");
                        myWatchlist.remove(pos);
                        watchListAdapter.notifyDataSetChanged();
                        editor.putString("series", gson.toJson(myWatchlist));
                        editor.apply();

                        return false;
                    }
                });



    }



//    public void getInfo(View view){
//        TvSeries series = (TvSeries) view.getTag();
//
//
//        Intent intent = new Intent(this, WatchlistActivity.class);
//
//        intent.putExtra("series", series);
//        Toast.makeText(this, "Added to your list!", Toast.LENGTH_LONG).show();
//        startActivity(intent);
//
//        Log.d("Button: ", "Clicked!");
//
//
//    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.watc_list_menu, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.list:
                startActivity(new Intent(this, SeriesActivity.class));
                return true;
        }
        switch (item.getItemId()){
            case R.id.getShowsTime:
                startActivity(new Intent(this, ShowTimeActivity.class));
                return true;
        }


        return super.onOptionsItemSelected(item);
    }

}













