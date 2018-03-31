package com.example.lab08.whatsappuidesign.Activity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lab08.whatsappuidesign.R;

public class ChatActivity extends AppCompatActivity {

    LinearLayout linearLayout;


    public void doldur(int i)
    {
        for(int j=0;j<i;j++)
        {
            TextView textView = new TextView(this);
            textView.setText("Selam, nasılsın");
            textView.setTextColor(Color.parseColor("#000000"));
            textView.setTextSize(24f);
            linearLayout.addView(textView);
        }




    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        linearLayout = (LinearLayout)findViewById(R.id.linear_ww);
        doldur(30);


        String adSoyad = getIntent().getStringExtra("adsoyad");
        int userId = getIntent().getIntExtra("userid", 0);
        this.setTitle(adSoyad);
    }
}
