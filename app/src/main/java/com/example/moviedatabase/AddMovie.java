package com.example.moviedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddMovie extends AppCompatActivity {

    private EditText titleEntry;
    private EditText directorEntry;
    private EditText studioEntry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_movie);

        titleEntry = findViewById(R.id.titleEntry);
        directorEntry = findViewById(R.id.directorEntry);
        studioEntry = findViewById(R.id.studioEntry);
    }

    public void addPressed(View v){
        String title = titleEntry.getText().toString();
        String director = directorEntry.getText().toString();
        String studio = studioEntry.getText().toString();
        DatabaseManager dbm = new DatabaseManager(this);
        dbm.insert(title, director, studio);
        finish();
    }
}
