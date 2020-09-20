package com.example.stevenvuceng319lab1_ex1;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomFrag extends Fragment {

TextView tvDefinition;

    @Override

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        //
        View view = inflater.inflate(R.layout.bot_frag, container, false);
        tvDefinition= (TextView)view.findViewById(R.id.definition);

        return view;

    }
    public void display(String definition) {
        tvDefinition.setText(definition);
    }

}
