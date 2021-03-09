package com.example.architecture_patterns.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.architecture_patterns.R;
import com.example.architecture_patterns.databinding.ActivityMainBinding;
import com.example.architecture_patterns.model.MovieModel;

public class MainActivity extends AppCompatActivity {


    MovieViewModel movieViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        movieViewModel = new ViewModelProvider(this).get(MovieViewModel.class);
        binding.setViewModel(movieViewModel);
        binding.setLifecycleOwner(this);





    }


}