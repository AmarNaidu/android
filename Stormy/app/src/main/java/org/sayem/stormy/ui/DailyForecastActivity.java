package org.sayem.stormy.ui;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import org.sayem.stormy.R;
import org.sayem.stormy.adapters.DayAdapter;
import org.sayem.stormy.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);


        DayAdapter adapter = new DayAdapter(this, mDays);
    }
}
