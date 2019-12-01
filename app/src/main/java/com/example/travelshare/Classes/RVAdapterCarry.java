package com.example.travelshare.Classes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelshare.R;

import java.util.List;

public class RVAdapterCarry extends RecyclerView.Adapter<RVAdapterCarry.CarryViewHolder> {

    private List<myTripsData> myTrips;
    private Context context;

    public RVAdapterCarry(List<myTripsData> mtrips,Context context1)
    {
        this.myTrips=mtrips;
        this.context=context1;
    }
    @NonNull
    @Override
    public CarryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.fragment_carry, parent, false);
        return new CarryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CarryViewHolder holder, int position) {
        final myTripsData mytripsdata= myTrips.get(position);
        holder.src_dst.setText(mytripsdata.getSrc_dest());
        holder.CarryDate.setText(mytripsdata.getCrrydate());
        holder.CarryTime.setText(mytripsdata.getCrrytime());
        holder.CrDate.setText(mytripsdata.getCrrdate());
    }

    @Override
    public int getItemCount() {
        return myTrips.size();
    }

    public class CarryViewHolder extends RecyclerView.ViewHolder {

        public TextView src_dst;
        public TextView CarryDate;
        public TextView CarryTime;
        public Button CrDate;
        public CarryViewHolder(@NonNull View itemView) {
            super(itemView);

            src_dst=  itemView.findViewById(R.id.src_dest);
            CarryDate= itemView.findViewById(R.id.crrydate);
            CarryTime= itemView.findViewById(R.id.crrytime);
            CrDate= itemView.findViewById(R.id.CrrTime);
        }
    }
}
