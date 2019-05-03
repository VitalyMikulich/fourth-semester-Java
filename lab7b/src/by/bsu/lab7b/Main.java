package by.bsu.lab7b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut venenatis tellus in metus. Blandit turpis cursus in hac habitasse platea. Non curabitur gravida arcu ac tortor dignissim. Blandit libero volutpat sed cras ornare arcu dui vivamus arcu. Cras semper auctor neque vitae tempus quam pellentesque nec nam. Pharetra et ultrices neque ornare. Tincidunt id aliquet risus feugiat in ante. Enim nulla aliquet porttitor lacus luctus accumsan tortor posuere ac. Morbi tristique senectus et netus et malesuada fames ac. Dui nunc mattis enim ut tellus elementum. Tortor pretium viverra suspendisse potenti nullam ac tortor. Sem nulla pharetra diam sit amet. Justo nec ultrices dui sapien eget. Facilisi nullam vehicula ipsum a arcu cursus vitae congue mauris. Mattis vulputate enim nulla aliquet porttitor lacus. Ante in nibh mauris cursus mattis molestie a iaculis. Dui vivamus arcu felis bibendum. Faucibus a pellentesque sit amet.";
        String[] splittedText = text.split("\\.");
        Sentence[] sentences = new Sentence[splittedText.length];
        for(int i = 0; i < splittedText.length; i++){
            splittedText[i] = splittedText[i].trim();
            sentences[i] = new Sentence(splittedText[i]);
        }
        System.out.println("Введите начальный символ");
        String startSymbol = in.next();
        System.out.println("Введите конечный символ");
        String endSymbol = in.next();
        Symbol start = new Symbol(startSymbol);
        Symbol end = new Symbol(endSymbol);
        for (int i = 0; i < sentences.length; i++) {
            if(sentences[i].indexOf(start.getSymbol()) == -1 || sentences[i].lastIndexOf(end.getSymbol()) == -1) {
                System.out.println("В предложении " + (i + 1) + " нет одного из символов");
            } else if(sentences[i].lastIndexOf(end.getSymbol()) < sentences[i].indexOf(start.getSymbol())) {
                System.out.println("Предложение " + (i + 1) + ": " + sentences[i].substring(sentences[i].indexOf(end.getSymbol()), sentences[i].lastIndexOf(start.getSymbol()) + 1));
            } else {
                System.out.println("Предложение " + (i + 1) + ": " + sentences[i].substring(sentences[i].indexOf(start.getSymbol()), sentences[i].lastIndexOf(end.getSymbol()) + 1));
            }
        }
    }
}
