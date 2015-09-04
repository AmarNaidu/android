package org.sayem.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseUser;

/**
 * Created by syed.sayem on 8/26/15.
 */
public class RibiitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "3xbB8PvEe07772aSsqrHZHslbYCfY2pFyldCmqrr", "zA2a7NvIRQd1cU6HjD3PwSpmXetSo3gYBo6odLH8");



    }
}
