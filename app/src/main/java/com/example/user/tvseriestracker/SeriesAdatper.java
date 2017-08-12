package com.example.user.tvseriestracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 12/08/2017.
 */

public class SeriesAdatper extends ArrayAdapter<TvSeries> {

    public SeriesAdatper(Context context, ArrayList<TvSeries> series){
        super(context, 0, series);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.series_item, parent, false);
        }

        TvSeries currentSeries = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.picture);
        ranking.setText(currentSeries.getPoster());

        TextView title =(TextView) listItemView.findViewById(R.id.title);
        title.setText(currentSeries.getTitle());

        TextView released = (TextView) listItemView.findViewById(R.id.released);
        released.setText(currentSeries.getReleased());

        TextView totalSeason = (TextView) listItemView.findViewById(R.id.total_season);
        totalSeason.setText(String.valueOf(currentSeries.getTotal()));

        listItemView.setTag(currentSeries);

        return listItemView;
    }
}
