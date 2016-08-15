package com.didimdol.kwak.test.view;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.didimdol.kwak.test.R;
import com.didimdol.kwak.test.adapter.ImagePagerAdapter;
import com.didimdol.kwak.test.data.ImageDatas;

/**
 * Created by Kwak on 2016-08-14.
 */
public class SearchSliderViewHolder extends RecyclerView.ViewHolder {

    ViewPager pager;
    ImagePagerAdapter mAdapter;
    ImageDatas imageData;

    public SearchSliderViewHolder(View itemView, FragmentManager fragmentManager) {
        super(itemView);
        pager = (ViewPager)itemView.findViewById(R.id.pager);
        pager.setClipToPadding(false);
        mAdapter = new ImagePagerAdapter(fragmentManager);
        pager.setAdapter(mAdapter);
//        initData();
    }

//    private void initData() {
//        for (int i = 0; i < 10; i++) {
//            mAdapter.add("item " + i);
//        }
//    }

    public void setImageData(ImageDatas imageData){
        this.imageData = imageData;
        mAdapter.add(imageData);
    }
}
