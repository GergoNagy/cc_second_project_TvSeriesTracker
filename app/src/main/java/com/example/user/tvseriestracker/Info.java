package com.example.user.tvseriestracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static com.example.user.tvseriestracker.R.id.info_pic;
import static java.security.AccessController.getContext;

public class Info extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

//        //receive
//        TvSeries seriesInfo = (TvSeries) getIntent().getSerializableExtra("seriesInfo");
//        Log.d("Get title from info", String.valueOf(seriesInfo.getTitle()));
//
//        TextView list = (TextView)findViewById(R.id.ititle);
//        String title = "";
//        title += series.getTitle();
//
//        TextView runtime = (TextView) findViewById(R.id.runtime);
//        String rt ="";
//        rt +="Runtime: " + series.getRuntime();
//
////        TextView released = (TextView) findViewById(R.id.released);
////        String rel ="";
////        rel +="Released: " + series.getReleased();
//
////        TextView country = (TextView) findViewById(R.id.country);
////        String con ="";
////        con +="Country: " + series.getCountry();
//
////        TextView genre = (TextView) findViewById(R.id.genre);
////        String gen ="";
////        gen +="Genre: " + series.getGenre();
////
////        TextView imdbrate = (TextView) findViewById(R.id.released);
////        String imdb ="";
////        imdb +="Imdb rates: " + series.getImdbrating() + "/10";
//
////        TextView seriesinfo = (TextView) findViewById(R.id.series_info);
////        String serin = " ";
////        serin="Info: " + series.getPlot() + ". ";
//
//        ImageView image = (ImageView) findViewById(R.id.info_pic);
//        Picasso.with(this)
//                .load(series.getPoster())
//                .resize(600, 600)
//                .centerInside()
//                .placeholder(R.drawable.loading)
//                .error(R.drawable.noimage)
//                .into(image);
//
//
//        list.setText(title);
//        runtime.setText(rt);
////        released.setText(rel);
////        country.setText(con);
////        genre.setText(gen);
////        imdbrate.setText(imdb);
////        seriesinfo.setText(serin);
//
    }

}
