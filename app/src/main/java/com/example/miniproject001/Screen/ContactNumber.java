package com.example.miniproject001.Screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.miniproject001.R;
import com.example.miniproject001.adapter.ContactAdapter;
import com.example.miniproject001.adapter.GridLayoutAdapter;
import com.example.miniproject001.adapter.ImgRecycerViewAdater;
import com.example.miniproject001.databinding.ActivityContactNumberBinding;
import com.example.miniproject001.databinding.ActivityGalleryBinding;
import com.example.miniproject001.databinding.ContactNumberUserBinding;
import com.example.miniproject001.model.ContactList;
import com.example.miniproject001.model.ContactModel;
import com.example.miniproject001.model.GridlayoutArraylist;

import java.util.ArrayList;
import java.util.List;

public class ContactNumber extends AppCompatActivity implements ContactAdapter.OnItemClickListener {
    ActivityContactNumberBinding activityContactNumberBinding;
    RecyclerView recyclerView;

    // Rest of your code

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityContactNumberBinding = ActivityContactNumberBinding.inflate(getLayoutInflater());
        setContentView(activityContactNumberBinding.getRoot());

        recyclerView = activityContactNumberBinding.contactNumRecyclerview;
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<ContactModel> list = new ArrayList<>();
        list.add(new ContactModel(R.drawable.ronado, "Nita", "333333"));
        list.add(new ContactModel(R.drawable.ronado, "Laak", "64646"));



        ContactAdapter adapter = new ContactAdapter(list, this);
        adapter.setOnItemClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        startActivity(intent);
    }
}