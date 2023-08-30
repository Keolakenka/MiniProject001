package com.example.miniproject001.Screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.miniproject001.R;
import com.example.miniproject001.databinding.ActivityAddUserBinding;
import com.example.miniproject001.databinding.ActivityAddUserInformationBinding;
import com.example.miniproject001.model.ModelUser;

public class AddUser_Information extends AppCompatActivity {
 ActivityAddUserInformationBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     binding= DataBindingUtil.setContentView(this,R.layout.activity_add_user_information);
     String name="",gender="",career="";
        ModelUser user=new ModelUser(name,gender,career);
        binding.btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullName = binding.name.getText().toString();
                String career = binding.Major.getText().toString();
                String gender = user.getGender();

                if (fullName.equals("") || gender.equals("") || career.equals("")) {
                    if (fullName.equals("")) {
                        binding.name.setError("Please input FullName");
                        YoYo.with(Techniques.Shake).duration(500).playOn(binding.name); //
                    }
                    if (gender.equals("")) {
                        Toast.makeText(AddUser_Information.this, "Please Choose Gender", Toast.LENGTH_SHORT).show();
                        // Set error on the RadioButton
                        binding.radioGroup.requestFocus();
                        YoYo.with(Techniques.Shake).duration(500).playOn(binding.radio); //
                    }
                    if (career.equals("")) {
                        binding.Major.setError("Please input Major");
                        YoYo.with(Techniques.Shake).duration(500).playOn(binding.Major); //
                    }
                } else {
                    if(gender.equals("Male")){
                        binding.getEditText.setText("Wecome to Mr "+fullName+" Working as "+career);
                    binding.getEditText.getText().toString();
                    }
                    else if (gender.equals("Female")) {
                        binding.getEditText.setText("Welcome Mrs "+fullName+" Working as "+career);
                  binding.getEditText.getText().toString();
                    }


                }}
        });




    binding.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==binding.male.getId()){

                    user.setGender("Male");
                    Toast.makeText(AddUser_Information.this, "Male", Toast.LENGTH_SHORT).show();

                }
                else {
                    user.setGender("Female");
                    Toast.makeText(AddUser_Information.this, "Female", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}