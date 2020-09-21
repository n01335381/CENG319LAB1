package com.example.stevenvuceng319lab1_ex1;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class BottomFrag extends Fragment {  //note of extends fragment

    TextView current_lifecycle;

    @Override

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        //onCreateView needed for fragments + inflater,viewgroup etc.
        View view = inflater.inflate(R.layout.bot_frag, container, false); //establishing a view?
        Log.d((getString(R.string.tag)), getString(R.string.create));//string variable, not hardcoded
        current_lifecycle= (TextView)view.findViewById(R.id.lowertextview); //view.findViewByID needed for frags, not just findViewById
        current_lifecycle.setText(getString(R.string.create));//to make a list, do .append and add a +"/n" to all similiar lines
        Toast.makeText(getActivity(), getString(R.string.create), Toast.LENGTH_SHORT).show();
        return view;

    }

    public void onStart() {
        super.onStart();
        Log.d((getString(R.string.tag)), getString(R.string.start));
        current_lifecycle.setText(getString(R.string.start));
        Toast.makeText(getActivity(), getString(R.string.start), Toast.LENGTH_SHORT).show();
    }
    public void onPause()
    {
        super.onPause();
        Log.d((getString(R.string.tag)), getString(R.string.pause));
        current_lifecycle.setText(getString(R.string.pause));
    }
    //
    public void onStop()
    {
        super.onStop();
        Log.d((getString(R.string.tag)), getString(R.string.stop));
        current_lifecycle.setText(getString(R.string.stop));
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d((getString(R.string.tag)), getString(R.string.destroy));
        current_lifecycle.setText(getString(R.string.destroy));
    }

}
