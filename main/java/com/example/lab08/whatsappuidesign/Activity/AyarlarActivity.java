package com.example.lab08.whatsappuidesign.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.lab08.whatsappuidesign.R;

public class AyarlarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayarlar);

        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true); //Geri butonu eklendi.

        this.getSupportActionBar().setTitle("Ayarlar"); //menü başlığı
        this.getSupportActionBar().setSubtitle("Alt Başlık"); //alt menü başlığı
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        } //geri butonuna tıklama işlemi. Bulunduğu activity kapanır.

        return super.onOptionsItemSelected(item);
    }
}
