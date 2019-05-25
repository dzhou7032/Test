package com.example.test;

import java.util.ArrayList;

public class Shop {

    public static ArrayList<Gasha> banner;

    public static ArrayList Generate(int size){

        for(int i = 0; i < size; i++){
            int rarity = (int)Math.random()*5 + 1;
            banner.add(new Gasha(rarity, i));
        }
        return banner;

    }

    public static void pulled(){

        int number = (int)Math.random()*5 + 1;
        Inventory.addtoInventory(banner.get(number));

    }
}
