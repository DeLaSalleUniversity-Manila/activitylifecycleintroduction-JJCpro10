package com.example.janssen.activitylifecycleintroduction;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private static final String DEBUG_TAG = "MainActivity";

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(DEBUG_TAG, "onStart() method was called... (Tinawag po ang onStart())");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(DEBUG_TAG, "onStop() method was called... (Tinawag po ang onStop())");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(DEBUG_TAG, "onPause() method was called... (Tinawag po ang onPause())");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(DEBUG_TAG, "onDestroy() method was called... (Tinawag po ang onDestroy())");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        Log.d(DEBUG_TAG, "onSaveInstanceState() method was called... (Tinawag po ang onSaveInstanceState())");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(DEBUG_TAG, "onResume() method was called... (Tinawag po ang onResume())");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(DEBUG_TAG, "onRestart() method was called... (Tinawag po ang onRestart())");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
