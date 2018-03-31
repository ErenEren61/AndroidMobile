package com.example.lab08.whatsappuidesign.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.lab08.whatsappuidesign.Adapter.ListViewSohbetlerAdapter;
import com.example.lab08.whatsappuidesign.Model.Sohbetler;
import com.example.lab08.whatsappuidesign.R;

import java.util.ArrayList;
import java.util.concurrent.RunnableScheduledFuture;

/**
 * Created by Lab08 on 24.03.2018.
 */

public class FragmentSohbetler extends Fragment {
    ArrayList<Sohbetler> sohbetlers = new ArrayList<>();

    public void init() {
        sohbetlers.add(new Sohbetler(1, "Murat Boz", "Zamlar ne durumda, acilen zam verilmesi gerek, aksi takdirde işi bırakacağım. Katılıyorsan sende bir açıklama yap lütfen, hadi bekliyorum söylesene", "Dün", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png"));
        sohbetlers.add(new Sohbetler(2, "Kamil KOÇ", "Aciklama2", "Dün", "https://cdn.pixabay.com/photo/2017/11/06/23/19/composing-2925179_960_720.jpg"));
        sohbetlers.add(new Sohbetler(3, "Devlet Bahçeli", "Ben bu partiyi çok seviyorum ", "Dün", "https://cdn.pixabay.com/photo/2017/11/11/21/55/girl-2940655_960_720.jpg"));
        sohbetlers.add(new Sohbetler(4, "Ali VELİ 49-50", "Aciklama4", "14:20", "https://cdn.pixabay.com/photo/2018/01/25/14/12/nature-3106213_960_720.jpg"));
        sohbetlers.add(new Sohbetler(5, "Acun Ilıcalı", "Aciklama3", "23:55", "https://www.themebeta.com/files/picture/201703/01/8e4eb2b943f652471f15f1b60c4f471d.jpeg"));
        sohbetlers.add(new Sohbetler(6, "Murat Dalkılıç", "Aciklama4", "Dün", "http://www.whatsapp99.com/wp-content/uploads/2017/06/COOL-mustaches-dp-for-whatsapp-profile-images.png"));
        sohbetlers.add(new Sohbetler(7, "Süleyman Soylu ", "Aciklama1", "Dün", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRWIOtDAb9kPsTjuCgq18GMliMwz9bS05oGUciSkPABL1BkUek-"));
        sohbetlers.add(new Sohbetler(8, "Sıla", "Aciklama2", "Dün", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9HAb0mvkopiMl4x_yawY_zLhRXxPDSC7Pn9l8FLr4xiHv8Azffg"));
        sohbetlers.add(new Sohbetler(9, "Ege Yazgan", "Aciklama3", "Dün", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTPcP9AQyJtmj5d8jmQ33qJlXS6sMI9Nhop7oZO964NcUR-OpEu"));
        sohbetlers.add(new Sohbetler(10, "Alişan", "Aciklama4", "Dün", "http://www.thehindu.com/sci-tech/technology/internet/article17759222.ece/alternates/FREE_660/02th-egg-person"));


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout_sohbetler, container, false);

        ListView listViewSohbetler = (ListView) view.findViewById(R.id.listViewSohbetler);
       init();
        ListViewSohbetlerAdapter adapter = new ListViewSohbetlerAdapter(getContext(), sohbetlers);
        listViewSohbetler.setAdapter(adapter);

        return view;
    }
}
