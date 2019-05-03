package by.bsu.lab6;

public class Main {
    public static void main(String[] args) {
        Suit suit = new Suit("Черный", "Хлопок", "Деловой");
        suit.show(suit.getColor(), suit.getMaterial());
        suit.style(suit.getStyle());
        suit.buttons();
        suit.firm();
    }
}
