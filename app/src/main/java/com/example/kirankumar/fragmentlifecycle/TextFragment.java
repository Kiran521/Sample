package com.example.kirankumar.fragmentlifecycle;

/**
 * Created by kirankumar on 7/2/17.
 */

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class TextFragment extends Fragment {
    TextView text, vers;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("Kiran","OnAttach() in Fragment");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Kiran","OnSaveInstanceState() in Fragment");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Kiran","OnStart() in Fragment");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Kiran","OnStop() in Fragment");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Kiran","OnResume() in Fragment");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Kiran","OnPause() in Fragment");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Kiran","OnDestroyView() in Fragment");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Kiran","OnDestroy() in Fragment");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Kiran","OnDetach() in Fragment");
    }

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Log.d("Kiran","OnCreateView() in Fragment");
        View view = inflater.inflate(R.layout.text_fragment, container, false);
        text = (TextView) view.findViewById(R.id.AndroidOs);
        vers = (TextView) view.findViewById(R.id.Version);
        return view;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Kiran","OnActivityCreated() in Fragment");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Kiran","OnCreate() in Fragment");
    }

    public void change(String txt, String txt1) {
        text.setText(txt);
        vers.setText(txt1);

    }
}
