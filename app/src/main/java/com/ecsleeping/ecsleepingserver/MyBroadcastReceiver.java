package com.ecsleeping.ecsleepingserver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Thomas Kidd on 2017-11-26.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Test","Receiver is called");
        MyRingTone.startRingtone(context);

    }

}
