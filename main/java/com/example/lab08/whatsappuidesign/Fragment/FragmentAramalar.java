package com.example.lab08.whatsappuidesign.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lab08.whatsappuidesign.R;

/**
 * Created by Lab08 on 24.03.2018.
 */

public class FragmentAramalar extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout_aramalar, container, false);

        return view;
    }
}
