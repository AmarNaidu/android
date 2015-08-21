package org.sayem.funfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private FactBook mFactBook =new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    public static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare our View variables
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFact();

                // Update the label with our dynamic fact
                factLabel.setText(fact);

                int color = mColorWheel.getColor();

                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);

            }
        };
        showFactButton.setOnClickListener(listener);
//        Toast.makeText(this, TAG, Toast.LENGTH_LONG).show();
        Log.d(TAG, "We're logging from the onCreate() method");



    }

}
