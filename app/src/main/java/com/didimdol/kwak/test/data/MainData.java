package com.didimdol.kwak.test.data;

/**
 * Created by Kwak on 2016-08-14.
 */
public class MainData {

    private String userName;

    private SearchImage searchImage;

    private HostCommend hostCommend;

    private WeekCommend weekCommend;

    private AirBnBCommend airBnBCommend;

    public AirBnBCommend getAirBnBCommend() {
        return airBnBCommend;
    }

    public void setAirBnBCommend(AirBnBCommend airBnBCommend) {
        this.airBnBCommend = airBnBCommend;
    }

    public HostCommend getHostCommend() {
        return hostCommend;
    }

    public WeekCommend getWeekCommend() {
        return weekCommend;
    }

    public void setWeekCommend(WeekCommend weekCommend) {
        this.weekCommend = weekCommend;
    }

    public void setHostCommend(HostCommend hostCommend) {
        this.hostCommend = hostCommend;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public SearchImage getSearchImage() {
        return searchImage;
    }

    public void setSearchImage(SearchImage searchImage) {
        this.searchImage = searchImage;
    }
}
