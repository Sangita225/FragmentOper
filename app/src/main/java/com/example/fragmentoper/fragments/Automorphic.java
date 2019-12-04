package com.example.fragmentoper.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fragmentoper.Mathematics;
import com.example.fragmentoper.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Automorphic extends Fragment {
private Button btnautomorphiv;
private TextView tvoutput;
private EditText etnum;

    public Automorphic() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_automorphic, container, false);

      final Button  btnautomorphiv=view.findViewById(R.id.btnautomorphic);
        etnum=view.findViewById(R.id.etautomorphic);
        tvoutput=view.findViewById(R.id.tvoutput);

        btnautomorphiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num=Integer.parseInt(String.valueOf(etnum.getText()));
                boolean isAutomorphic= Mathematics.isAutomorphic(num);
                if(isAutomorphic){
                    tvoutput.setText(etnum.getText()+"it is automorphic");
                }
                else {
                    tvoutput.setText(etnum.getText()+"it is not automorphic number");
                }


            }
        });
return  view;

    }

}
