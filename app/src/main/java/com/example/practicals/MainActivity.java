package com.example.practicals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //redirection to the MenuListActivity to display the menu
        Intent intent = new Intent(getApplicationContext(), MenuListActivity.class);
        startActivity(intent);
    }
}
