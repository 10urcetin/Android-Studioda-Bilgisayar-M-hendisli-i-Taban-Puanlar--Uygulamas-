package com.onurcetin.bilgisayarmhendisliitabanpuanlar;

import java.io.Serializable;

public class University implements Serializable {

    String name;
    String city;
    int image;
    double sıralama;
    double puan;


    public University(String name,String city,int image,double sıralama,double puan){
        this.name=name;
        this.city=city;
        this.image=image;
        this.sıralama=sıralama;
        this.puan=puan;


    }



}
