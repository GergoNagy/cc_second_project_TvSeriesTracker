package com.example.user.tvseriestracker;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class SeriesAdatper extends ArrayAdapter<TvSeries> {

    public SeriesAdatper(Context context, ArrayList<TvSeries> tvSeries){
        super(context, 0, tvSeries);

    }



    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.series_item, parent, false);
        }

        TvSeries currentSeries = getItem(position);

//        TextView ranking = (TextView) listItemView.findViewById(R.id.picture);
//        ranking.setText(currentSeries.getPoster());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        Picasso.with(getContext())
                .load(currentSeries.getPoster())
                .resize(200, 325)
                .centerInside()
                .placeholder(R.drawable.loading)
                .error(R.drawable.noimage).resize(200, 325)
                .into(imageView);


        TextView title =(TextView) listItemView.findViewById(R.id.title);
        title.setText(currentSeries.getTitle());

        TextView released = (TextView) listItemView.findViewById(R.id.released);
        released.setText("Imdb rates: " + currentSeries.getImdbrating() + "/10");

        TextView totalSeason = (TextView) listItemView.findViewById(R.id.total_season);
        totalSeason.setText(String.valueOf("Total Season: " + currentSeries.getTotal()));


        listItemView.setTag(currentSeries);

        return listItemView;
    }

}
