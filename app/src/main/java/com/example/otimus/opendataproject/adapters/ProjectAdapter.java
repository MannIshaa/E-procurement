package com.example.otimus.opendataproject.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.otimus.opendataproject.models.Project;
import com.example.otimus.opendataproject.R;

import java.util.List;

/**
 * Created by Otimus on 2/25/2017.
 */

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.PViewHoler> {
    List<Project> projects;
    private final OnItemClickListener listenerOne;

    public interface OnItemClickListener {
        void onItemClick(Project item);
    }

    public ProjectAdapter(List<Project> projects, OnItemClickListener listenerOne) {
        this.listenerOne=listenerOne;
        this.projects = projects;
    }

    @Override
    public ProjectAdapter.PViewHoler onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemViewOne= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project,parent,false);
        return new PViewHoler(itemViewOne);

    }

    @Override
    public void onBindViewHolder(ProjectAdapter.PViewHoler holder, int position) {
        holder.bind(projects.get(position),listenerOne);

        holder.id.setText(toString().valueOf(projects.get(position).getId()));

        holder.projectName.setText(projects.get(position).getProjectName());
        holder.publishedDate.setText(toString().valueOf(projects.get(position).getDate()));

    }

    @Override
    public int getItemCount() {
        return projects.size();
    }


    public class PViewHoler extends RecyclerView.ViewHolder {
        TextView id;
        TextView projectName;
        TextView publishedDate;
        public PViewHoler(View itemView)
        {
            super(itemView);
            id= (TextView) itemView.findViewById(R.id.projectId);
            projectName= (TextView) itemView.findViewById(R.id.projectName);
            publishedDate= (TextView) itemView.findViewById(R.id.publishDate);
        }
        public void bind(final Project item, final OnItemClickListener listener){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listenerOne.onItemClick(item);

                }
            });
        }
    }
}