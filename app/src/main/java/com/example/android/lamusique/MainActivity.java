package com.example.android.lamusique;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mySong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySong = MediaPlayer.create(MainActivity.this, R.raw.song);

        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, nowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        TextView songDetail = (TextView) findViewById(R.id.songDetail);
        songDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songDetailIntent = new Intent(MainActivity.this, songDetail.class);
                startActivity(songDetailIntent);
            }
        });


        TextView musicLibrary = (TextView) findViewById(R.id.musicLibrary);
        musicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicLibraryIntent = new Intent(MainActivity.this, musicLibrary.class);
                startActivity(musicLibraryIntent);
            }
        });

        TextView playLists = (TextView) findViewById(R.id.playLists);
        playLists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playListsIntent = new Intent(MainActivity.this, playLists.class);
                startActivity(playListsIntent);
            }
        });

        TextView payment = (TextView) findViewById(R.id.payment);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(MainActivity.this, payment.class);
                startActivity(paymentIntent);
            }
        });

    }

    public void browser(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/"));
        startActivity(browserIntent);
    }

    public void play(View view) {
        Toast.makeText(this, "Plays the selected song", Toast.LENGTH_SHORT).show();
        mySong.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mySong.release();
    }
}
