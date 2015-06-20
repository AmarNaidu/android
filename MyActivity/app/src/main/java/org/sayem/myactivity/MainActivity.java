package org.sayem.myactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplication(), "OnStart Methods call", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplication(), "OnPause Methods call", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplication(), "OnRestart Methods call", Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplication(), "OnResume Methods call", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplication(), "OnStop Methods call", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplication(), "OnDestroy Methods call", Toast.LENGTH_LONG).show();

    }
}
