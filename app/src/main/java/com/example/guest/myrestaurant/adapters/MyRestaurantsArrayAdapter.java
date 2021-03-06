package com.example.guest.myrestaurant.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by Guest on 5/23/17.
 */

public class MyRestaurantsArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mRestaurants;
    private String[] mCuisines;

    public MyRestaurantsArrayAdapter(Context mContext, int resource, String[] mRestaurants, String[] mCuisnines) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mRestaurants = mRestaurants;
        this.mCuisines = mCuisnines;
    }

    @Override
    public Object getItem(int position) {
        String restaurant = mRestaurants[position];
        String cuisine = mCuisines[position];
        return String.format("%s \nServes great: %s", restaurant, cuisine);
    }

    @Override
    public int getCount() {
        return mRestaurants.length;
    }
}
