package com.abyantra.product.trip_2;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abyantra.product.trip_2.Model.dao.Pojo.ModelTasks;
import com.abyantra.product.trip_check.R;

import java.util.ArrayList;

public class NewFragment extends Fragment {


    RecyclerView recyclerView;
    ArrayList<ModelTasks> arrayList = new ArrayList<>();

    public NewFragment() {
        // Required empty public constructor
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_new, container, false);
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList<ModelTasks> arrayList = new ArrayList<>();
        arrayList.add(new ModelTasks(R.drawable.ic_baseline_thumb_up_24, "Local Check", "patrolling", "12-06-2023"));
        arrayList.add(new ModelTasks(R.drawable.ic_baseline_play_arrow_24, "RoadMap Testing", "patrolling", "12-06-2023"));
        arrayList.add(new ModelTasks(R.drawable.ic_baseline_play_arrow_24, "Route Check", "patrolling", "13-06-2023"));
        arrayList.add(new ModelTasks(R.drawable.ic_baseline_thumb_up_24, "LocalTest 2", "patrolling", "10-06-2023"));
        arrayList.add(new ModelTasks(R.drawable.ic_baseline_play_arrow_24, "Daily Check", "patrolling", "22-06-2023"));

        ModelTaskRecyclerView modelRecyclerView = new ModelTaskRecyclerView(getActivity(), arrayList);
        recyclerView.setAdapter(modelRecyclerView);

        return view;
    }

}