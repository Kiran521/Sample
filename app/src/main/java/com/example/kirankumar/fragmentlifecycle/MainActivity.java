package com.example.kirankumar.fragmentlifecycle;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("Kiran", "Oncrete() in Activity");
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.d("Kiran","OnAttachFragment() in Activity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("Kiran", "onStart() in Activity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("Kiran", "onRestart() in Activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Kiran", "onResume() in Activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Kiran", "onPause() in Activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Kiran", "onStop() in Activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Kiran", "onDestroy() in Activity");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.v("Kiran", "onSaveInstanceState() in Activity");
    }

}
