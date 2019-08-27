package com.Fitriyani.kelilingkubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnpanjang = findViewById(R.id.kubus);
        btnpanjang.setOnClickListener(this);

        Button btnlingkaran = findViewById(R.id.btnlingkaran);
        btnlingkaran.setOnClickListener(this);

        Button btnsegitiga = findViewById(R.id.btnsegitiga);
        btnsegitiga.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.kubus:
                Intent moveIntent = new Intent(MainActivity.this, HitungPersegiPanjang.class);
            startActivity(moveIntent);
            break;
            case R.id.balok:
                Intent moveIntentt = new Intent(MainActivity.this, Lingkaran.class);
                startActivity(moveIntentt);
            break;
           
    }
}
