package com.example.moviedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mainAddButton;
    private Button viewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainAddButton = findViewById(R.id.mainAddButton);
        viewButton = findViewById(R.id.viewButton);
    }

    public void addPressed(View v){
        Intent i = new Intent(this, AddMovie.class);
        startActivity(i);
    }

    public void viewPressed(View v){
        Intent i = new Intent(this, TitleViewActivity.class);
        startActivity(i);
    }
}
