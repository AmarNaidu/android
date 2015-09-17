package org.sayem.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup mRadioGroup;
    private RadioButton mRadioChoiceButton;
    private TextView mShowChoiceTextView;
    private Button mShowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowChoiceTextView = (TextView) findViewById(R.id.showTextView);
        mRadioGroup = (RadioGroup) findViewById(R.id.radioGroupId);
        mShowButton = (Button) findViewById(R.id.showChoiceButton);


        mShowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedOption = mRadioGroup.getCheckedRadioButtonId();

                mRadioChoiceButton = (RadioButton) findViewById(selectedOption);
                mShowChoiceTextView.setText(mRadioChoiceButton.getText());
            }
        });
    }
}
