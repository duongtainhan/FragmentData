package com.example.duongtainhan555.fragmentdata;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentMinus extends Fragment{
    View view;
    TextView txtMinus;
    ActionPoint actionMinus;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_minus,container,false);
        txtMinus = view.findViewById(R.id.txtMinus);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        actionMinus = (ActionPoint) getActivity();
        txtMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionMinus.SendAction("minus");
            }
        });
        super.onActivityCreated(savedInstanceState);
    }


}
