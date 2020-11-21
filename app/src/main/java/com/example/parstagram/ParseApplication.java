package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MavttbT5srpArJ1Y2eOzz8gIF9I9GPXebE2Nwgvs")
                .clientKey("KAEHBWWxryKeLB5MseVnx6PiPPQAgi39e5I6TUPj")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
