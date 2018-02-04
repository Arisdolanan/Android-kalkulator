package com.app.hokagelab.kalkulator2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //buat deklarasi
    Button btnTambah, btnKurang, btnBagi, btnKali, btnHapus;
    EditText dAngka2,dAngka1;
    TextView txthasil;

    //deklarasi variabel
    String angka1, angka2;
    Double hasil=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Awal
        dAngka1 = (EditText) findViewById(R.id.editAngka1);
        dAngka2 = (EditText) findViewById(R.id.editAngka2);
        txthasil = (TextView) findViewById(R.id.textHasil);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnBagi = (Button) findViewById(R.id.btnBagi);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnHapus = (Button) findViewById(R.id.btnHapus);
        //Akhir

        angka1 = dAngka1.getText().toString();
        angka2 = dAngka2.getText().toString();


        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1 = dAngka1.getText().toString();
                angka2 = dAngka2.getText().toString();
                if(angka1.equalsIgnoreCase("") || angka2.equalsIgnoreCase("")){
                    Snackbar.make(view, "Belum di isi", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }else{
                    hasil = Double.valueOf(angka1) + Double.valueOf(angka2);
                    txthasil.setText(String.valueOf(hasil));
                }
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1 = dAngka1.getText().toString();
                angka2 = dAngka2.getText().toString();

                if(angka1.equalsIgnoreCase("") || angka2.equalsIgnoreCase("")){
                    Snackbar.make(view, "Belum di isi", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }else{
                    hasil = Double.valueOf(angka1) - Double.valueOf(angka2);
                    txthasil.setText(String.valueOf(hasil));
                }
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1 = dAngka1.getText().toString();
                angka2 = dAngka2.getText().toString();
                if(angka1.equalsIgnoreCase("") || angka2.equalsIgnoreCase("")){
                    Snackbar.make(view, "Belum di isi", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }else{
                    hasil = Double.valueOf(angka1) / Double.valueOf(angka2);
                    txthasil.setText(String.valueOf(hasil));
                }

            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1 = dAngka1.getText().toString();
                angka2 = dAngka2.getText().toString();
                if(angka1.equalsIgnoreCase("") || angka2.equalsIgnoreCase("")){
                    Snackbar.make(view, "Belum di isi", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }else{
                    hasil = Double.valueOf(angka1) * Double.valueOf(angka2);
                    txthasil.setText(String.valueOf(hasil));
                }
            }
        });

        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasil = 0.0;

                dAngka1.setText("");
                dAngka2.setText("");
                txthasil.setText(String.valueOf(hasil));

            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(MainActivity.this, Pembuat.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
