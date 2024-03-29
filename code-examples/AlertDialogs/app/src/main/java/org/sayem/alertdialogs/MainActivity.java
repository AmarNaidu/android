package org.sayem.alertdialogs;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button showDialog;
    private AlertDialog.Builder dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showDialog = (Button) findViewById(R.id.showButtonId);
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new AlertDialog.Builder(MainActivity.this);

                dialog.setTitle(getResources().getString(R.string.dialoge_title));
                dialog.setMessage(getResources().getString(R.string.dialog_message));

                dialog.setCancelable(false);

                dialog.setIcon(android.R.drawable.btn_star);

                // set Positive button
                dialog.setPositiveButton(getResources().getString(R.string.positive_button),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // exist
                                MainActivity.this.finish();
                            }
                        });

                dialog.setNegativeButton(getResources().getString(R.string.negative_button),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // dialog cancel
                                dialog.cancel();
                            }
                        });

                AlertDialog alertD = dialog.create();
                alertD.show();
            }
        });


    }

}
