package com.example.ejerciciociclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Variables de vista
    private Button btnAbrirHijo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Ciclo de vida", "Estoy ejecutando onCreate - Actividad 1");

        btnAbrirHijo = findViewById(R.id.btnAct2AbrirMain);

        btnAbrirHijo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* Intent ==> Conductor para creación y apertura de actividades
                *
                *
                * - Implicitos: Ya programados -> Camara, Galeria, Operaciones, Estandar del movil
                * - Expicitos : Programamos para abrir nuestras actividades
                *       -Context -> La actividad en la que estoy (Retorno)
                *       - Destino -> La actividad que quiero abrir
                 */
                Intent intent = new Intent(MainActivity.this, HijoActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Ciclo de vida", "Estoy ejecutando onStart - Actividad 1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Ciclo de vida", "Estoy ejecutando onRestart - Actividad 1");
    }

    @Override
    protected void onStop() {
        super.onStop();Log.e("Ciclo de vida", "Estoy ejecutando onStop - Actividad 1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Ciclo de vida", "Estoy ejecutando ondDestroy - Actividad 1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Ciclo de vida", "Estoy ejecutando onPause - Actividad 1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Ciclo de vida", "Estoy ejecutando onResume - Actividad 1");
    }
}