package com.example.miniproject001.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.miniproject001.R;
import com.example.miniproject001.databinding.ActivityContactNumberBinding;
import com.example.miniproject001.databinding.ContactNumberUserBinding;
import com.example.miniproject001.databinding.GridLayoutManagerBinding;
import com.example.miniproject001.model.ContactModel;
import com.example.miniproject001.model.GridLayoutModel;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyView> {

    private List<ContactModel> contactModels;
    private OnItemClickListener onItemClickListener;
    private final Context context;

    public ContactAdapter(List<ContactModel> contactModels, Context context) {
        this.contactModels = contactModels;
        this.context = context;
    }

    public interface OnItemClickListener {
        void onItemClick(String phoneNumber);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    @NonNull
    @Override
    public MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ContactNumberUserBinding binding = ContactNumberUserBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyView(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyView holder, int position) {
        ContactModel contactModel = contactModels.get(position);
        String phoneNumber =contactModel.getCall();
        holder.imageView.setImageResource(contactModel.getImage());
        holder.textView.setText(contactModel.getName());

        holder.call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(phoneNumber);
                }
            }
        });

        // Bind other data to views
        // ...
    }

    @Override
    public int getItemCount() {
        return contactModels.size();
    }

    public class MyView extends RecyclerView.ViewHolder {

        ImageView imageView;
        ImageView call;
        TextView textView;

        public MyView(ContactNumberUserBinding binding) {
            super(binding.getRoot());
            imageView = binding.userProfile;
            call = binding.iconCall;
            textView = binding.nameContact;
        }
    }
}