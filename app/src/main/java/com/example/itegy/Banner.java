package com.example.itegy;

import android.media.Image;

public class Banner {

    private String id,name;
    public Image image;

    public  Banner(){
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public Image getImage(){
        return image;
    }
    public void setImage(Image image){
        this.image=image;
    }
}
