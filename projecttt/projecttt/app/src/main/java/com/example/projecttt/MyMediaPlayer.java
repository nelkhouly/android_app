package com.example.projecttt;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

public class MyMediaPlayer extends Service {
    private MediaPlayer player;
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        player = MediaPlayer.create(this, R.raw.audio);
        player.setLooping(true);
        player.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        player.stop();
    }
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}