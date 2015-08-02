package com.nguyenqphan.stormy.weather;

/**
 * Created by nguyenphan on 7/31/15.
 */
public class Forecast {
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
}
