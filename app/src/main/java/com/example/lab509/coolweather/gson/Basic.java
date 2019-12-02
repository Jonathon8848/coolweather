package com.example.lab509.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lab509 on 2019/12/2.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
