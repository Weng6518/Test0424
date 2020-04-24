package com.example.test135;

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

    private EditText a;
    private EditText h;
    private EditText w;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        a = (EditText)  findViewById(R.id.ed_name);
        h = (EditText) findViewById(R.id.ed_height);
        w = (EditText) findViewById(R.id.ed_weight);
    }

//    public void show(View view) {
//
//        TextView b = (TextView)findViewById(R.id.tv_showbmi);
//        ImageView view1 = (ImageView) findViewById(R.id.iv_pic);
//        String h = this.h.getText().toString();
//        String w = this.w.getText().toString();
//
//        double bmi = Double.parseDouble(w) / (Double.parseDouble(h) / 100.0 * Double.parseDouble(h) / 100.0);
//        DecimalFormat df = new DecimalFormat("#.#");
//
//
//
//        String msg="";
//        if(bmi<18.5){
//            msg="過輕";
//             view1.setImageResource(R.drawable.b1);
//        }
//        else if(bmi>25){
//            msg="過重";
//            view1.setImageResource(R.drawable.b3);
//        }
//        else{
//            msg="標準";
//
//            view1.setImageResource(R.drawable.b2);
//        }
////        Toast.makeText(this, "標準", Toast.LENGTH_LONG).show();
//        b.setText(a.getText().toString() + "您的bmi是:" + df.format(bmi)+msg);
//    }

    public void nextpage(View view) {
        Bundle bundle = new Bundle();

        bundle.putString("height",h.getText().toString());
        bundle.putString("weight",w.getText().toString());
        bundle.putString("name",a.getText().toString());

        Intent intent = new Intent(this,MainActivity6518.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
