package com.example.app.webviewtest;/** * Created by shaomiao on 2016-12-14. */public interface HttpCallbackListener {    void onFinish(String response);    void onError(Exception e);}