package com.example.duongtainhan555.fragmentdata;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentPlus extends Fragment{

    View view;
    TextView txtPlus;
    int point;
    ActionPoint actionPoint;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_plus, container,false);
        txtPlus = view.findViewById(R.id.txtPlus);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        actionPoint = (ActionPoint) getActivity();
        txtPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionPoint.SendAction("plus");
            }
        });
        super.onActivityCreated(savedInstanceState);
    }


}
