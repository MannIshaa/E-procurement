package com.example.otimus.opendataproject.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.otimus.opendataproject.R;
import com.example.otimus.opendataproject.activities.ProjectListActivity;
import com.example.otimus.opendataproject.adapters.RecViewAdapter;
import com.example.otimus.opendataproject.models.District;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentList extends Fragment {
    RecyclerView recyclerView;
    LinearLayoutManager mLayoutManager;
    List<District> districts=new ArrayList<>();

    public FragmentList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_fragment_list, container, false);
        recyclerView= (RecyclerView) rootView.findViewById(R.id.recyclerViewFrag);
        recyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);

        initializeData();
        RecViewAdapter recViewAdapter=new RecViewAdapter(districts, new RecViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(District item) {
                startActivity(new Intent(getContext(),ProjectListActivity.class));
            }
        });
        recyclerView.setAdapter(recViewAdapter);
        return rootView;
    }
    public void initializeData(){


        districts.add(new District(1,"Bhaktapur",3));
        districts.add(new District(2,"Chitwan",1));
        districts.add(new District(3,"Gorkha",4));
        districts.add(new District(4,"Kathmandu",5));
        districts.add(new District(5,"Lalitpur",2));

    }
}
