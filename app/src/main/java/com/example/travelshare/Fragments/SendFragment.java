package com.example.travelshare.Fragments;


import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.travelshare.Classes.RVAdapter;
import com.example.travelshare.Classes.TripsData;
import com.example.travelshare.Classes.myTripsData;
import com.example.travelshare.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SendFragment extends Fragment {


    List<TripsData> Ttrips= new ArrayList<>();
    public SendFragment() {
        // Required empty public constructor
    }
    public static SendFragment newInstance() {
        SendFragment fragment = new SendFragment();
        Bundle mybundle = new Bundle();
        fragment.setArguments(mybundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        FeedData();
        RecyclerView recyclerViewDemo = view.findViewById(R.id.myRV1);
        recyclerViewDemo.setLayoutManager(new LinearLayoutManager(getContext()));
        RVAdapter myRVAdapter= new RVAdapter(Ttrips,getContext());
        recyclerViewDemo.setAdapter(myRVAdapter);
        return view;
    }

    public void FeedData()
    {
        TripsData sample1= new TripsData("12","32","45","523","lol");
        Ttrips.add(sample1);
        //Get data from API and add here.
    }
}
