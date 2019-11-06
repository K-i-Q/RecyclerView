package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    ArrayList<RocketModel> rocketModels;

    public RecyclerAdapter(ArrayList<RocketModel> rocketModels){
        this.rocketModels = rocketModels;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int ViewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lisst_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RocketModel rocketModel = rocketModels.get(position);

        holder.rocketName.setText("Rocket: "+rocketModel.getRocketName());
        holder.launchDate.setText("Launch Date: "+rocketModel.getLaunchDate());

        if (rocketModel.isLaunchSuccess()){
            holder.launchSuccess.setText("Launch Succeeded");
        }else{
            holder.launchSuccess.setText("Launch Failed");
        }

        holder.payload.setText(rocketModel.getPayload());
    }

    @Override
    public int getItemCount() {
        return rocketModels.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView){
            super(itemView);
        }
        // each data item is just a string in this case
        TextView rocketName = itemView.findViewById(R.id.rocketName);

        TextView launchDate= itemView.findViewById(R.id.launchDate);;

        TextView launchSuccess = itemView.findViewById(R.id.launchSuccess);;

        TextView payload = itemView.findViewById(R.id.payload);


    }

}
