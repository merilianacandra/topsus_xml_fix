package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentRiwayat extends Fragment {
    View view;
    public FragmentRiwayat(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState){
        view = inflater.inflate(R.layout.riwayat_tinggal_fragment, container, false);
        return view;
    }
}
