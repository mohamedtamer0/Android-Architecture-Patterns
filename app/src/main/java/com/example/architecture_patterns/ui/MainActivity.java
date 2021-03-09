package com.example.architecture_patterns.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.architecture_patterns.R;
import com.example.architecture_patterns.model.MovieModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, MovieView {

    TextView movieNameTV;
    Button btn;
    MoviePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieNameTV = findViewById(R.id.textView);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(this);
        presenter = new MoviePresenter(this);


    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            presenter.getMovieName();
        }
    }


    @Override
    public void onGetMovieName(String movieName) {
        movieNameTV.setText(movieName);
    }
}