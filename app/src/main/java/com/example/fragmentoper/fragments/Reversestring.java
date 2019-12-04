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
public class Reversestring extends Fragment implements View.OnClickListener {

    private Button btnreversestring;
    private EditText etstring;
    private TextView tvoutput;


    public Reversestring() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reversestring, container, false);

        btnreversestring=view.findViewById(R.id.btnreversestring);
        etstring=view.findViewById(R.id.etreversestring);
        tvoutput=view.findViewById(R.id.tvoutput);

        btnreversestring.setOnClickListener(this);

return  view;


    }

    @Override
    public void onClick(View v) {

        String revStr, result;

      revStr=etstring.getText().toString();


        result = Mathematics.reverseString(revStr);

       tvoutput.setText("reverse value is:"+result);


      Toast.makeText(getActivity(),"reverse is:"+result,Toast.LENGTH_SHORT).show();


    }
}
