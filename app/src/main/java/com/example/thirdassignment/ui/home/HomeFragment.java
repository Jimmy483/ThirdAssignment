package com.example.thirdassignment.ui.home;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thirdassignment.Dashboard;
import com.example.thirdassignment.Detail;
import com.example.thirdassignment.DetailAdapter;
import com.example.thirdassignment.R;
import com.example.thirdassignment.ui.CreateDetail;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private ImageView v;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);




        final  RecyclerView recyclerView=root.findViewById(R.id.recyclerView);


        final List<Detail> detailList=new ArrayList<>();
        detailList.add(new Detail("Jimmy","Kathmandu","17","Male",R.drawable.male,R.drawable.trash));
        detailList.add(new Detail("Ballack","Germany","38","Male",R.drawable.male,R.drawable.trash));
        detailList.add(new Detail("Scarlett","California","29","Female",R.drawable.female,R.drawable.trash));


        detailList.add(new Detail("Jack","Maryland","25","Other",R.drawable.thirdgender,R.drawable.trash));
        detailList.add(new Detail("Daniel","Kathmandu","20","Male",R.drawable.male,R.drawable.trash));

        DetailAdapter detailAdapter=new DetailAdapter(root.getContext(),detailList);
        recyclerView.setAdapter(detailAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(root.getContext()));
        return root;
    }



}