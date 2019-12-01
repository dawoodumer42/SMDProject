package com.example.travelshare.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.travelshare.AddCarryTrip;
import com.example.travelshare.Classes.RVAdapter;
import com.example.travelshare.Classes.RVAdapterCarry;
import com.example.travelshare.Classes.TripsData;
import com.example.travelshare.Classes.myTripsData;
import com.example.travelshare.R;

import java.util.ArrayList;
import java.util.List;

public class CarryFragment extends Fragment {
    Button plus;
    public CarryFragment()
    {
        //empty constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank_fragment2,container,false);
        RecyclerView CarryRV = view.findViewById(R.id.myRV2);
        CarryRV.setLayoutManager(new LinearLayoutManager(getContext()));
        RVAdapterCarry myAdapter= new RVAdapterCarry(FeedDataMTrips(),getContext());
        CarryRV.setAdapter(myAdapter);
        plus =  view.findViewById(R.id.plus_button);
        plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getActivity(), AddCarryTrip.class));
            }
        });
        return view;
    }
    public List<myTripsData> FeedDataMTrips()
    {
        List<myTripsData> mylist= new ArrayList<>();
        myTripsData sample= new myTripsData("123","xd123","lmao","lol");
        mylist.add(sample);
        return mylist;
    }
}
