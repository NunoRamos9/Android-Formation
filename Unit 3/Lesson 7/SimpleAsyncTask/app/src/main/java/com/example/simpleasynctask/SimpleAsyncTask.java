package com.example.simpleasynctask;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.Random;

public class SimpleAsyncTask extends AsyncTask<Void, Long, String> {

    private WeakReference<TextView> mTextView;

    @Override
    protected String doInBackground(Void... voids) {
        Random r = new Random();
        int n = r.nextInt(11);

        int s = n * 1000;

        try {
            for (int i = 0; i < n; i++) {
                publishProgress(Long.valueOf(i));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Awake at last after sleeping for " + s + " milliseconds!";
    }

    @Override
    protected void onProgressUpdate(Long... values) {
        super.onProgressUpdate(values);
        mTextView.get().setText("Time sleeping: " + values[0] + " seconds");
        Log.d(getClass().getSimpleName() + " onProgressUpdate", "You are " + values[0]);
    }

    protected void onPostExecute(String result) {
        mTextView.get().setText(result);
    }

    SimpleAsyncTask(TextView tv) {
        mTextView = new WeakReference<>(tv);
    }
}
