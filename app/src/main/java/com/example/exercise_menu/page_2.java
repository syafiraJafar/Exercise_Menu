package com.example.exercise_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.view.MenuItem;

public class page_2 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    int kode;
    Button Btnbund;
    Button BtnSD;
    Button Btnkot;
    Button Btnkotdo;
    Button Btnsgt;
    Button Btntrap;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_2);
        Btnkot = findViewById(R.id.persegi);
        Btnkotdo = findViewById(R.id.persegipjg);
        Btnbund = findViewById(R.id.lingkaran);
        Btntrap = findViewById(R.id.trapesium);
        Btnsgt = findViewById(R.id.segitiga);
        BtnSD = findViewById(R.id.off);
        Btnkot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kode = 1;
                PopupMenu pop = new PopupMenu(page_2.this, v);
                pop.setOnMenuItemClickListener(page_2.this);
                pop.inflate(R.menu.optionmenu);
                pop.show();
            }
        });
        Btnbund.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kode = 2;
                PopupMenu pop = new PopupMenu(page_2.this, v);
                pop.setOnMenuItemClickListener(page_2.this);
                pop.inflate(R.menu.optionmenu);
                pop.show();
            }
        });
        Btnkotdo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kode = 3;
                PopupMenu pop = new PopupMenu(page_2.this, v);
                pop.setOnMenuItemClickListener(page_2.this);
                pop.inflate(R.menu.optionmenu);
                pop.show();
            }
        });
        Btnsgt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kode = 4;
                PopupMenu pop = new PopupMenu(page_2.this, v);
                pop.setOnMenuItemClickListener(page_2.this);
                pop.inflate(R.menu.optionmenu);
                pop.show();
            }
        });
        Btntrap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kode = 5;
                PopupMenu pop = new PopupMenu(page_2.this, v);
                pop.setOnMenuItemClickListener(page_2.this);
                pop.inflate(R.menu.optionmenu);
                pop.show();
            }
        });
        BtnSD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.MK:
                int i = kode;
                if (i == 1) {
                    startActivity(new Intent(getApplicationContext(), K_Persegi.class));
                    break;
                }
                if (i == 2) {
                    startActivity(new Intent(getApplicationContext(), K_Lingkaran.class));
                    break;
                }
                if (i == 3) {
                    startActivity(new Intent(getApplicationContext(), K_Persegipanjang.class));
                    break;
                }
                if (i == 4) {
                    startActivity(new Intent(getApplicationContext(), K_Segitiga.class));
                    break;
                }
                if (i == 5) {
                    startActivity(new Intent(getApplicationContext(), K_Trapesium.class));
                    break;
                }
            case R.id.ML:
                int i2 = kode;
                if (i2 == 1) {
                    startActivity(new Intent(getApplicationContext(), L_Persegi.class));
                    break;
                }
                if (i2 == 2) {
                    startActivity(new Intent(getApplicationContext(), L_Lingkaran.class));
                    break;
                }
                if (i2 == 3) {
                    startActivity(new Intent(getApplicationContext(), L_persegipanjang.class));
                    break;
                }
                if (i2 == 4) {
                    startActivity(new Intent(getApplicationContext(), L_Segitiga.class));
                    break;
                }
                if (i2 == 5) {
                    startActivity(new Intent(getApplicationContext(), L_Trapesium.class));
                    break;
                }
        }
        return true;
    }

}
