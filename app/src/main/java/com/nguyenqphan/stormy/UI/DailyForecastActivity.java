package com.nguyenqphan.stormy.UI;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.nguyenqphan.stormy.R;
import com.nguyenqphan.stormy.adapters.DayAdapter;
import com.nguyenqphan.stormy.weather.Day;

import java.util.Arrays;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class DailyForecastActivity extends Activity {

    private Day[] mDays;

    @InjectView(android.R.id.list) ListView mListView;
    @InjectView(android.R.id.empty) TextView mEmptyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);
        ButterKnife.inject(this);

        /*
        **replace with the custom adapter
        String[] daysOfTheWeek ={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                daysOfTheWeek);
        setListAdapter(adapter);
        */

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.DAILY_FORECAST);
        mDays = Arrays.copyOf(parcelables, parcelables.length, Day[].class);

        DayAdapter adapter = new DayAdapter(this,mDays);
        mListView.setAdapter(adapter);
        mListView.setEmptyView(mEmptyTextView);
      mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              String dayOfTheWeek = mDays[position].getDayOfTheWeek();
              String conditions = mDays[position].getSummary();
              String highTemp = mDays[position].getTemperatureMax() + "";

              String message = String.format("On %s the high will be %s and it will be %s",
                      dayOfTheWeek, highTemp, conditions);
              Toast.makeText(DailyForecastActivity.this, message, Toast.LENGTH_LONG).show();

          }

      });
        //setListAdapter(adapter);

    }





}
