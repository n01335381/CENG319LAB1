package com.example.stevenvuceng319lab1_ex1;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomFrag extends Fragment {

    TextView current_lifecycle;

    @Override

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        //
        View view = inflater.inflate(R.layout.bot_frag, container, false);
        Log.d((getString(R.string.tag)), getString(R.string.create));
        current_lifecycle= (TextView)view.findViewById(R.id.lowertextview);
        current_lifecycle.setText(getString(R.string.create));
        return view;

    }

    public void onStart() {
        super.onStart();
        Log.d((getString(R.string.tag)), getString(R.string.start));
        current_lifecycle.setText(getString(R.string.start));
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
