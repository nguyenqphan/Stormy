package com.nguyenqphan.stormy.weather;

import com.nguyenqphan.stormy.R;

/**
 * Created by nguyenphan on 7/31/15.
 */
public class
        Forecast {
    private Current mCurrent;
    private Hour[] mHourlyForcast;
    private Day[] mDailyForecast;

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Hour[] getHourlyForcast() {
        return mHourlyForcast;
    }

    public void setHourlyForecast(Hour[] hourlyForcast) {
        mHourlyForcast = hourlyForcast;
    }

    public Day[] getDailyForecast() {
        return mDailyForecast;
    }

    public void setDailyForecast(Day[] dailyForecast) {
        mDailyForecast = dailyForecast;
    }

    public static int getIconId(String iconString){
        int iconId = R.mipmap.clear_day;
        if (iconString.equals("clear-day")) {
            iconId = R.mipmap.clear_day;
        }
        else if (iconString.equals("clear-night")) {
            iconId = R.mipmap.clear_night;
        }
        else if (iconString.equals("rain")) {
            iconId = R.mipmap.rain;
        }
        else if (iconString.equals("snow")) {
            iconId = R.mipmap.snow;
        }
        else if (iconString.equals("sleet")) {
            iconId = R.mipmap.sleet;
        }
        else if (iconString.equals("wind")) {
            iconId = R.mipmap.wind;
        }
        else if (iconString.equals("fog")) {
            iconId = R.mipmap.fog;
        }
        else if (iconString.equals("cloudy")) {
            iconId = R.mipmap.cloudy;
        }
        else if (iconString.equals("partly-cloudy-day")) {
            iconId = R.mipmap.partly_cloudy;
        }
        else if (iconString.equals("partly-cloudy-night")) {
            iconId = R.mipmap.cloudy_night;
        }

        return iconId;
    }
}
