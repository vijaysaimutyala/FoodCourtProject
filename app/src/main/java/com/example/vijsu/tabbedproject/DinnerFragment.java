package com.example.vijsu.tabbedproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vijsu on 12/15/2015.
 */
public class DinnerFragment extends Fragment{
    List<MenuItems> menuItemsList;
    RecyclerView dinnerRecycler;
    public static DinnerFragment newInstance(){
        DinnerFragment fragment = new DinnerFragment();
        return fragment;
    }

    public DinnerFragment() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_dinner,container,false);
        dinnerRecycler = (RecyclerView)rootView.findViewById(R.id.dinnerRecycler);
        LinearLayoutManager llm = new LinearLayoutManager(this.getContext());
        dinnerRecycler.setLayoutManager(llm);
        dinnerRecycler.setHasFixedSize(true);
        initializeData();
        initializeAdapter();
        return rootView;
    }
    private void initializeData() {

        menuItemsList = new ArrayList<>();
        menuItemsList.add(new MenuItems("Idli","20 Rupees",R.drawable.lock));
        menuItemsList.add(new MenuItems("Idli","20 Rupees",R.drawable.lock));
        menuItemsList.add(new MenuItems("Idli","20 Rupees",R.drawable.lock));
    }
    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(menuItemsList);
        dinnerRecycler.setAdapter(adapter);
    }
}
