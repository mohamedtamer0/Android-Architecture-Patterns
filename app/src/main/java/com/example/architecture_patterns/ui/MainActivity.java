package com.example.architecture_patterns.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.architecture_patterns.R;
import com.example.architecture_patterns.model.MovieModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView movieName;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieName = findViewById(R.id.textView);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    public MovieModel getMovieFromDatabase() {
        return new MovieModel("The Good Doctor","2-2-20121","Great", 1);
    }

    public void getMovie() {
        movieName.setText(getMovieFromDatabase().getName());
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            getMovie();
        }
    }
}