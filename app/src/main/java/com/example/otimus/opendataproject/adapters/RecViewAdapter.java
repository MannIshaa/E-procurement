package com.example.otimus.opendataproject.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.otimus.opendataproject.models.District;
import com.example.otimus.opendataproject.R;

import java.util.List;

/**
 * Created by Otimus on 2/25/2017.
 */

public class RecViewAdapter extends RecyclerView.Adapter<RecViewAdapter.MyViewHoler> {
    List<District> districts;

    private final OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(District item);
    }



    public RecViewAdapter(List<District> districts,OnItemClickListener listener) {
        this.districts = districts;
        this.listener = listener;
    }

    @Override
    public RecViewAdapter.MyViewHoler onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_district,parent,false);
        return new MyViewHoler(itemView);          }

    @Override
    public void onBindViewHolder(RecViewAdapter.MyViewHoler holder, int position) {
        holder.bind(districts.get(position),listener);

        holder.id.setText(toString().valueOf(districts.get(position).getId()));

        holder.dName.setText(districts.get(position).getDistrictName());
        holder.availableProjects.setText(toString().valueOf(districts.get(position).getAvailableProjects()));
    }

    @Override
    public int getItemCount() {
        return districts.size();
    }

    public class MyViewHoler extends RecyclerView.ViewHolder {
        TextView id;
        TextView dName;
        TextView availableProjects;

        public MyViewHoler(View itemView) {
            super(itemView);
            id= (TextView) itemView.findViewById(R.id.districtId);
            dName= (TextView) itemView.findViewById(R.id.districtName);
            availableProjects= (TextView) itemView.findViewById(R.id.districtap);

        }
        public void bind(final District item, final OnItemClickListener listener){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(item);

                }
            });
        }
    }
}
