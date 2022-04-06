package com.example.uts_2007037_mnabilfurqon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText harga, diskon;
    Button hasil;
    TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        harga = (EditText) findViewById(R.id.idharga);
        diskon = (EditText) findViewById(R.id.iddiskon);
        hasil = (Button) findViewById(R.id.hitung);
        total = (TextView) findViewById(R.id.idhargadiskon);
        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nharga = Integer.parseInt(harga.getText().toString());
                int ndiskon = Integer.parseInt(diskon.getText().toString());
                int diskon = ndiskon * nharga;
                int totaldiskon = diskon / 100;
                int totalbayar = nharga - totaldiskon;
                total.setText(String.valueOf(totalbayar));
            }
        });
    }

    public void kembali(View view) {
        startActivity(new Intent(MainActivity2.this, MainActivity.class));
        finish();
    }

    public void exit(View view) {
        moveTaskToBack(true);
    }
}