package com.example.test135;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity6518 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6518);

        TextView show_name = (TextView) findViewById(R.id.tv_name);
        ImageView view1 = (ImageView) findViewById(R.id.iv_pic);
        TextView show_bmi = (TextView) findViewById(R.id.tv_bmi);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String h = bundle.getString("height");
        String w = bundle.getString("weight");

        double bmi = Double.parseDouble(w) / (Double.parseDouble(h) / 100.0 * Double.parseDouble(h) / 100.0);
        DecimalFormat df = new DecimalFormat("#.#");




        String msg="";
        if(bmi<18.5){
            msg=getString(R.string.strtoolow);
            view1.setImageResource(R.drawable.b1);
        }
        else if(bmi>25){
            msg=getString(R.string.strtoohigh);
            view1.setImageResource(R.drawable.b3);
        }
        else{
            msg=getString(R.string.strgood);

            view1.setImageResource(R.drawable.b2);
        }
//        Toast.makeText(this, "標準", Toast.LENGTH_LONG).show();
        show_name.setText(name);
        show_bmi.setText(getString(R.string.strshowbmi) + df.format(bmi)+msg);
    }
}
