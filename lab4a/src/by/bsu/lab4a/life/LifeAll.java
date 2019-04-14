package by.bsu.lab4a.life;

import by.bsu.lab4a.life.Life;

public class LifeAll extends Life {
    private String name = "LifeAll";
    private int price;
    private int duration;
    private int coef = 12;
    private int packet;
    private int risk;

    public LifeAll(int duration, int packet){
        System.out.println("Коэффициент тарифа LifeAll - " + getCoef());
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

    public void secureLifeAll () {
        System.out.println("Страховка жизни всегда");
    }
}
