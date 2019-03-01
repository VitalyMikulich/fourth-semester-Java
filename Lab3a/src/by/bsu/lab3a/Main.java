package by.bsu.lab3a;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Bus[] buses = new Bus[3];
        buses[0] = new Bus("Mikulich V.V.", 1337, 77, "MAZ", 2010, 1000);
        buses[1] = new Bus("Mihalich M.M.", 1111, 11, "SCANIA", 2012, 1200);
        buses[2] = new Bus("Petrovich P.P.", 1234, 44, "MAN", 2015, 900);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер маршрута");
        int route = in.nextInt();
        bus_route(buses, route);
        System.out.println("Введите количество лет эксплуатации");
        int years = in.nextInt();
        above_year(buses, years);
        System.out.println("Введите пробег");
        int mileage = in.nextInt();
        above_mileage(buses, mileage);
    }


    public static void bus_route(Bus[] buses, int route){
        System.out.println("Автобусы по маршруту - " + route);
        for(int i = 0; i < buses.length; i++){
            if(buses[i].getRoute_numb() == route){
                System.out.println(buses[i].getBus_numb() + " " + buses[i].getDriver());
            }
        }
    }

    public static void above_year(Bus[] buses, int years){
        System.out.println("Автобусы эксплотируемые больше - " + years);
        for(int i = 0; i < buses.length; i++){
            if(2019 - buses[i].getYear() > years){
                System.out.println(buses[i].getBus_numb() + " " + buses[i].getDriver());
            }
        }
    }

    public static void above_mileage(Bus[] buses, int mileage){
        System.out.println("Автобусы с пробегом больше - " + mileage);
        for(int i = 0; i < buses.length; i++){
            if(buses[i].getMileage() > mileage){
                System.out.println(buses[i].getBus_numb() + " " + buses[i].getDriver());
            }
        }
    }
}
