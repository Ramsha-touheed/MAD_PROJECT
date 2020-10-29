package com.example.nutrition_app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment1 extends Fragment implements View.OnClickListener {

    Button b1, b2;
    TextView tv1,tv2;
    View view;
    FragmentsCommunicator fc;
    Typeface tf;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_fragment1, container, false);

        tf = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Questv1-Bold.otf");
        tv1 = (TextView)view.findViewById(R.id.textView1);
        tv2 = (TextView)view.findViewById(R.id.textView2);
        tv1.setTypeface(tf);
        tv2.setTypeface(tf);

        b1 = (Button) view.findViewById(R.id.maleBtn);
        b2 = (Button) view.findViewById(R.id.femaleBtn);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b1.setTypeface(tf);
        b2.setTypeface(tf);

        return view;
    }

    @Override
    public void onClick(View view) {
        fc = (FragmentsCommunicator) getActivity();

        if (view.getId() == R.id.maleBtn){
            fc.respond("male", 0);

        }else if (view.getId() == R.id.femaleBtn){
            fc.respond("female", 0);
        }
    }
}
