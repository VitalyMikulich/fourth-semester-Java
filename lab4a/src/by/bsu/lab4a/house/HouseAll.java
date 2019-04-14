package by.bsu.lab4a.house;

import by.bsu.lab4a.house.House;

public class HouseAll extends House {
    private String name = "HouseAll";
    private int price;
    private int duration;
    private int coef = 15;
    private int packet;
    private int risk;

    public HouseAll(int duration, int packet){
        System.out.println("Коэффициент тарифа HouseAll - " + getCoef());
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

    public void secure () {
        System.out.println("Охрана");
    }
}
