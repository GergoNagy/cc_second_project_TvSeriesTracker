package com.example.user.tvseriestracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by user on 15/08/2017.
 */

public class WatchListAdapter extends ArrayAdapter<TvSeries> {

    public WatchListAdapter(Context context, ArrayList<TvSeries> myWatchlist){
        super(context, 0, myWatchlist);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.watch_item, parent, false);
        }

        TvSeries currentSeries = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.wimageView);
        Picasso.with(getContext())
                .load(currentSeries.getPoster())
                .resize(200, 325)
                .centerInside()
                .placeholder(R.drawable.loading)
                .error(R.drawable.noimage)
                .into(imageView);


        TextView title =(TextView) listItemView.findViewById(R.id.wtitle);
        title.setText(currentSeries.getTitle());

        TextView released = (TextView) listItemView.findViewById(R.id.wreleased);
        released.setText("Released: " + currentSeries.getReleased());

        TextView totalSeason = (TextView) listItemView.findViewById(R.id.wtotal_season);
        totalSeason.setText(String.valueOf("Total Season: " + currentSeries.getTotal()));

        listItemView.setTag(currentSeries);

        return listItemView;
    }
}
