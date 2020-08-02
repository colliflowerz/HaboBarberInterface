package com.example.habobarberinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.habobarberinterface.Common.Common;

public class PastCustomersActivity extends AppCompatActivity {

    private static final String TAG = "";
    private RecyclerView customerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_customers);

        customerList = findViewById(R.id.customerList);

        Log.d(TAG, "The barber's name is " + Common.currentBarber.getName());
    }
}