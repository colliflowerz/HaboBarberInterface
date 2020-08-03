package com.example.habobarberinterface.Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.habobarberinterface.R;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;

public class PastCustomerAdapter extends FirestoreRecyclerAdapter {

    class PastCustomerHolder extends RecyclerView.ViewHolder{
        TextView textViewName, textViewNumber;

        public PastCustomerHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.nam);
        }
    }
}
