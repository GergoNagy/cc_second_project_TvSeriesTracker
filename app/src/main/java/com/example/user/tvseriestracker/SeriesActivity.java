package com.example.user.tvseriestracker;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
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
        Toast.makeText(this, "Added to your list!", Toast.LENGTH_LONG).show();
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);

//        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
//        SearchView searchView = (SearchView) menu.findItem(R.id.list_search).getActionView();
//        searchView.setSearchableInfo(
//                searchManager,getSearchableInfo(getComponentName());
//        );

        return true;

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.watch_list:
                startActivity(new Intent(this, WatchlistActivity.class));
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
