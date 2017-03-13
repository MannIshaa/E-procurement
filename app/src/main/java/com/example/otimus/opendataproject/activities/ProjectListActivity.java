package com.example.otimus.opendataproject.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.otimus.opendataproject.models.Project;
import com.example.otimus.opendataproject.adapters.ProjectAdapter;
import com.example.otimus.opendataproject.R;

import java.util.ArrayList;
import java.util.List;

import static com.example.otimus.opendataproject.R.id.recyclerViewProject;

public class ProjectListActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    List<Project> projects=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_list);
        recyclerView= (RecyclerView) findViewById(recyclerViewProject);
        recyclerView.setHasFixedSize(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        initializeData();
        ProjectAdapter projectAdapter=new ProjectAdapter(projects, new ProjectAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Project item) {
                startActivity(new Intent(ProjectListActivity.this,UserProjectDetails.class));
            }


        });
        recyclerView.setAdapter(projectAdapter);

    }
    public void initializeData(){

        projects.add(new Project(1,"Earthwork and Retaining Wall Works in Libang Na Pa Sahari Sadak","2017-02-22"));
        projects.add(new Project(2,"Roadway Excavation & Gabion Wall Works in Kapurkot- Dahaban- Swargadowari Road","2017-02-20"));
        projects.add(new Project(2," Earthwork in Excavation in Pyuthan Nuwagau Baghkhor Budhagau Simpani Sadak,","2017-02-20"));


    }

}
