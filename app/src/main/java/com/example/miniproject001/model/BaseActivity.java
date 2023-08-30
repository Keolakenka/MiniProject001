package com.example.miniproject001.model;

import android.os.Bundle;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
public abstract class BaseActivity <T extends ViewDataBinding> extends AppCompatActivity {

    protected T binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,layout());
        binding.setLifecycleOwner(this);
        binding.executePendingBindings();
    }
    @LayoutRes
    public abstract int layout();
}