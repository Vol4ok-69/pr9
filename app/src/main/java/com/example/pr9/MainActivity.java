package com.example.pr9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickStepsActivity(View view) {
        startActivity(new Intent(this, AlbumsActivity.class));
    }
}
