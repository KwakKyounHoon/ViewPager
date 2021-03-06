package com.didimdol.kwak.test.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.didimdol.kwak.test.R;
import com.didimdol.kwak.test.data.HostCommend;

/**
 * Created by Kwak on 2016-08-15.
 */
public class HostRecommendViewHolder extends RecyclerView.ViewHolder {

    TextView commendtextView;
    ImageView commendImageview;
    HostCommend hostCommend;

    public HostRecommendViewHolder(View itemView) {
        super(itemView);
        commendImageview = (ImageView)itemView.findViewById(R.id.image_hostcommend);
        commendtextView = (TextView)itemView.findViewById(R.id.text_hostcommend);
    }

    public void setHostCommend(HostCommend hostCommend){
        this.hostCommend = hostCommend;
        commendImageview.setImageDrawable(hostCommend.getImage());
        commendtextView.setText(hostCommend.getRecomendText());
    }


}
