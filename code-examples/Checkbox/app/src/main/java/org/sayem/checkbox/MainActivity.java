package org.sayem.checkbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private CheckBox checkBoxDog;
  private CheckBox checkBoxCat;
  private CheckBox checkBoxDragon;

  private Button showButton;
  private TextView showTextView;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    showTextView = (TextView) findViewById(R.id.show_textview_id);
    checkBoxDog = (CheckBox) findViewById(R.id.dog);
    checkBoxCat = (CheckBox) findViewById(R.id.cat);
    checkBoxDragon = (CheckBox) findViewById(R.id.dragon);

    showButton = (Button) findViewById(R.id.showButtonId);

    showButton.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {

        StringBuilder builder = new StringBuilder();
        builder.append(checkBoxDog.getText().toString() + " status is: " + checkBoxDog.isChecked() + "\n");
        builder.append(checkBoxCat.getText().toString() + " status is: " + checkBoxCat.isChecked()+ "\n");
        builder.append(checkBoxDragon.getText().toString() + " status is: " + checkBoxDragon.isChecked()+ "\n");
        showTextView.setText(builder);
      }
    });

  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
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
