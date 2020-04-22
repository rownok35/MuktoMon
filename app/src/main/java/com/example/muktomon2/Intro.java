package com.example.muktomon2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

import com.example.muktomon2.R;

public class Intro extends AppCompatActivity {
    VideoView video2;
    MediaPlayer mMediaPlayer;
    int mcurrentvideoposition;
    private static int splash_time_out=4300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


        video2=findViewById(R.id.video2);
        String path="android.resource://"+getPackageName()+"/"+R.raw.intro;
        Uri u=Uri.parse(path);
        video2.setVideoURI(u);
        video2.start();

        video2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mMediaPlayer=mediaPlayer;
                mMediaPlayer.setLooping(true);
                //if(mcurrentvideoposition!=0){
                //  mMediaPlayer.seekTo(mcurrentvideoposition);
                //mMediaPlayer.start();
                //}
            }
        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeintent=new Intent(Intro.this,MainActivity.class);
                startActivity(homeintent);
                finish();

            }
        },splash_time_out);
    }
    @Override
    protected void onResume(){
        super.onResume();
        video2.start();

    }
    @Override
    protected void onPause(){
        super.onPause();
        mcurrentvideoposition=mMediaPlayer.getCurrentPosition();
        video2.pause();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        mMediaPlayer.release();
        mMediaPlayer=null;

    }
}
