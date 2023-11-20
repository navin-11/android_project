package com.abyantra.product.trip_2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abyantra.product.trip_2.Model.dao.Pojo.ModelParticulars;
import com.abyantra.product.trip_check.R;

import java.util.ArrayList;

public class ParticularsFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<ModelParticulars> arrayList = new ArrayList<>();

    public ParticularsFragment() {
        // Required empty public constructor
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_particulars, container, false);
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_particulars, container, false);

        recyclerView = view.findViewById(R.id.particularsRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList<ModelParticulars> arrayList = new ArrayList<>();
        arrayList.add(new ModelParticulars("11.11 A.M","Signal Box","Working","12.1122332-1233.111132"));
        arrayList.add(new ModelParticulars("12.41 A.M","Electricity Line","Fine","11.1111111,11.1111111"));
        arrayList.add(new ModelParticulars("05.41 P.M","Daily Check","OK","14.54841844,89.64684646"));

        ModelParticularsRecyclerView modelParticularsRecyclerView = new ModelParticularsRecyclerView(getActivity(), arrayList);
        recyclerView.setAdapter(modelParticularsRecyclerView);

        return view;
    }
}