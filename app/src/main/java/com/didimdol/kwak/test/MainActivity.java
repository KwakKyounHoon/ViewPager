package com.didimdol.kwak.test;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.didimdol.kwak.test.adapter.MainListAdapter;
import com.didimdol.kwak.test.data.AirBnBCommend;
import com.didimdol.kwak.test.data.HostCommend;
import com.didimdol.kwak.test.data.ImageData;
import com.didimdol.kwak.test.data.MainData;
import com.didimdol.kwak.test.data.SearchImage;
import com.didimdol.kwak.test.data.WeekCommend;

public class MainActivity extends AppCompatActivity {

    RecyclerView listview;
    MainListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DrawerLayout drawer;

        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab_click);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.menuicon);

        listview = (RecyclerView)findViewById(R.id.rv_list);

        mAdapter = new MainListAdapter(getSupportFragmentManager());

        listview.setAdapter(mAdapter);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        listview.setLayoutManager(manager);
        initData();
    }

    private void initData() {
        MainData mainData = new MainData();
//        Drawable[] image = {ContextCompat.getDrawable(this,R.drawable.test), ContextCompat.getDrawable(this,R.drawable.test),ContextCompat.getDrawable(this,R.drawable.test)};
        mainData.setUserName("KKH");

        SearchImage searchImage = new SearchImage();

        ImageData imageData = new ImageData();
        imageData.setImageId(R.drawable.roma);
        imageData.setImageName("로마");
        searchImage.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.seoul);
        imageData.setImageName("서울");
        searchImage.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.london);
        imageData.setImageName("런던");
        searchImage.getImageDatas().add(imageData);

        mainData.setSearchImage(searchImage);


        WeekCommend weekCommend = new WeekCommend();

        imageData = new ImageData();
        imageData.setImageId(R.drawable.bangkok);
        imageData.setImageName("방콕");
        weekCommend.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.osaka);
        imageData.setImageName("오사카");
        weekCommend.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.pari);
        imageData.setImageName("파리");
        weekCommend.getImageDatas().add(imageData);

        mainData.setWeekCommend(weekCommend);

        AirBnBCommend airBnBCommend = new AirBnBCommend();

        imageData = new ImageData();
        imageData.setImageId(R.drawable.smellslikeeamessspirit);
        imageData.setImageName("Shipping Containers");
        airBnBCommend.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.teslachargers);
        imageData.setImageName("Horse Ranches");
        airBnBCommend.getImageDatas().add(imageData);
        imageData = new ImageData();
        imageData.setImageId(R.drawable.smellslikeeamessspirit);
        imageData.setImageName("Milano Design");
        airBnBCommend.getImageDatas().add(imageData);

        mainData.setAirBnBCommend(airBnBCommend);

        HostCommend hostCommend = new HostCommend();
        hostCommend.setImage(ContextCompat.getDrawable(this,R.drawable.test));
        hostCommend.setRecomendText("여유 공간을 임대하여 수입을 올리세요.");
        mainData.setHostCommend(hostCommend);

        mAdapter.setmainData(mainData);
    }
}
