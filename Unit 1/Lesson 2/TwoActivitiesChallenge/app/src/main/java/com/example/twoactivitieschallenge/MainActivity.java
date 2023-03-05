package com.example.twoactivitieschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.twoactivitieschallenge.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivityButton(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message;
        switch (view.getId()) {
            case R.id.button_1:
                message = getResources().getString(R.string.text_1);
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            break;
            case R.id.button_2:
                message = getResources().getString(R.string.text_2);
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            break;
            case R.id.button_3:
                message = getResources().getString(R.string.text_3);
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
        }
    }
}