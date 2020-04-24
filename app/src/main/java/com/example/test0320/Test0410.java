package com.example.test0320;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Test0410 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test0410);

        TextView show_name = (TextView) findViewById(R.id.tv_name);
        ImageView view1 = (ImageView) findViewById(R.id.iv_pic);
        TextView show_bmi = (TextView) findViewById(R.id.tv_bmi);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String h =  bundle.getString("height");
        String w = bundle.getString("weight");

        double bmi = Double.parseDouble(w) / (Double.parseDouble(h) / 100.0 * Double.parseDouble(h)/100.0);
        DecimalFormat df = new DecimalFormat("#.#");

        String msg;
        if ((bmi<18.5)){
            msg=getString(R.string.strtooLow);
            Toast.makeText(this, "體重過輕", Toast.LENGTH_LONG).show();
            view1.setImageResource(R.drawable.b1);
        }else if(bmi>24){
            msg=getString(R.string.strtoohigh);
            Toast.makeText(this, "體重過重", Toast.LENGTH_SHORT).show();
            view1.setImageResource(R.drawable.b2);
        }else {
            msg=getString(R.string.strstd);
            view1.setImageResource(R.drawable.b3);
        }

        show_name.setText(name);
        show_bmi.setText(getString(R.string.strshowbmi) + df.format(bmi)+msg);
    }
}
