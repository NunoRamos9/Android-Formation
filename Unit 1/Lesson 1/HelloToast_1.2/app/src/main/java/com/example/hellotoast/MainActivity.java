package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This will show two buttons, the Toast button shows a message
 * and the Count button increases the value on the TextView.
 *
 */
public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    /**
     * Shows the Toast message "Hello Toast!" when the button Toast is clicked.
     *
     * @param view
     */

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);

        toast.show();
    }

    /**
     * Increases the value in the TextView when the button Count is clicked.
     *
     * @param view
     */
    public void CountUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        /*
        1.2 - Homework
        int red = Color.parseColor("#FF0000");
        view.setBackgroundColor(red);
        */
    }
}