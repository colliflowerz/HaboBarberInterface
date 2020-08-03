package com.example.habobarberinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.habobarberinterface.Common.Common;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class PastCustomersActivity extends AppCompatActivity {

    private static final String TAG = "";
    private RecyclerView customerList;
    private FirebaseFirestore firebaseFirestore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_customers);

        firebaseFirestore = FirebaseFirestore.getInstance();
        customerList = findViewById(R.id.customerList);

        //Query
        ///AllSalon/Sydney/Branch/1qm8MoF5skj0ZFA5EaY8/Barber/E3uiSmrM10y0dehKkHKD
        //Query query = firebaseFirestore.collection("AllSalon").document(Common.selected_salon.getAddress());
        Log.d(TAG, "Salon get address" + Common.selected_salon.getAddress());
        Log.d(TAG, "Salon get address" + Common.selected_salon.getName());
        Log.d(TAG, "Salon get address" + Common.selected_salon.getSalonID());
        Log.d(TAG, "Salon get address" + Common.currentBarber.getName());
        Log.d(TAG, "Salon get address" + Common.currentBarber.getBarberId());
        Log.d(TAG, "Salon get name" + Common.selected_salon.getName());
        Log.d(TAG, "Salon get salon id" + Common.selected_salon.getSalonID());
        Log.d(TAG, "Salon get suburb" + Common.selected_salon.getSuburb());
        Log.d(TAG, "barber get name" + Common.currentBarber.getName());
        Log.d(TAG, "barber get barber id" + Common.currentBarber.getBarberId());
        Log.d(TAG, "barber get username" + Common.currentBarber.getUsername());
        Log.d(TAG, "barber get suburb " + Common.currentBarber.getSuburb());
        //RecyclerOptions

        //ViewHolder

        Log.d(TAG, "The barber's name is " + Common.currentBarber.getName());
    }
}