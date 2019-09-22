package com.example.tugasmad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Milo extends AppCompatActivity implements View.OnClickListener{
    Button btnPesan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milo);

        btnPesan = findViewById(R.id.btnPesan);
        btnPesan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnPesan:
                Toast.makeText(this, "Milo telah dipesan", Toast.LENGTH_SHORT).show();
        }
    }
}
