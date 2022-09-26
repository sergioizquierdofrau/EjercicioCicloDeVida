package com.example.ejerciciociclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HijoActivity extends AppCompatActivity {

    private Button btnCerrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijo);
        Log.e("Ciclo de vida", "Estoy ejecutando onCreate - Actividad 2");

        btnCerrar= findViewById(R.id.btnCerrarHijo);
        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Ciclo de vida", "Estoy ejecutando onStart - Actividad 2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Ciclo de vida", "Estoy ejecutando onRestart - Actividad 2");
    }

    @Override
    protected void onStop() {
        super.onStop();Log.e("Ciclo de vida", "Estoy ejecutando onStop - Actividad 2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Ciclo de vida", "Estoy ejecutando ondDestroy - Actividad 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Ciclo de vida", "Estoy ejecutando onPause - Actividad 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Ciclo de vida", "Estoy ejecutando onResume - Actividad 2");
    }
}
