package com.example.muktomon2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thinking extends AppCompatActivity {
    Button chintabtn;
    int count1=0;
    MediaPlayer ring1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thinking);
        chintabtn=findViewById(R.id.chintabtn);
        chintabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count1 == 0){
                    chintabtn.isEnabled();
                    ring1= MediaPlayer.create(thinking.this,R.raw.chintadhara);
                    ring1.start();
                    count1++;
                }else if (count1 >= 1)
                    chintabtn.setClickable(false);

            }
        });
    }
    @Override
    protected void onPause() {
        super.onPause();
        ring1.release();

    }
}
