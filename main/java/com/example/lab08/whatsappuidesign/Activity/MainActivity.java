package com.example.lab08.whatsappuidesign.Activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.lab08.whatsappuidesign.Adapter.FragmentSayfalamaAdaptoru;
import com.example.lab08.whatsappuidesign.R;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Sohbetler"));
        tabLayout.addTab(tabLayout.newTab().setText("Durum"));
        tabLayout.addTab(tabLayout.newTab().setText("Aramalar"));
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        FragmentSayfalamaAdaptoru fsa = new FragmentSayfalamaAdaptoru(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(fsa);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));


        //this.getSupportActionBar().hide(); varsayılan toolbarı gizlemek. Eğer manifestten kaldırılmadıysa.

        setSupportActionBar(toolbar); //Toolbar nesne üzerinden ürettik.
        this.getSupportActionBar().setTitle("");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()) {
            case R.id.ayarlar:
                intent = new Intent(MainActivity.this, AyarlarActivity.class);
                startActivity(intent);
                break;
            case R.id.message:
                break;
            case R.id.search:
                break;
            case R.id.whatsappWeb:
                break;
            case R.id.yeniTopluMesaj:
                break;
            case R.id.yildizliMesajlar:
                break;
            case R.id.yeniGrup:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
