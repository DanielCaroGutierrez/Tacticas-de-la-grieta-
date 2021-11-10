package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_principal);

        Button bt1 = (Button) findViewById(R.id.BasicosMapa);
        bt1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(PrincipalActivity.this, PrinciplesBasicsMap.PrinciplesBasics.class ));

            }
        });

        Button bt2 = (Button) findViewById(R.id.aprendecampeones);
        bt2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View vie) {
                startActivity(new Intent(PrincipalActivity.this, AprendeCampeones.Campeones.class ));

            }
        });
    }
}