package by.bsu.lab6;

public class Suit extends Clothes {
    private String color;
    private String material;
    private String style;

    public Suit(String color, String material, String style) {
        this.color = color;
        this.material = material;
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getStyle() {
        return style;
    }

    public void buttons () {
        System.out.println("Костюм застегивается");
    }

    @Override
    public void firm() {
        System.out.println("Armani");
    }
}
