package com.example.miniproject001.model;

import com.example.miniproject001.R;

import java.util.ArrayList;

public class GridlayoutArraylist {
    public ArrayList<GridLayoutModel> card(){
        ArrayList<GridLayoutModel> list =new ArrayList<>();
        list.add(new GridLayoutModel(R.drawable.country2,"tou","eetet"));
        list.add(new GridLayoutModel(R.drawable.country,"tou","eetet"));
        list.add(new GridLayoutModel(R.drawable.flower1,"tou","eetet"));
        list.add(new GridLayoutModel(R.drawable.landspace01,"tou","eetet"));
        return list;
    }

}

