package com.example.myapplication.GuestHomeFragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.myapplication.CategoryList;
import com.example.myapplication.CustomerRegister;
import com.example.myapplication.R;
import com.example.myapplication.gameopening;
import com.google.firebase.database.FirebaseDatabase;

public class customerorderfragement extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_customeraccountorder,container,false);

        Button btnOpen = (Button) view.findViewById(R.id.button14);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), CategoryList.class);
                startActivity(in);
            }
        });
        return view;


    }
}