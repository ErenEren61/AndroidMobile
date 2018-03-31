package com.example.lab08.whatsappuidesign.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lab08.whatsappuidesign.Model.DurumlarModeli;
import com.example.lab08.whatsappuidesign.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Lab08 on 31.03.2018.
 */

public class GridViewDurumlarAdapter extends BaseAdapter {

    private ArrayList<DurumlarModeli> arrayList;
    private Context context;
    private LayoutInflater layoutInflater;

    public GridViewDurumlarAdapter(Context context, ArrayList<DurumlarModeli> liste)
    {
        this.context=context;
        this.arrayList = liste;
        this.layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return arrayList.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = layoutInflater.inflate(R.layout.custom_durumlar_gorunumu,null);

        ImageView ivResim = (ImageView)v.findViewById(R.id.ivCustomDurumlar_resim);
        TextView tvAdSoyad = (TextView)v.findViewById(R.id.tvCustomDurumlarAdSoyad);
        TextView tvZaman = (TextView)v.findViewById(R.id.tvCustomDurumlarZaman1);


        tvAdSoyad.setText(arrayList.get(i).getAdSoyad());
        tvZaman.setText(arrayList.get(i).getPaylasimZamani());


        Picasso.with(context).load(arrayList.get(i).getResimUrl()).into(ivResim); //web üzerinden resim çekme işlemi


        return v;


    }


}
