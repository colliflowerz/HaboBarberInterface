package com.example.habobarberinterface.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.habobarberinterface.Model.BookingInformation;
import com.example.habobarberinterface.R;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class PastCustomerAdapter extends FirestoreRecyclerAdapter<BookingInformation, PastCustomerAdapter.PastCustomerHolder> {

    /**
     * Create a new RecyclerView adapter that listens to a Firestore Query.  See {@link
     * FirestoreRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public PastCustomerAdapter(@NonNull FirestoreRecyclerOptions<BookingInformation> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull PastCustomerHolder holder, int position, @NonNull BookingInformation model) {
        holder.textViewName.setText("Name: " + model.getCustomerName());
        holder.textViewNumber.setText("Phone number: " + model.getCustomerPhone());
        holder.textViewDate.setText("Time: " + model.getTime());
    }

    @NonNull
    @Override
    public PastCustomerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_customer_single, parent, false);
        return new PastCustomerHolder(v);
    }

    class PastCustomerHolder extends RecyclerView.ViewHolder{
        TextView textViewName, textViewNumber, textViewDate;

        public PastCustomerHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.listName);
            textViewNumber = itemView.findViewById(R.id.listNumber);
            textViewDate = itemView.findViewById(R.id.listDate);
        }
    }
}
