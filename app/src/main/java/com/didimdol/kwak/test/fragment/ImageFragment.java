package com.didimdol.kwak.test.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.didimdol.kwak.test.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImageFragment extends Fragment {


    public ImageFragment() {
        // Required empty public constructor
    }

    public static ImageFragment newInstance(int id, String name) {
        ImageFragment f = new ImageFragment();
        Bundle b = new Bundle();
        b.putInt("id", id);
        b.putString("name",name);
        f.setArguments(b);
        return f;
    }

    public static ImageFragment newInstance(int id) {
        ImageFragment f = new ImageFragment();
        Bundle b = new Bundle();
        b.putInt("id", id);
//        b.putString("name",name);
        f.setArguments(b);
        return f;
    }


    int id;
    String name;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            id = getArguments().getInt("id");
            name = getArguments().getString("name");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_image, container, false);
        ImageView pagerImage = (ImageView)view.findViewById(R.id.image_pager);
        TextView nameView = (TextView)view.findViewById(R.id.image_name);
        pagerImage.setImageDrawable(ContextCompat.getDrawable(getContext(),id));
        nameView.setText(name);
//        TextView messageView = (TextView)view.findViewById(R.id.text_message);
//        messageView.setText(message);
        return view;
    }

}
