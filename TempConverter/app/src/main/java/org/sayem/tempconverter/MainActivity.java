package org.sayem.tempconverter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    // 6:39
    private EditText tempEditText;
    private Button celButton;
    private Button fButton;
    private TextView showTempTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tempEditText = (EditText) findViewById(R.id.editText);
        celButton = (Button) findViewById(R.id.cButton);
        fButton = (Button) findViewById(R.id.fButton);
        showTempTextView = (TextView) findViewById(R.id.showResultTextView);

        celButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Convert to Celsius
                String editTextVal = tempEditText.getText().toString();
                if (editTextVal.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Enter a Value", Toast.LENGTH_LONG).show();
                }else {
                    double intEditText = Double.parseDouble(editTextVal);
                    convertToCelsius(intEditText);
                }


            }
        });

        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Convert to Fahrenheit
                String editTextVal = tempEditText.getText().toString();
                if (editTextVal.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Enter a Value", Toast.LENGTH_LONG).show();
                }else {
                    double intEditText = Double.parseDouble(editTextVal);
                    convertToFahrenheit(intEditText);
                }

            }
        });

    }

    public double convertToCelsius(double farVal){
        return 0;
    }

    public double convertToFahrenheit(double celVal){
        return 0;
    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
