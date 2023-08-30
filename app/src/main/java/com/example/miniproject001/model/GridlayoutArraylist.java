package com.example.miniproject001.model;

import com.example.miniproject001.R;

import java.util.ArrayList;

public class GridlayoutArraylist {
    public ArrayList<GridLayoutModel> card(){
        ArrayList<GridLayoutModel> list =new ArrayList<>();
        list.add(new GridLayoutModel(R.drawable.country2,"Card1","The best"));
        list.add(new GridLayoutModel(R.drawable.country,"Card2","My Good"));
        list.add(new GridLayoutModel(R.drawable.flower1,"Card3","Title"));
        list.add(new GridLayoutModel(R.drawable.landspace01,"Card","My case"));
        return list;
    }

}

