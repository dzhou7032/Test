package com.example.test;

public class Player{

    private int ammo;
    private int cash;

    public Player(int ammo, int cash){
        this.ammo = ammo;
        this.cash = cash;
    }

    public int fired(){
        return ammo--;
    }

}
