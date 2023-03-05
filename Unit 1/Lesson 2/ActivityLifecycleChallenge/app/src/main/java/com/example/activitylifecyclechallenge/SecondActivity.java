package com.example.activitylifecyclechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.activitylifecyclechallenge.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
    }

    public void returnProduct(View view) {
        Intent intent = new Intent();
        String message;
        switch (view.getId()) {
            case R.id.button1:
                message = getResources().getString(R.string.product_1);
                intent.putExtra(EXTRA_MESSAGE, message);
                setResult(RESULT_OK, intent);
                finish();
            break;
            case R.id.button2:
                message = getResources().getString(R.string.product_2);
                intent.putExtra(EXTRA_MESSAGE, message);
                setResult(RESULT_OK, intent);
                finish();
            break;
            case R.id.button3:
                message = getResources().getString(R.string.product_3);
                intent.putExtra(EXTRA_MESSAGE, message);
                setResult(RESULT_OK, intent);
                finish();
            break;
            case R.id.button4:
                message = getResources().getString(R.string.product_4);
                intent.putExtra(EXTRA_MESSAGE, message);
                setResult(RESULT_OK, intent);
                finish();
            break;
            case R.id.button5:
                message = getResources().getString(R.string.product_5);
                intent.putExtra(EXTRA_MESSAGE, message);
                setResult(RESULT_OK, intent);
                finish();
            break;
        }
    }
}