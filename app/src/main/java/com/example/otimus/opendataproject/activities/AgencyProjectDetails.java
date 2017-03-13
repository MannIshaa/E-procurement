package com.example.otimus.opendataproject.activities;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.otimus.opendataproject.R;

public class AgencyProjectDetails extends AppCompatActivity {
    FloatingActionButton notificationfab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agency_project_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        notificationfab=(FloatingActionButton)findViewById(R.id.notificationbutton);
        notificationfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AgencyProjectDetails.this, Notification_details.class);
                startActivity(intent);
            }
        });


    }
}
