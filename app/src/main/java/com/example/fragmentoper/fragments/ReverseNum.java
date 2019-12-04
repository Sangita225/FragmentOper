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
public class ReverseNum extends Fragment implements View.OnClickListener {


    private Button btnreverse;
    private EditText etnum;
    private TextView tvoutput;
    public ReverseNum() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_reverse_num, container, false);
        btnreverse=view.findViewById(R.id.btnreverse);
        etnum=view.findViewById(R.id.etreversenum);
        tvoutput=view.findViewById(R.id.tvoutput);

        btnreverse.setOnClickListener(this);
        return  view;
    }

    @Override
    public void onClick(View v) {

        int num=Integer.parseInt(etnum.getText().toString());
        int reverse= Mathematics.reverseNumber(num);

        tvoutput.setText("reverse is:"+Integer.toString(reverse));

        Toast.makeText(getActivity(),"reverse is:"+reverse,Toast.LENGTH_SHORT).show();


    }
}
