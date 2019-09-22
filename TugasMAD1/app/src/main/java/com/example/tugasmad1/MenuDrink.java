package com.example.tugasmad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MenuDrink extends AppCompatActivity implements View.OnClickListener {
    LinearLayout layout1, layout2, layout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_drink);

    layout1 = findViewById(R.id.LayoutStrawberry);
        layout1.setOnClickListener(this);

    layout2 = findViewById(R.id.LayoutCappuccino);
        layout2.setOnClickListener(this);

    layout3 = findViewById(R.id.LayoutMilo);
        layout3.setOnClickListener(this);
}

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.LayoutStrawberry:
                Intent MoveStrawberry = new Intent(this, Strawberry.class);
                startActivity(MoveStrawberry);
                break;
            case R.id.LayoutCappuccino:
                Intent MoveCappuccino  = new Intent(this, Cappuccino.class);
                startActivity(MoveCappuccino);
                break;
            case R.id.LayoutMilo:
                Intent MoveMilo = new Intent(this, Milo.class);
                startActivity(MoveMilo);
                break;
        }
    }
}

