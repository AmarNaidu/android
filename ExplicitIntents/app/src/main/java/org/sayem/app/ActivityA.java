package org.sayem.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class ActivityA extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void gotoActivity(View v){

    }
}
