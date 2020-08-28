package com.example.android.whowroteit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import android.support.v4.content.AsyncTaskLoader;

public class BookLoader extends AsyncTaskLoader<String> {

}
@Nullable
@Override
public String loadInBackground() {
    return null;

    public BookLoader(@NonNull Context context) {
        super(context);

       @Override
    protected void onStartLLoading(){
           super.onStartLoading
            private String mQueryString;

            BookLoader(Context context, String queryString) {
                super(context);
                mQueryString = queryString;
            }
            return NetworkUtils.getBookInfo(mQueryString);
