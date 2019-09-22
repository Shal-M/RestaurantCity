package com.example.tugasmad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NasiGoreng extends AppCompatActivity implements View.OnClickListener{

    Button btnPesan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasi_goreng);
        btnPesan = findViewById(R.id.btnPesan);
        btnPesan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnPesan:
                Toast.makeText(this, "Nasi Goreng telah dipesan", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
