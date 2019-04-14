package by.bsu.lab4a;

import by.bsu.lab4a.house.HouseAll;
import by.bsu.lab4a.house.HouseExt;
import by.bsu.lab4a.life.LifeAll;
import by.bsu.lab4a.life.LifeExt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] risks = new int[4];
        String[] names = new String[4];
        int[] prices = new int[4];
        int[] durations = new int[4];
        int index = 0;
        LifeAll lifeAll;
        LifeExt lifeExt;
        HouseAll houseAll;
        HouseExt houseExt;
        System.out.println("Хотите добавить тариф LifeAll? Да-1 Нет-2");
        Scanner in = new Scanner(System.in);
        int answer = in.nextInt();
//        boolean lifeCheck = false;
        if(answer == 1) {
            System.out.println("Введите длительность: ");
            int duration = in.nextInt();
            System.out.println("Введите пакет: ");
            int packet = in.nextInt();
            lifeAll = new LifeAll(duration, packet);
            risks[index] = lifeAll.getRisk();
            names[index] = lifeAll.getName();
            prices[index] = lifeAll.getPrice();
            durations[index] = lifeAll.getDuration();
            lifeAll.secureLifeAll();
            lifeAll.secureLifeDurWork();
            index++;
        }

        System.out.println("Хотите добавить тариф HouseExt? Да-1 Нет-2");
        answer = in.nextInt();
        boolean carCheck = false;
        if(answer == 1) {
            System.out.println("Введите длительность: ");
            int duration = in.nextInt();
            System.out.println("Введите пакет: ");
            int packet = in.nextInt();
            houseExt = new HouseExt(duration, packet);
            carCheck = true;
            risks[index] = houseExt.getRisk();
            names[index] = houseExt.getName();
            prices[index] = houseExt.getPrice();
            durations[index] = houseExt.getDuration();
            houseExt.secureHouse();
            houseExt.secureTeritory();
            index++;
        }

        System.out.println("Хотите добавить тариф HouseAll? Да-1 Нет-2");
        answer = in.nextInt();
        boolean houseCheck = false;
        if(answer == 1) {
            System.out.println("Введите длительность: ");
            int duration = in.nextInt();
            System.out.println("Введите пакет: ");
            int packet = in.nextInt();
            houseAll = new HouseAll(duration, packet);
            houseCheck = true;
            risks[index] = houseAll.getRisk();
            names[index] = houseAll.getName();
            prices[index] = houseAll.getPrice();
            durations[index] = houseAll.getDuration();
            houseAll.secureHouse();
            houseAll.secure();
            index++;
        }

        System.out.println("Хотите добавить тариф LifeExt? Да-1 Нет-2");
        answer = in.nextInt();
//        boolean houseCheck = false;
        if(answer == 1) {
            System.out.println("Введите длительность: ");
            int duration = in.nextInt();
            System.out.println("Введите пакет: ");
            int packet = in.nextInt();
            lifeExt = new LifeExt(duration, packet);
            houseCheck = true;
            risks[index] = lifeExt.getRisk();
            names[index] = lifeExt.getName();
            prices[index] = lifeExt.getPrice();
            durations[index] = lifeExt.getDuration();
            lifeExt.secureLifeDurFreetime();
            lifeExt.secureLifeDurWork();
            index++;
        }

        System.out.println("Имя" + "|" + "Продолжительность" + "|"  + "Цена" + "|"  + "Риск" + "|");
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i] + "|" + durations[i] + "|"  + prices[i] + "|"  + risks[i]);
        }

        System.out.println("Максимальная длительность ");
        int maxDur = in.nextInt();
        System.out.println("Минимально длительность ");
        int minDur = in.nextInt();

        for(int i = 0; i < durations.length; i++) {
            if(durations[i] >= minDur && durations[i] <= maxDur){
                System.out.println(names[i] + " " + durations[i]);
            }
        }

        System.out.println("Максимальная цена ");
        int maxPrice = in.nextInt();
        System.out.println("Минимально цена ");
        int minPrice = in.nextInt();

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] >= minPrice && prices[i] <= maxPrice){
                System.out.println(names[i] + " " + prices[i]);
            }
        }

        boolean isSorted = false;
        int bufRisk;
        String bufName;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < risks.length-1; i++) {
                if(risks[i] < risks[i+1]){
                    isSorted = false;

                    bufRisk = risks[i];
                    risks[i] = risks[i+1];
                    risks[i+1] = bufRisk;

                    bufName = names[i];
                    names[i] = names[i+1];
                    names[i+1] = bufName;
                }
            }
        }

        System.out.println("Отсортированный по риску деритив");
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i] + " " + risks[i]);
        }

        int sum = 0;
        for (int i = 0; i < names.length; i++){
            sum += prices[i];
        }
        System.out.println("Стоимость деритива - " + sum);

    }

}
