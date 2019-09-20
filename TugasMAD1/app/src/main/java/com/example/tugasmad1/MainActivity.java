package com.example.tugasmad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnFood;
    Button btnDrink;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFood = findViewById(R.id.btn_makanan);
        btnFood.setOnClickListener(this);

        btnDrink = findViewById(R.id.btn_minuman);
        btnDrink.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_makanan:
                Intent intentFood = new Intent(this, MenuFood.class);
                startActivity(intentFood);
                break;

            case R.id.btn_minuman:
                Intent intentDrink = new Intent(this, MenuDrink.class);
                startActivity(intentDrink);
                break;
        }
    }
}
