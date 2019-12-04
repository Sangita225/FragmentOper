package com.example.fragmentoper.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fragmentoper.Mathematics;
import com.example.fragmentoper.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Area extends Fragment implements View.OnClickListener {


   private EditText etradius;
   private Button btnarea;
   private TextView tvoutput;

    public Area() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_area, container, false);

        etradius=view.findViewById(R.id.etradius);
        btnarea=view.findViewById(R.id.btnarea);
        tvoutput=view.findViewById(R.id.tvarea);

        btnarea.setOnClickListener(this);
        return view;


    }

    @Override
    public void onClick(View v) {

        float radius, area;
        radius=Float.parseFloat(etradius.getText().toString());
        area= Mathematics.area(radius);
        tvoutput.setText("Area of circle is:"+area);
        Toast.makeText(getActivity(),"Area of circle "+area,Toast.LENGTH_SHORT).show();


    }
}
