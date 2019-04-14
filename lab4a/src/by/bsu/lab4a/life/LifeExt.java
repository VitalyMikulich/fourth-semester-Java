package by.bsu.lab4a.life;

import by.bsu.lab4a.life.Life;

public class LifeExt extends Life {
    private String name = "LifeExt";
    private int price;
    private int duration;
    private int coef = 10;
    private int packet;
    private int risk;

    public LifeExt(int duration, int packet){
        System.out.println("Коэффициент тарифа LifeExt - " + getCoef());
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

    public void secureLifeDurFreetime () {
        System.out.println("Страховка жизни в остальное время");
    }
}
