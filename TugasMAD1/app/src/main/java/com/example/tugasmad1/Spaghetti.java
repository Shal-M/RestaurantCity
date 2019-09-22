package com.example.tugasmad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Spaghetti extends AppCompatActivity implements View.OnClickListener{

    Button btnpesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spaghetti);

        btnpesan = findViewById(R.id.btnPesan);
        btnpesan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnPesan:
                Toast.makeText(this, "Spaghetti telah dipesan", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
