package com.uc56.designmode_android;

import java.io.Serializable;

/**
 * Created by banketree on 2017/11/4.
 */

public class DesignModel implements Serializable {
    protected String name;
    protected String demo;
    protected String brief;
    protected String description;
    protected int[] imgBg;

    public DesignModel(String name, String demo, String brief, String description) {
        this.name = name;
        this.demo = demo;
        this.brief = brief;
        this.description = description;
    }

    public DesignModel(String name, String demo, String brief, String description, int[] imgBg) {
        this.name = name;
        this.demo = demo;
        this.brief = brief;
        this.description = description;
        this.imgBg = imgBg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int[] getImgBg() {
        return imgBg;
    }

    public void setImgBg(int[] imgBg) {
        this.imgBg = imgBg;
    }
}
