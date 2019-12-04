package com.example.fragmentoper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentoper.fragments.Area;
import com.example.fragmentoper.fragments.Automorphic;
import com.example.fragmentoper.fragments.Palindrome;
import com.example.fragmentoper.fragments.ReverseNum;
import com.example.fragmentoper.fragments.Reversestring;
import com.example.fragmentoper.fragments.Sum;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnadd;
    private  Button btnarea,btnpalindrome,btnreversenum,btnreversestring,btnautomorphic;
    private Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


btnadd=findViewById(R.id.btnsum);
btnarea=findViewById(R.id.btnarea);
btnautomorphic=findViewById(R.id.btnautomorphic);
btnreversenum=findViewById(R.id.btnreversenum);
btnreversestring=findViewById(R.id.btnreversestring);
btnpalindrome=findViewById(R.id.btnpalindrome);

btnadd.setOnClickListener(this);
btnarea.setOnClickListener(this);
btnpalindrome.setOnClickListener(this);
btnreversestring.setOnClickListener(this);
btnreversenum.setOnClickListener(this);
btnautomorphic.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();


switch (v.getId()){
    case R.id.btnsum:
        Sum sum=new Sum();
      fragmentTransaction.replace(R.id.fragmentContainer,sum);
      fragmentTransaction.addToBackStack(null);
      fragmentTransaction.commit();
      break;

    case R.id.btnarea:
        Area area=new Area();
        fragmentTransaction.replace(R.id.fragmentContainer,area);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
        break;


    case R.id.btnpalindrome:
        Palindrome palindrome=new Palindrome();
        fragmentTransaction.replace(R.id.fragmentContainer,palindrome);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
        break;


    case R.id.btnreversenum:
        ReverseNum reverseNum=new ReverseNum();
        fragmentTransaction.replace(R.id.fragmentContainer,reverseNum);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
        break;

    case R.id.btnautomorphic:

        Automorphic automorphic=new Automorphic();
        fragmentTransaction.replace(R.id.fragmentContainer,automorphic);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
        break;


    case R.id.btnreversestring:
        Reversestring reversestring=new Reversestring();
        fragmentTransaction.replace(R.id.fragmentContainer,reversestring);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
        break;









}








    }
}
