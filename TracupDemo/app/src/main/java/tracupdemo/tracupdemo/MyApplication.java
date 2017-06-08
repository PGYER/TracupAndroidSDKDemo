package tracupdemo.tracupdemo;

import android.app.Application;

import com.tracup.library.Tracup;

/**
 * Created by Tao9jiu on 17/5/25.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Tracup tracup = new Tracup.Builder(this,"bb2e96efa23c3183fceceb045645c1cd","5b1fe789c1cd3789594c82bc78aef01e")
                        .build();



        //启动时设置：
//        Tracup tracup = new Tracup.Builder(this,"","")
//                .setEmailFiledRequied(false)
//                .setEmailFiledVisibility(false)
//                .setShakingThreshold(300)
//                .setShouldPlaySounds(true)
//                .setIntroMessageenabled(true)
//                .build();
    }
}
