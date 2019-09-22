package com.example.tugasmad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MenuFood extends AppCompatActivity implements View.OnClickListener{
    LinearLayout layout1, layout2, layout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_food);

        layout1 = findViewById(R.id.LayoutNasiGoreng);
        layout1.setOnClickListener(this);

        layout2 = findViewById(R.id.LayoutSpaghetti);
        layout2.setOnClickListener(this);

        layout3 = findViewById(R.id.LayoutNasiMentega);
        layout3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.LayoutNasiGoreng:
                Intent MoveNasiGoreng = new Intent(this, NasiGoreng.class);
                startActivity(MoveNasiGoreng);
                break;
            case R.id.LayoutSpaghetti:
                Intent MoveSpaghetti  = new Intent(this, Spaghetti.class);
                startActivity(MoveSpaghetti);
                break;
            case R.id.LayoutNasiMentega:
                Intent MoveNasiMentega = new Intent(this, NasiMentega.class);
                startActivity(MoveNasiMentega);
                break;
        }
    }
}
