package com.joinsecurity.radio.radio;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

//    String mms_url = "http://mp3.polskieradio.pl:8912";
//    String mms_url = "http://sc3.audiorealm.com:10232"; //华人之声
//    String mms_url = "http://http.qingting.fm/336.mp3";//北京交通广播
//    String mms_url = "http://http.qingting.fm/1646.mp3";;//河北交通广播
//    String mms_url = "http://http.qingting.fm/20234.mp3";;//河北交通广播
//    String mms_url = "http://http.qingting.fm/1006.mp3";//CRI轻松调频
    String mms_url = "http://http.qingting.fm/1007.mp3";//国际流行音乐

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = new Button(this);
        button.setText("Hit me");
        setContentView(button);

        final MediaPlayer player = new MediaPlayer();

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.i(TAG, "playing a mms stream ...");
                try {
                    player.setDataSource(mms_url);
                    player.prepare();
                    player.start();
                } catch (Exception e) {
                    Log.e(TAG, e.getMessage(), e);
                }
            }
        });
    }
}
