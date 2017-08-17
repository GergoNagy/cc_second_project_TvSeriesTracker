package com.example.user.tvseriestracker;

import java.util.ArrayList;

/**
 * Created by user on 11/08/2017.
 */

public class ListOfTvSeries {

    private ArrayList<TvSeries> list;

    public ListOfTvSeries(){
        list = new ArrayList<TvSeries>();
        list.add(new TvSeries("Supernatural", "13 Sep 2005", "44min", "fantasy", "info", "USA",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMTA1OTY0NTk5MTJeQTJeQWpwZ15BbWU4MDYwMjU4MjAy._V1_SX300.jpg",
                "8.6", "Series", 12));
        list.add(new TvSeries("Game of Thrones", "17 Apr 2011", "56min", "Advanture, Drama, Fantasy",
                "Nine noble families fight for control over the mythical lands of Westeros, " +
                        "while a forgotten race returns after being dormant for thousands of years", "USA, UK",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMjE3NTQ1NDg1Ml5BMl5BanBnXkFtZTgwNzY2NDA0MjI@._V1_SX300.jpg",
                "9.5","Series", 8));
        list.add(new TvSeries("The Man in the High Castle","15 Jan 2015","60 min","Drama, Sci-Fi, Thriller",
                "A glimpse into an alternate history of North America. What life after WWII may have been like if the Nazis had won the war.",
                "USA","https://images-na.ssl-images-amazon.com/images/M/MV5BMjM4NzEyNTU2Nl5BMl5BanBnXkFtZTgwMTE3ODI0MDI@._V1_SX300.jpg",
                "8.1","series",2));
        list.add(new TvSeries("Strike Back","N/A","45 min","Action, Drama, Thriller",
                "The actions of 'Section 20', a secretive unit of British military intelligence. " +
                        "A team of special operations personnel conduct several high risk missions throughout the globe.",
                "UK","https://images-na.ssl-images-amazon.com/images/M/MV5BMTkyOTA3Nzk0Nl5BMl5BanBnXkFtZTgwNjA2MjYwMDE@._V1_SX300.jpg",
                "8.3","series",5));
        list.add(new TvSeries("The 100","19 Mar 2014","43 min","Drama, Mystery, Sci-Fi",
                "Set 97 years after a nuclear war has destroyed civilization, when a spaceship housing " +
                "humanity's lone survivors sends 100 juvenile delinquents back to Earth in hopes of possibly " +
                "re-populating the planet.", "USA",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BNzI0NzM4Mjk3MV5BMl5BanBnXkFtZTgwNTg0MDQyMTI@._V1_SX300.jpg",
                "7.8","Series",4));
        list.add(new TvSeries("Firefly","20 Sep 2002","44 min","Adventure, Drama, Sci-Fi",
                "Five hundred years in the future, a renegade crew aboard a small spacecraft tries to survive " +
                        "as they travel the unknown parts of the galaxy and evade warring factions as well as " +
                        "authority agents out to get them.","USA",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BNGEzYjIzZGUtNWI5YS00Y2IzLWIzMTQtMGJhNDljZDkzYzM0XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg",
                "9.1","series",1));
        list.add(new TvSeries("Naruto: Shippûden","28 Oct 2009","24 min","Animation, Action, Adventure",
                "Naruto Uzumaki, is a loud, hyperactive, adolescent ninja who constantly searches for " +
                        "approval and recognition, as well as to become Hokage, who is acknowledged as the" +
                        " leader and strongest of all ninja in the village.","Japan",
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMzNjNjdhOGQtMmYxMi00YWFjLWFhOGUtZjc2ZTJhMDlmNmExL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg",
                "8.5","series",24));
        list.add(new TvSeries("Lost","22 Sep 2004","44 min","Adventure, Drama, Fantasy",
                "The survivors of a plane crash are forced to work together in order to survive on a seemingly deserted tropical island.",
                "USA","https://images-na.ssl-images-amazon.com/images/M/MV5BMjA3NzMyMzU1MV5BMl5BanBnXkFtZTcwNjc1ODUwMg@@._V1_SX300.jpg",
                "8.4","series",6));

    }

    public ArrayList<TvSeries>getList(){
        return new ArrayList<TvSeries>(list);
    }


}
