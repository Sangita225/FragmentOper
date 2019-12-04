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
public class Palindrome extends Fragment {

private Button btnpalindrome;
private EditText etnum;
private TextView tvoutput;


    public Palindrome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_palindrome, container, false);
       final Button btnpalindrome=view.findViewById(R.id.btnpalindrome);
        etnum=view.findViewById(R.id.etpalindrome);
        tvoutput=view.findViewById(R.id.tvoutput);
btnpalindrome.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        int palindrome=Integer.parseInt(String.valueOf(etnum.getText()));
        boolean isPalindrome=Mathematics.isPalindrome(palindrome);

        if(isPalindrome){
            tvoutput.setText(etnum.getText()+"it is palindrome");
        }
        else {
tvoutput.setText(etnum.getText()+"it is not palindrome");
        }
    }
});
return  view;
    }

}
