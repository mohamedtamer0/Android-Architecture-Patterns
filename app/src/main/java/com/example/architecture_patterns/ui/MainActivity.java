package com.example.architecture_patterns.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.architecture_patterns.R;
import com.example.architecture_patterns.model.MovieModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView movieNameTV;
    Button btn;

    MovieViewModel movieViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieNameTV = findViewById(R.id.textView);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);

        movieViewModel = new ViewModelProvider(this).get(MovieViewModel.class);
        movieViewModel.movieNameMutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                movieNameTV.setText(s);
            }
        });

    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            movieViewModel.getMovieName();
        }
    }

}