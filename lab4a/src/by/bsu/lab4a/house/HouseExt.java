package by.bsu.lab4a.house;

import by.bsu.lab4a.house.House;

public class HouseExt extends House {
    private String name = "HouseExt";
    private int price;
    private int duration;
    private int coef = 15;
    private int packet;
    private int risk;

    public HouseExt(int duration, int packet){
        System.out.println("Коэффициент тарифа HouseExt - " + getCoef());
        this.duration = duration;
        this.packet = packet;
        this.price = coef*duration;
        this.risk = price*packet;
    }

    public int getPrice(){
        return price;
    }

    public int getDuration(){
        return duration;
    }

    public int getCoef(){
        return coef;
    }

    public String getName(){
        return name;
    }

    public int getRisk(){
        return risk;
    }

    public void secureTeritory () {
        System.out.println("Страховка территории");
    }
}
