package com.example.basti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Principal1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal1);

        TabLayout tl = (TabLayout) findViewById(R.id.tablayout);
        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                switch (position){
                    case 0:
                        Temperatura t = new Temperatura();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,t).commit();
                        break;
                    case 1:
                        Luz l = new Luz();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,l).commit();
                        break;
                    case 2:
                        Puerta p = new Puerta();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,p).commit();
                        break;
                    case 3:
                        Registros r = new Registros();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,r).commit();
                        break;
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}