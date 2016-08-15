package com.didimdol.kwak.test.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.didimdol.kwak.test.data.ImageData;
import com.didimdol.kwak.test.data.ImageDatas;
import com.didimdol.kwak.test.fragment.ImageFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kwak on 2016-08-14.
 */
public class ImagePagerAdapter extends FragmentPagerAdapter {
    List<ImageData> items = new ArrayList<>();
    ImageDatas datas = new ImageDatas();

    public void add(ImageDatas datas) {
        this.items = datas.getImageDatas();
        notifyDataSetChanged();
    }

//    public void add(ImageDatas items) {
//        this.items = items.getImagedatas();
//        notifyDataSetChanged();
//    }

//    public void add(String text) {
//        items.add(text);
//        notifyDataSetChanged();
//    }

    public ImagePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return ImageFragment.newInstance(items.get(position).getImageId(), items.get(position).getImageName());
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public float getPageWidth(int position) {
        return 1.0f;
    }
}
