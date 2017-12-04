package com.ecsleeping.ecsleepingserver;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.net.Uri;

/**
 * Created by Thomas Kidd on 2017-11-28.
 */

public class MyRingTone {

    private static Uri alarmUri;
    private static Ringtone ringtone;
    private static MediaPlayer mediaPlayer;

    public static void startRingtone(Context context) {

        // this will update the UI with message
        try {
            MainActivity.setAlarmOn(true);
            mediaPlayer = MediaPlayer.create(context, R.raw.ringtone);
            mediaPlayer.start();

        } catch (Exception ex) {

        }
    }

    public static void pauseRingtone() {
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    public static void unPauseRingtone() {
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    public static void stopRingtone() {
        if(mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
