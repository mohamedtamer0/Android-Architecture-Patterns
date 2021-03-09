package com.example.architecture_patterns.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.architecture_patterns.model.MovieModel;

public class MovieViewModel extends ViewModel {

    public MutableLiveData<String> movieNameMutableLiveData = new MutableLiveData<>();

    public void getMovieName() {
        String movieName = getMovieFromDatabase().getName();
        movieNameMutableLiveData.setValue(movieName);
    }

    private MovieModel getMovieFromDatabase() {
        return new MovieModel("The Good Doctor", "2-2-20121", "Great", 1);
    }


}
