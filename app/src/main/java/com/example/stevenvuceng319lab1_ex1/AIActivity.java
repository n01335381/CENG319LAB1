package com.example.stevenvuceng319lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AIActivity extends AppCompatActivity{ //AppCompatActivity needed?

    TextView current_ai_lifecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //onCreate is for full scale activities( not fragments, of which onCreateView is needed)
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aiactivity); //to create/ display the view
        current_ai_lifecycle= (TextView)findViewById(R.id.aitextview); //for full scale activites, we dont need view.findViewById. just findview
        current_ai_lifecycle.setText(getString(R.string.create));//string variable, not hardcoded
    }

    public void onStart() {
        super.onStart();
        Log.d((getString(R.string.tag)), getString(R.string.start)); //log.d( tag, message) so tag is needed
        current_ai_lifecycle.setText(getString(R.string.start));
    }
    public void onPause()
    {
        super.onPause();
        Log.d((getString(R.string.tag)), getString(R.string.pause));
        current_ai_lifecycle.setText(getString(R.string.pause));
    }
    public void onStop()
    {
        super.onStop();
        Log.d((getString(R.string.tag)), getString(R.string.stop));
        current_ai_lifecycle.setText(getString(R.string.stop));
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d((getString(R.string.tag)), getString(R.string.destroy));
        current_ai_lifecycle.setText(getString(R.string.destroy));
    }

}
