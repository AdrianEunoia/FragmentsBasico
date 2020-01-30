package com.adrian.fragments_basico;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    // Elementos
    Fragment idFragmentUno, idFragmentDos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
    }
    // Instancias
    private void instancias() {
        // Necesario implementar un manager para el fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        // Fragments
        idFragmentUno = fragmentManager.findFragmentById(R.id.idFragmentUno);
        idFragmentDos = fragmentManager.findFragmentById(R.id.idFragmentDos);

    }
}
