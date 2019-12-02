package com.example.travelshare.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
import com.example.travelshare.Classes.RVAdapterRequests;
import com.example.travelshare.Classes.RequestData;
import com.example.travelshare.R;

import java.util.ArrayList;
import java.util.List;

public class RequestsFragment extends Fragment {

    List<RequestData> myReqList=new ArrayList<>();
    Context context;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_blank_fragment3,container,false);
        RecyclerView ReqRV= v.findViewById(R.id.myRV3);
        ReqRV.setLayoutManager(new LinearLayoutManager(context));
        RVAdapterRequests myReqAdapter= new RVAdapterRequests(FillData(),context);
        ReqRV.setAdapter(myReqAdapter);
        return v;
    }

    public List<RequestData> FillData()
    {
        RequestData newReq= new RequestData("Harry Potter","Lahore->Peshore","03233234345");
        myReqList.add(newReq);
        return myReqList;
        //Get Data from API and add here. [Will be saved in the requests tab of the person who posted the trip that got clicked on]
    }
}
