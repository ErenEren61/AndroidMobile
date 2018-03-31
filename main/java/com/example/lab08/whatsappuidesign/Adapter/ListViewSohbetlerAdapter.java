package com.example.lab08.whatsappuidesign.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lab08.whatsappuidesign.Activity.ChatActivity;
import com.example.lab08.whatsappuidesign.Model.Sohbetler;
import com.example.lab08.whatsappuidesign.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Lab08 on 25.03.2018.
 */

public class ListViewSohbetlerAdapter extends BaseAdapter {

    private ArrayList<Sohbetler> liste;
    private LayoutInflater layoutInflater;
    private Context context;

    public ListViewSohbetlerAdapter(Context context, ArrayList<Sohbetler> liste) {
        this.context = context;
        this.liste = liste;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return liste.size();
    }

    @Override
    public Sohbetler getItem(int i) {
        return liste.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, final ViewGroup viewGroup) {
        final View view1 = layoutInflater.inflate(R.layout.custom_sohbetler_gorunumu, null);

        ImageView ivResim = (ImageView) view1.findViewById(R.id.ivSohbetlerResim);
        final TextView tvAdSoyad = (TextView) view1.findViewById(R.id.tvSohbetlerAdSoyad);
        TextView tvAciklama = (TextView) view1.findViewById(R.id.tvSohbetlerAciklama);
        TextView tvZaman = (TextView) view1.findViewById(R.id.textViewtvSohbetlerZaman3);

        Picasso.with(context).load(liste.get(i).getResimUrl()).into(ivResim);
        tvAdSoyad.setText(liste.get(i).getAdSoyad());
        tvAciklama.setText(liste.get(i).getAciklama());
        tvZaman.setText(liste.get(i).getZaman());


        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view1.getContext(), ChatActivity.class);
                intent.putExtra("adsoyad", liste.get(i).getAdSoyad());
                intent.putExtra("userid", liste.get(i).getId());
                context.startActivity(intent);

            }
        });

        return view1;

    }
}
