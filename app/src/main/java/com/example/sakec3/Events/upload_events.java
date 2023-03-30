package com.example.sakec3.Events;

import android.content.Intent;
import android.media.metrics.Event;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.sakec3.MainActivity;
import com.example.sakec3.R;
import com.example.sakec3.StudentHome;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class upload_events extends Fragment {
FloatingActionButton fab;

    public upload_events() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_upload_events, container, false);

//        **----- Floating Action Button -----**
        fab = view.findViewById(R.id.FAB);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(), AddEvent.class);
//                ((MainActivity) getActivity()).startActivity(intent);
                startActivity(new Intent(getActivity(), AddEvent.class));
            }
        });

        return view;
    }
}