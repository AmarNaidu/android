package org.sayem.mylistview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends Activity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);

        final String [] values = new String[]{
                "The Complete Android and Java Course",
                "@pdochone",
                "Hello Friends",
                "Android is great!",
                "@pdochone",
                "Hello Friends",
                "Android is great!",
                "@pdochone",
                "Hello Friends",
                "Android is great!",
                "@pdochone",
                "Hello Friends",
                "Android is great!",
                "@pdochone",
                "Hello Friends",
                "Android is great!"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.activity_list_item,
                android.R.id.text1, values);


        // assign the adapter to listview
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int intPosition = position;
                String clickedValue = listView.getItemAtPosition(intPosition).toString();

                Toast.makeText(getApplicationContext(), clickedValue, Toast.LENGTH_LONG).show();
            }
        });
    }

}
