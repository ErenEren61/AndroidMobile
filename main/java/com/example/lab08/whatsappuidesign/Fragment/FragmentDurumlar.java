package com.example.lab08.whatsappuidesign.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lab08.whatsappuidesign.Adapter.GridViewDurumlarAdapter;
import com.example.lab08.whatsappuidesign.Model.DurumlarModeli;
import com.example.lab08.whatsappuidesign.R;

import java.util.ArrayList;

/**
 * Created by Lab08 on 24.03.2018.
 */

public class FragmentDurumlar extends Fragment {
    GridView gdurumlar;
    ImageView ivResim;
    TextView adSoyad;
    TextView GuncellemeZamani;
    ArrayList<DurumlarModeli> liste = new ArrayList<>();

    private void doldur()
    {
        liste.add(new DurumlarModeli(1,"Müjdat Gezen","https://indigodergisi.com/wp-content/uploads/2017/05/1494118823_EpilepsiveBen_6_11Ya_____kincisi__Berat___pek-265x198.jpg","15:00"));
        liste.add(new DurumlarModeli(2,"İsmail Baki","https://i1.wp.com/www.kerimusta.com/wp-content/uploads/2017/01/at-resimleri_184984.jpg","21:59"));
        liste.add(new DurumlarModeli(1,"Süleyman Hacıosmanoğullarından","https://sendeyim.net/uploads/resim-galerisi/kurt-resimleri_24387.jpg","15:00"));
        liste.add(new DurumlarModeli(2,"İsmail Türüt","https://www.nedir.com/content_imgs/resim.jpg","15:01"));
        liste.add(new DurumlarModeli(2,"Hayatım","https://www.nedir.com/content_imgs/resim.jpg","15:01"));
        liste.add(new DurumlarModeli(2,"Babam","https://www.nedir.com/content_imgs/resim.jpg","15:01"));


    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout_durumlar, container, false);

        gdurumlar = (GridView)view.findViewById(R.id.gridViewDurumlar);
        ivResim = (ImageView)view.findViewById(R.id.ivCustomDurumlar_resim);
        adSoyad = (TextView)view.findViewById(R.id.tvCustomDurumlarAdSoyad);
        GuncellemeZamani = (TextView)view.findViewById(R.id.tvCustomDurumlarZaman1);

        doldur();
        GridViewDurumlarAdapter adapter = new GridViewDurumlarAdapter(getContext(),liste);
        gdurumlar.setAdapter(adapter);

        return view;

    }
}

