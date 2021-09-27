package com.example.bem_te_vi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnBtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBtv = (ImageButton) findViewById(R.id.btnBemTeVi);
        final MediaPlayer playBemTeVi = MediaPlayer.create(this, R.raw.bem_te_vi);
        getSupportActionBar().hide();

        btnBtv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                playBemTeVi.start();
            }
        });
    }
}