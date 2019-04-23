package com.example.android.lamusique;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(payment.this, nowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        TextView musicLibrary = (TextView) findViewById(R.id.musicLibrary);
        musicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicLibraryIntent = new Intent(payment.this, musicLibrary.class);
                startActivity(musicLibraryIntent);
            }
        });

        TextView playLists = (TextView) findViewById(R.id.playLists);
        playLists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playListsIntent = new Intent(payment.this, playLists.class);
                startActivity(playListsIntent);
            }
        });

        TextView pay1 = (TextView) findViewById(R.id.net);
        pay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(payment.this, "Redirect to hdfc net banking", Toast.LENGTH_SHORT).show();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://netbanking.hdfcbank.com/netbanking/"));
                startActivity(browserIntent);
            }
        });


        TextView pay2 = (TextView) findViewById(R.id.card);
        pay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(payment.this, "Redirect to hdfc credit card payment", Toast.LENGTH_SHORT).show();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.billdesk.com/pgidsk/pgmerc/hdfccard/"));
                startActivity(browserIntent);
            }
        });


        TextView pay3 = (TextView) findViewById(R.id.paytm);
        pay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(payment.this, "Redirect to paytm website", Toast.LENGTH_SHORT).show();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://paytm.com/"));
                startActivity(browserIntent);
            }
        });


        TextView buy = (TextView) findViewById(R.id.buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(payment.this, "Your song has been added", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void songName(View view) {
        Toast.makeText(this, "Displays song name", Toast.LENGTH_SHORT).show();
    }

    public void artistName(View view) {
        Toast.makeText(this, "Displays artist name", Toast.LENGTH_SHORT).show();
    }

    public void albumName(View view) {
        Toast.makeText(this, "Displays album name", Toast.LENGTH_SHORT).show();
    }
}
