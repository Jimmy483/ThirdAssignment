package com.example.thirdassignment.ui.dashboard;

import android.os.Bundle;
import android.text.method.Touch;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thirdassignment.Detail;
import com.example.thirdassignment.DetailAdapter;
import com.example.thirdassignment.R;
import com.example.thirdassignment.ui.CreateDetail;
import com.example.thirdassignment.ui.home.HomeFragment;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        //final TextView textView = root.findViewById(R.id.text_dashboard);
        /*dashboardViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/

        final EditText fname=root.findViewById(R.id.fullname);
        final EditText age=root.findViewById(R.id.age);
        final RadioButton male=root.findViewById(R.id.male);
        final RadioButton female=root.findViewById(R.id.female);
        final RadioButton other=root.findViewById(R.id.thirdgender);
        final EditText address=root.findViewById(R.id.address);
        final Button btn=root.findViewById(R.id.btnSave);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String name,gender,add,old;

                    if(male.isChecked())
                    {
                        gender="Male";
                    }
                    else if(female.isChecked())
                    {
                        gender="Female";
                    }
                    else
                    {
                        gender="Other";
                    }
                    name=fname.getText().toString();
                    old=age.getText().toString();
                    add=address.getText().toString();
                CreateDetail de=new CreateDetail();
                de.setNamee(name);
                de.setAddresss(add);
                de.setAgee(old);
                de.setGenderr(gender);
                Toast.makeText(getContext(),"Data Saved",Toast.LENGTH_SHORT).show();







                }

            }
        );





        return root;
    }
}