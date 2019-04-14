package by.bsu.lab4;

public class Main {
    public static void main(String[] args) {
        Sitter sitter1 = new Sitter("Sitter1");
        System.out.println("---" + sitter1.getName());
        sitter1.fly();
        sitter1.carryEggs();
        sitter1.sing();
        sitter1.broodСhicks();
        System.out.println(sitter1.toString());
        System.out.println(sitter1.hashCode());

        Sitter sitter2 = new Sitter("Sitter1");
        System.out.println("---" + sitter1.getName());
        sitter2.fly();
        sitter2.carryEggs();
        sitter2.sing();
        sitter2.broodСhicks();
        System.out.println(sitter2.toString());
        System.out.println(sitter2.hashCode());

        System.out.println(sitter1.equals(sitter2));
        System.out.println(sitter2.equals(sitter1));

        System.out.println(sitter1.hashCode() == sitter2.hashCode());
    }
}
