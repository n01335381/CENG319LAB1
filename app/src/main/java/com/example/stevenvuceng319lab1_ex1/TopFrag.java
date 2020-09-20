package com.example.stevenvuceng319lab1_ex1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;

public class TopFrag extends ListFragment {

    String[] activities = new String[]
        {
                "AIActivity",
                "VRActivity"
        };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view =inflater.inflate(R.layout.top_frag, container, false);

    ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
            android.R.layout.simple_list_item_1,activities);
        //ArrayAdapter calls toString() on each array item and places in a TextView
        //this creates a view for each array item
    setListAdapter(adapter); //binding list view to the array adapter

    return view;
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

    }

}
