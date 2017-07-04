package com.example.luisb.ciclodevidaactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, getResources().getString(R.string.onCreate),Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, getResources().getString(R.string.onStart),Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, getResources().getString(R.string.onResume),Toast.LENGTH_SHORT).show();
    }

    //----------------- Actividad corriendo--------------

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, getResources().getString(R.string.onRestart),Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, getResources().getString(R.string.onPause),Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, getResources().getString(R.string.onStop),Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, getResources().getString(R.string.onDestroy),Toast.LENGTH_SHORT).show();
    }
}

