package com.example.moviedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MovieView extends AppCompatActivity {

    public TextView movieView;
    public TextView directorView;
    public TextView studioView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_view);

        movieView = findViewById(R.id.movieView);
        directorView = findViewById(R.id.directorView);
        studioView  = findViewById(R.id.studioView);

        DatabaseManager dbm = new DatabaseManager(this);
        String[] entry = dbm.get();
        movieView.setText(entry[0]);
        directorView.setText(entry[1]);
        studioView.setText(entry[2]);
    }
}
