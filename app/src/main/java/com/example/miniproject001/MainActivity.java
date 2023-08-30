package com.example.miniproject001;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.miniproject001.Screen.AddUser_Information;
import com.example.miniproject001.Screen.Gallery;
import com.example.miniproject001.Screen.ContactNumber;
import com.example.miniproject001.adapter.ImgRecycerViewAdater;

import com.example.miniproject001.databinding.ActivityMainBinding;

import com.example.miniproject001.databinding.CustomDialogBinding;
import com.example.miniproject001.databinding.CustomDialogCloseAppBinding;
import com.example.miniproject001.databinding.CustomLayoutBinding;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    CustomLayoutBinding customLayoutBinding;
    CustomDialogBinding customDialogBinding;
    Dialog custom;




    RecyclerView recyclerView;
     ImgRecycerViewAdater imgRecycerViewAdater;
    ArrayList<String> stringsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = DataBindingUtil.setContentView(this,R.layout.activity_main) ;



         stringsArrayList=new ArrayList<>();
        stringsArrayList.add("https://media.istockphoto.com/id/856944378/photo/rice-fields-on-terraced-of-mu-cang-chai-yenbai-vietnam-soft-focus.jpg?s=612x612&w=0&k=20&c=5sCUbf6BPlFCDYtupS-S-dQaNK449X_fNybW5dg2sUA=");
        stringsArrayList.add("https://media.istockphoto.com/id/504122496/photo/angkor-wat.jpg?s=612x612&w=0&k=20&c=NKBzgWKQPLdeRQ6l_TZLPB2Of2QVqn_N2bV0cr8hIyE=");
        stringsArrayList.add("https://media.istockphoto.com/id/177140040/photo/buffalo-shepherd-on-the-rice-field.jpg?s=612x612&w=0&k=20&c=Q7wIGzY2W133-lorWbaKTuMpbbxwsQ7XCXYxvN4zkYA=");
        stringsArrayList.add("https://media.istockphoto.com/id/953702372/photo/ban-bua-daeng-udon-thani.jpg?s=612x612&w=0&k=20&c=kJE5YtqUVWAEVxM8Jr3CpkTuOkIvhAhHiCvykfBykBI=");
        stringsArrayList.add("https://media.istockphoto.com/id/504703270/photo/phnom-penh-cambodia.jpg?s=612x612&w=0&k=20&c=fuZU-aRSYeaBx6gPb8i8HhXqoqvoWqEtOyRXuq8trb8=");
       stringsArrayList.add("https://media.istockphoto.com/id/1441834780/photo/birds-eye-view-of-the-angkor-wat-temple-surrounded-by-greenery-at-sunset-in-cambodia.jpg?s=612x612&w=0&k=20&c=XGhuK561GJBFBUxc7_FJGWohpWuMiY2HXu-T8wZ88Eo=");
        stringsArrayList.add("https://media.istockphoto.com/id/821257330/photo/fisherman-on-silhouette-sunrise-with-gear-fishing.jpg?s=612x612&w=0&k=20&c=3jMZAY0g2QCT5OqO4mIVX0mv4eKSY0jNpzyA67F9iV4=");
      stringsArrayList.add("https://media.istockphoto.com/id/518355384/photo/cambodian-jungle-in-angkor.jpg?s=612x612&w=0&k=20&c=EYjUQ4bbjwgxQNO9v_6eOOMwqUiK4OM_bmUH0ZPgBvU=");
      stringsArrayList.add("https://media.istockphoto.com/id/1169574830/photo/farmers-grow-rice-in-the-rainy-season-asia.jpg?s=612x612&w=0&k=20&c=wYhbFpvzbBvQUnayRoMOGqhIQePuvHIpMWD7auQMJ18=");
      stringsArrayList.add("https://media.istockphoto.com/id/485737360/photo/rice-field-and-river-ninhbinh-vietnam-landscapes.jpg?s=612x612&w=0&k=20&c=TaGnNMYU1YNiuRXk7glKzlyfcmSimVZ65hWDcRRjzpo=");
       stringsArrayList.add("https://media.istockphoto.com/id/626461916/photo/phnom-penh-cityscape.jpg?s=612x612&w=0&k=20&c=eGyGZs50ZV1CGZ35mf0IrHTGr2Af4sf2QyH5oAtfCFY=");
      recyclerView=binding.recyclerView;
       imgRecycerViewAdater=new ImgRecycerViewAdater(this,stringsArrayList);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
     recyclerView.setAdapter(imgRecycerViewAdater);

     binding.btnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start Activity2
                Intent intent = new Intent(MainActivity.this, Gallery.class);
                startActivity(intent);
            }
        });
     binding.idContact.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(MainActivity.this, ContactNumber.class);
             startActivity(intent);

         }

     });
        binding.btnNoted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(MainActivity.this);

                custom = new Dialog(MainActivity.this);
                customDialogBinding = CustomDialogBinding.inflate(getLayoutInflater());
                custom.setContentView(customDialogBinding.getRoot());

                customDialogBinding.btnGetMore.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        custom.dismiss();
                        Toast.makeText(MainActivity.this, "Custom is Cancel", Toast.LENGTH_SHORT).show();
                    }
                });

                AlertDialog dialog = builder.create();
                custom.show();
            }
        });

       binding.btnAddUser.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {


               Intent intent = new Intent(MainActivity.this, AddUser_Information.class);
               startActivity(intent);
           }
       });
        ChipGroup chipGroup =binding.animatedChip;

        ArrayList<String> chipTextList = new ArrayList<>();
        chipTextList.add("Pop Music");
        chipTextList.add("Romaintic");
        chipTextList.add("Horrorr");
        chipTextList.add("Opera");

        for (String text : chipTextList) {
            Chip chip = new Chip(this);
            chip.setText(text);
            chipGroup.addView(chip);
        }
        binding.nextIcon.setOnClickListener(new View.OnClickListener() {
            CustomDialogCloseAppBinding customDialogCloseAppBinding;
            @Override
            public void onClick(View view) {

                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(MainActivity.this);

                custom = new Dialog(MainActivity.this);
                customDialogCloseAppBinding = CustomDialogCloseAppBinding.inflate(getLayoutInflater());
                custom.setContentView(customDialogCloseAppBinding.getRoot());

                customDialogCloseAppBinding.cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        custom.dismiss();

                    }
                });

                AlertDialog dialog = builder.create();
                custom.show();
                customDialogCloseAppBinding.exit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finish();
                    }
                });
            }

        });

    }




        }



