package com.example.simpleasynctask;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.TextView;

import java.util.Random;

public class MyAsyncTask extends AsyncTask<String, Integer, Bitmap> {
    private TextView mTextView;

    @Override
    protected Bitmap doInBackground(String... strings) {
        return null;
    }
}
