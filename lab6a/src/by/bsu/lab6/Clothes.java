package by.bsu.lab6;

public abstract class Clothes implements Cloth {

    public void style(String style) {
        System.out.println("Стиль: " + style);
    }

    abstract void firm();

    @Override
    public void show(String color, String material) {
        System.out.println("Цвет: " + color + ", Материал: " + material);
    }
}
