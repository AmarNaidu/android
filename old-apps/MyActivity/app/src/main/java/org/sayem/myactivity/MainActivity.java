package org.sayem.myactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    private Button myButton;
    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myButton = (Button) findViewById(R.id.button);

        myButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondAcitivty.class);
                intent.putExtra("ActivityOne", "I am from the First ");
                startActivity(intent);

                startActivityForResult(intent, REQUEST_CODE);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == REQUEST_CODE){

            if (resultCode == RESULT_OK){

                String result = data.getStringExtra("returnData");

                Toast.makeText(this, result, Toast.LENGTH_LONG).show();
            }
        }
    }
}
