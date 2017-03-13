package com.example.otimus.opendataproject.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.otimus.opendataproject.models.District;
import com.example.otimus.opendataproject.R;
import com.example.otimus.opendataproject.adapters.RecViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager mLayoutManager;
    List<District> districts=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        initializeData();

        RecViewAdapter recViewAdapter=new RecViewAdapter(districts, new RecViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(District item) {
                startActivity(new Intent(MainActivity.this,ProjectListActivity.class));
            }
        });
        recyclerView.setAdapter(recViewAdapter);



    }

    public void initializeData(){

        districts.add(new District(1,"Kathmandu",5));
        districts.add(new District(2,"Bhaktapur",3));
        districts.add(new District(3,"Lalitpur",2));

    }


}

