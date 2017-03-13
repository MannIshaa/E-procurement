package com.example.otimus.opendataproject.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.otimus.opendataproject.R;

public class UserProjectDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_project_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
