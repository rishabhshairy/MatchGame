package com.example.rishabh.matchgame;

/**
 * Created by Rishabh on 2/15/2018.
 */

public class MyOptions {
    String options;
    int resid;

    public MyOptions(String options,int id) {
        this.options = options;
        this.resid=id;

    }

    public int getResid() {
        return resid;
    }

    public void setResid(int resid) {
        this.resid = resid;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }
}
