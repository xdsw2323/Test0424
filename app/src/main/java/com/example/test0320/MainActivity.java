package com.example.test0320;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText h;
    private EditText w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findview();
    }

    private void findview() {
        name = (EditText) findViewById(R.id.ed_name);
        h = (EditText) findViewById(R.id.ed_height);
        w = (EditText) findViewById(R.id.ed_weight);

    }

//    public void show(View view) {
//        TextView b = findViewById(R.id.tv_showbmi);
//        ImageView view1 = (ImageView) findViewById(R.id.iv_pic);
//        double w_value = Double.parseDouble(w.getText().toString());
//        double h_value = Double.parseDouble(h.getText().toString());
//        double bmi = w_value / (h_value/100.0 * h_value/100.0);
//
//        DecimalFormat df = new DecimalFormat("#.#");
//
//
//
//        String msg;
//        if ((bmi<18.5)){
//            msg="體重過輕";
//            Toast.makeText(this, "體重過輕", Toast.LENGTH_LONG).show();
//            view1.setImageResource(R.drawable.b1);
//        }else if(bmi>24){
//            msg="體重過重";
//            Toast.makeText(this, "體重過重", Toast.LENGTH_SHORT).show();
//            view1.setImageResource(R.drawable.b2);
//        }else {
//            msg="正常體重";
//            Toast.makeText(this, "正常體重", Toast.LENGTH_SHORT).show();
//            view1.setImageResource(R.drawable.b3);
//        }
//
//        b.setText(name.getText().toString() + "你的BMI是" + df.format(bmi)+msg);
//
//    }

    public void nextPage(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("height",h.getText().toString());
        bundle.putString("weight",w.getText().toString());
        bundle.putString("name",name.getText().toString());


        Intent intent = new Intent(this,Test0410.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
