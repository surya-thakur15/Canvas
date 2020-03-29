package com.example.canvas;

public class City {
    private String name;
    private String place;
    private String image;

    public City(String name, String place) {
       this.name = name;
       this.place = place;
       this.image = image;
    }
    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name = name;
    }

    public String getPlace(){
        return place;
    }
    public void  setPlace(String place){
        this.name = place;
    }

    public String getImage(){
        return image;
    }
    public void  setImage(String image){
        this.image = image;
    }
}