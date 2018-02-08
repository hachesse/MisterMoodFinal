package com.seghir.hamza.mistermoodfinal.View;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.seghir.hamza.mistermoodfinal.R;

public class PagerFragment extends Fragment {


    private static final String KEY_TITLE = "key_titile";
    private static final String KEY_PAGE_ID = "key_page_id";
    private int page_id;
    private ImageView moodImg;

    public int[] lst_images = {
            R.drawable.smileysuperhappy,
            R.drawable.smileyhappy,
            R.drawable.smileynormal,
            R.drawable.smileydisappointed,
            R.drawable.smileysad,
    };
    // liste couleur background
    public int [] lst_backgroundcolor = {

            Color.rgb(184, 235, 134), //light_sage
            Color.rgb(133, 179, 229),  //cornflower_blue_65
            Color.rgb(250, 236, 80),//banana_yellow
            Color.rgb(155, 155, 155), //warm_grey
            Color.rgb(222, 60, 81), //faded_red
    };

    public static PagerFragment newInstance(String title, int page_id) {

        Bundle args = new Bundle();
        args.putInt(KEY_PAGE_ID, page_id);
        PagerFragment fragment = new PagerFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getArguments();
        if (bundle != null) {
            this.page_id = bundle.getInt(KEY_PAGE_ID);
        }
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_page, container, false);
        this.moodImg = view.findViewById(R.id.moodimg);
        moodImg.setImageResource(lst_images[page_id % lst_images.length]);
        view.setBackgroundColor(lst_backgroundcolor[page_id % lst_backgroundcolor.length]);

        return view;
    }


}
