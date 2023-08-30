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
import com.example.miniproject001.databinding.GridLayoutManagerBinding;
import com.example.miniproject001.model.GridLayoutModel;
import com.example.miniproject001.model.GridlayoutArraylist;

import java.util.ArrayList;

public class GridLayoutAdapter extends RecyclerView.Adapter<GridLayoutAdapter.MyViewHolder> {
    private final Context context;

    public GridLayoutAdapter(Context context, ArrayList<GridLayoutModel> gridLayoutModels) {
        this.context = context;
        this.gridLayoutModels = gridLayoutModels;
    }

    private ArrayList<GridLayoutModel> gridLayoutModels;


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.grid_layout_manager,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        GridLayoutModel arraylist=gridLayoutModels.get(position);

          holder.caption.setText(arraylist.getCaption());
          holder.title.setText(arraylist.getTitle());
          holder.imageView.setImageResource(arraylist.getImage());
    }

    @Override
    public int getItemCount() {
        return gridLayoutModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        GridLayoutManagerBinding binding;
        ImageView imageView;
        TextView caption,title;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            binding = GridLayoutManagerBinding.bind(itemView);
            imageView=binding.imageGrid;
            caption=binding.captionText;
            title=binding.titleText;
        }
    }
}
