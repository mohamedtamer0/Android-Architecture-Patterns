package com.example.architecture_patterns.ui;

import com.example.architecture_patterns.model.MovieModel;

public class MoviePresenter {

    MovieView view;

    public MoviePresenter(MovieView view) {
        this.view = view;
    }

    public MovieModel getMovieFromDatabase() {
        return new MovieModel("The Good Doctor", "2-2-20121", "Great", 1);
    }


    public void getMovieName() {
        view.onGetMovieName(getMovieFromDatabase().getName());
    }
}
