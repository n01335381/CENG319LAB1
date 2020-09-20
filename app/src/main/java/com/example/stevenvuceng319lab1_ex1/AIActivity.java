package com.example.stevenvuceng319lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AIActivity extends AppCompatActivity{

    TextView current_ai_lifecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aiactivity);
        current_ai_lifecycle= (TextView)findViewById(R.id.aitextview);
        current_ai_lifecycle.setText(getString(R.string.create));
    }

    public void onStart() {
        super.onStart();
        Log.d((getString(R.string.tag)), getString(R.string.start));
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
