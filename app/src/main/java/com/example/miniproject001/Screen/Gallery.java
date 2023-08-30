package com.example.miniproject001.Screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.miniproject001.R;
import com.example.miniproject001.adapter.GridLayoutAdapter;
import com.example.miniproject001.databinding.ActivityGalleryBinding;
import com.example.miniproject001.model.GridlayoutArraylist;

import java.util.concurrent.locks.ReadWriteLock;

public class Gallery extends AppCompatActivity {
    ActivityGalleryBinding activityGalleryBinding;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        activityGalleryBinding= ActivityGalleryBinding.inflate(getLayoutInflater());
        setContentView(activityGalleryBinding.getRoot());
        recyclerView = activityGalleryBinding.gridLayoutManager;
        GridLayoutManager layoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        GridLayoutAdapter adapter=new GridLayoutAdapter(this,new GridlayoutArraylist().card());

        recyclerView.setAdapter(adapter);

    }

}