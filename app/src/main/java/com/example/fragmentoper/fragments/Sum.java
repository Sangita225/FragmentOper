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
public class Sum extends Fragment implements View.OnClickListener {

private EditText etfirst,etsecond;
private Button btnadd;
private TextView tvoutput;


    public Sum() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sum, container, false);

        etfirst=view.findViewById(R.id.etfirst);
        etsecond=view.findViewById(R.id.etsecond);
        btnadd=view.findViewById(R.id.btnsum);
        tvoutput=view.findViewById(R.id.tvoutput);

        btnadd.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {


        int first,second,result;
        first=Integer.parseInt(etfirst.getText().toString());
        second=Integer.parseInt(etsecond.getText().toString());

        Mathematics sum= new Mathematics(first,second);
        result=sum.add();

        tvoutput.setText(Integer.toString(result));

        Toast.makeText(getActivity(),"sum is:"+result,Toast.LENGTH_SHORT).show();


    }
}
