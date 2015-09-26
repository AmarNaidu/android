package org.sayem.popularmovies;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView mGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGridView = (GridView) findViewById(R.id.moviesGridView);
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

    class GridAdapter extends BaseAdapter{

        ArrayList<Movies> mMovies;


        public GridAdapter(Context context) {
            mMovies = new ArrayList<>();
            Resources resources = context.getResources();
            String[] tempMovies = resources.getStringArray(R.array.movies);
            int[] moviesImage = {
                    R.drawable.americangangster,
                    R.drawable.bladerunner,
                    R.drawable.happygilmore,
                    R.drawable.hugo,
                    R.drawable.hulk,
                    R.drawable.inception,
                    R.drawable.pursuitofhappyness,
                    R.drawable.reception,
                    R.drawable.skyfall,
                    R.drawable.threehundred,
                    R.drawable.twilight,
                    R.drawable.gamer};

            for (int i = 0; i < moviesImage.length; i++){
                Movies tempMovie = new Movies(moviesImage[i], tempMovies[i]);
                mMovies.add(tempMovie);
            }
        }

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }
    }
}
