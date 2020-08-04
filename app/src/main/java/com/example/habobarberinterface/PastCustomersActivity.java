package com.example.habobarberinterface;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.habobarberinterface.Adapter.PastCustomerAdapter;
import com.example.habobarberinterface.Common.Common;
import com.example.habobarberinterface.Common.CustomLoginDialog;
import com.example.habobarberinterface.Model.BookingInformation;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class PastCustomersActivity extends AppCompatActivity {

    private static final String TAG = "";
    private FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();
    private CollectionReference customerRef = firebaseFirestore.collection("AllSalon").document("Blacktown").collection("Branch")
            .document(Common.selected_salon.getSalonID()).collection("Barber").document(Common.currentBarber.getBarberId()).collection("03_08_2020");

    private PastCustomerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_customers);


        //Query
        ////AllSalon/Blacktown/Branch/FbrfgHqqLh0T8LTF6TMJ/Barber/QyUtNUSUiP59rLwDuJTq/03_08_2020
        //Query query = firebaseFirestore.collection("AllSalon").document(Common.selected_salon.getAddress());
        Log.d(TAG, "Salon get address" + Common.selected_salon.getAddress());
        Log.d(TAG, "Salon get address" + Common.selected_salon.getName());
        Log.d(TAG, "Salon get address" + Common.selected_salon.getSalonID());
        Log.d(TAG, "Salon get address" + Common.currentBarber.getName());
        Log.d(TAG, "Salon get address" + Common.currentBarber.getBarberId());
        Log.d(TAG, "Salon get name " + Common.selected_salon.getName());
        Log.d(TAG, "Salon get salon id " + Common.selected_salon.getSalonID());
        Log.d(TAG, "Salon get suburb " + Common.selected_salon.getSuburb());
        Log.d(TAG, "barber get name " + Common.currentBarber.getName());
        Log.d(TAG, "barber get barber id " + Common.currentBarber.getBarberId());
        Log.d(TAG, "barber get username " + Common.currentBarber.getUsername());
        Log.d(TAG, "barber get suburb " + Common.currentBarber.getSuburb());
        Log.d(TAG, "The barber's name is " + Common.currentBarber.getName());

        setUpRecyclerView();
    }

    private void setUpRecyclerView(){
        Query query = customerRef;

        FirestoreRecyclerOptions<BookingInformation> options = new FirestoreRecyclerOptions.Builder<BookingInformation>()
                .setQuery(query, BookingInformation.class)
                .build();

        adapter = new PastCustomerAdapter(options);
        RecyclerView recyclerView = findViewById(R.id.customerList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}