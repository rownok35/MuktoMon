package com.example.muktomon2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.muktomon2.R;

import java.util.ArrayList;
import java.util.List;

import io.kommunicate.KmConversationBuilder;
import io.kommunicate.Kommunicate;
import io.kommunicate.callbacks.KmCallback;

public class MainActivity extends AppCompatActivity {

    Button selfcarebtn,chatbotbtn,dochelpbtn,btn,hotlinebtn;
    MediaPlayer ring;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Kommunicate.init(MainActivity.this, "28c557d4d7f0c3af4f987154461688f13");

        //ring= MediaPlayer.create(MainActivity.this,R.raw.lullaby);
        //ring.start();

        selfcarebtn=findViewById(R.id.selfcarebtn);
        btn=findViewById(R.id.button);
        dochelpbtn=findViewById(R.id.doctorhelpbtn);
        hotlinebtn=findViewById(R.id.helplinebtn);

        selfcarebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent=new Intent(MainActivity.this,Selfcare.class);
                startActivity(homeintent);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<String> agentList = new ArrayList();
                agentList.add("rohitzaman00@gmail.com"); //add your agentID
                List<String> botList = new ArrayList();
                botList.add("srz-ifval"); //enter your integrated bot Ids
                new KmConversationBuilder(MainActivity.this)
                        .launchConversation(new KmCallback() {
                            @Override
                            public void onSuccess(Object message) {
                                Log.d("Conversation", "Success : " + message);
                            }

                            @Override
                            public void onFailure(Object error) {
                                Log.d("Conversation", "Failure : " + error);
                            }
                        });
            }
        });

        dochelpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent=new Intent(MainActivity.this,helpful_website.class);
                startActivity(homeintent);
            }
        });
        hotlinebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent=new Intent(MainActivity.this,hotline.class);
                startActivity(homeintent);
            }
        });

    }

    /*@Override
    protected void onPause() {
        super.onPause();
        ring.release();
    }*/
}
