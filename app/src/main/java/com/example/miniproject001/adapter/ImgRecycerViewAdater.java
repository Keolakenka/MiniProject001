package com.example.miniproject001.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.miniproject001.R;
import com.example.miniproject001.databinding.CustomLayoutBinding;

import java.util.ArrayList;

public class ImgRecycerViewAdater extends RecyclerView.Adapter<ImgRecycerViewAdater.ViewHolder> {

   CustomLayoutBinding binding;


 private  final  Context context;
    private  final ArrayList<String> stringsArrayList;

    public ImgRecycerViewAdater(Context context, ArrayList<String> integerArrayList) {
        this.context = context;
        this.stringsArrayList = integerArrayList;
    }





    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.custom_layout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context)
                .load(stringsArrayList.get(position))
        .into((holder.imageView));


    }

    @Override
    public int getItemCount() {
        return stringsArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = CustomLayoutBinding.bind(itemView);

            imageView=binding.img;



        }
    }

}
