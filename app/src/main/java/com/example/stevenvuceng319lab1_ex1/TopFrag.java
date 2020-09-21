package com.example.stevenvuceng319lab1_ex1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;

public class TopFrag extends ListFragment { //list fragment, not fragment for this case

    String[] activities = new String[] //how to make a new string array
        {
                "AIActivity", //hardcoded?
                "VRActivity" //have not yet learned how to use xml variables for arrays
        }; //listview instead of buttons. onclicklistener built below for interaction

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view =inflater.inflate(R.layout.top_frag, container, false);

    ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
            android.R.layout.simple_list_item_1,activities);
        //ArrayAdapter calls toString() on each array item and places them in a separate TextView
        //this creates a view/display for each array item
    setListAdapter(adapter); //binding list view to the array adapter

    return view;
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) { //action listener, for list item?

        super.onListItemClick(l, v, position,id);

        Intent choice; //declaring intent, to later launch an activity
        switch(position){ //position of selection in array?

            case 0:
                choice = new Intent(getActivity(),AIActivity.class);//creating intent for ai or vr activity
                startActivity(choice);// launching it
                break;

            case 1:
                choice = new Intent(getActivity(),VRActivity.class); //same as above
                startActivity(choice);//ditto
                break;

            default:
                break;

        }
    }

}
