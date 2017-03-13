package com.example.otimus.opendataproject.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.otimus.opendataproject.R;

public class ApplyBidActivity extends AppCompatActivity {
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_bid);
        btn_submit= (Button) findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ApplyBidActivity.this, "Profile Submitted", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(ApplyBidActivity.this,AvailableProjectsActivity.class));
            }
        });

    }
}
