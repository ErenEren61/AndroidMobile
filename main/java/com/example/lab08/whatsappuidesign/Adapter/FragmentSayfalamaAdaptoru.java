package com.example.lab08.whatsappuidesign.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.lab08.whatsappuidesign.Fragment.FragmentAramalar;
import com.example.lab08.whatsappuidesign.Fragment.FragmentDurumlar;
import com.example.lab08.whatsappuidesign.Fragment.FragmentSohbetler;

/**
 * Created by Lab08 on 24.03.2018.
 */

public class FragmentSayfalamaAdaptoru extends FragmentStatePagerAdapter {

    int tabSayisi;

    public FragmentSayfalamaAdaptoru(FragmentManager fm, int tabSayisi) {
        super(fm);
        this.tabSayisi = tabSayisi;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FragmentSohbetler fs = new FragmentSohbetler();
                return fs;
            case 1:
                FragmentDurumlar fd = new FragmentDurumlar();
                return fd;
            case 2:
                FragmentAramalar fa = new FragmentAramalar();
                return fa;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabSayisi;
    }
}
