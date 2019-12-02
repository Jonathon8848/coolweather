package com.example.lab509.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lab509 on 2019/12/2.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
