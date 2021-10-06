package com.example.projectandroid;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.projectandroid.R;

public class frag2 extends Fragment {
    TextView btn_login;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag1_layout, container, false);

        btn_login=v.findViewById(R.id.log);
        btn_login.setOnClickListener(view -> {
            startActivity(new Intent(getContext(), MainActivity.class));




        });
        return v;
    }
}
