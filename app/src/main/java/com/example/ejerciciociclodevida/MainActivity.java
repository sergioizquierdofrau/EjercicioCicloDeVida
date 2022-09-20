package com.example.ejerciciociclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Ciclo de vida", "Estoy ejecutando onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Ciclo de vida", "Estoy ejecutando onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();Log.e("Ciclo de vida", "Estoy ejecutando onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Ciclo de vida", "Estoy ejecutando ondDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Ciclo de vida", "Estoy ejecutando onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Ciclo de vida", "Estoy ejecutando onResume");
    }
}