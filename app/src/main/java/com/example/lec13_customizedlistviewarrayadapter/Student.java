package com.example.lec13_customizedlistviewarrayadapter;

import android.widget.ImageView;

public class Student {
    private int img;
    private String Name;
    private String id;
    private String section;

    //right click, generate, constructor
    public Student(String name, String id, String section, int img) {
        this.img=img;
        this.Name = name;
        this.id = id;
        this.section = section;
    }
    //right click, generate, getter setters
    public int getImage() {
        return img;
    }
    public void setImage(int img) {
        this.img=img;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }




}
