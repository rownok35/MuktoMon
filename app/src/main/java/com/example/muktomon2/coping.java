package com.example.muktomon2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class coping extends AppCompatActivity {
    Button thinkingbtn,positivebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coping);
        thinkingbtn=findViewById(R.id.thinkingbtn);
        positivebtn=findViewById(R.id.posstepbtn);
        thinkingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(coping.this,thinking.class);
                startActivity(intent);
            }
        });

        positivebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(coping.this,positivestep.class);
                startActivity(intent);
            }
        });

    }
}
