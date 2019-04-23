package com.example.android.lamusique;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class nowPlaying extends AppCompatActivity {

    MediaPlayer mySong;
    MediaPlayer mySong2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        mySong = MediaPlayer.create(nowPlaying.this, R.raw.song);

        TextView musicLibrary = (TextView) findViewById(R.id.musicLibrary);
        musicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicLibraryIntent = new Intent(nowPlaying.this, musicLibrary.class);
                startActivity(musicLibraryIntent);
            }
        });

        TextView songDetail = (TextView) findViewById(R.id.songDetail);
        songDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songDetailIntent = new Intent(nowPlaying.this, songDetail.class);
                startActivity(songDetailIntent);
            }
        });

        TextView playLists = (TextView) findViewById(R.id.playLists);
        playLists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playListsIntent = new Intent(nowPlaying.this, playLists.class);
                startActivity(playListsIntent);
            }
        });

    }

    public void stop(View view) {
        Toast.makeText(this, "Stops the current playing song", Toast.LENGTH_SHORT).show();
        mySong.release();
    }

    public void pause(View view) {
        Toast.makeText(this, "Pauses the current playing song", Toast.LENGTH_SHORT).show();
        mySong.pause();
    }

    public void previous(View view) {
        Toast.makeText(this, "Plays the previous song", Toast.LENGTH_SHORT).show();
    }

    public void play(View view) {
        Toast.makeText(this, "Plays the selected song", Toast.LENGTH_SHORT).show();
        mySong.start();
    }

    public void next(View view) {
        Toast.makeText(this, "Plays the next song", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mySong.release();
    }
}
