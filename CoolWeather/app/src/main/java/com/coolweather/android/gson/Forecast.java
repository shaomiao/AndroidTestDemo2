package com.coolweather.android.gson;import com.google.gson.annotations.SerializedName;/** * Created by shaomiao on 2016-12-19. */public class Forecast {    public String date;    @SerializedName("tmp")    public Temperature temperature;    @SerializedName("cond")    public More more;    public class Temperature {        public String max;        public String min;    }    public class More {        @SerializedName("text_d")        public String info;    }}