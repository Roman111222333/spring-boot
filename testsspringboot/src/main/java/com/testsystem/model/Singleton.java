package com.testsystem.model;

import javax.persistence.Entity;

/**
 * Created by roman.ali on 9/13/2022.
 */
@Entity

public class Singleton {
    private static Singleton singleton=new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        return singleton;
    }
    Singleton obj=Singleton.getInstance();


}
