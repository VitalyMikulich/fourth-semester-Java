package by.bsu.lab3c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество векторов");
        int m = in.nextInt();
        Vector[] vectors = new Vector[m];
        for(int i = 0; i < m; i++){
            System.out.println("Введите X " + (i+1) + "-ого вектора");
            int x = in.nextInt();
            System.out.println("Введите Y " + (i+1) + "-ого вектора");
            int y = in.nextInt();
            vectors[i] = new Vector(x, y);
        }
        for(int i = 0; i < m; i++){
            System.out.println("X: " + vectors[i].getX() + ", Y: " + vectors[i].getY());
        }
        System.out.println("Операция инкремента");
        increment(vectors, m);
        System.out.println("Операция декремента");
        decrement(vectors, m);
        System.out.println("Операция индексирования");
        System.out.println("Что вы хотите отобразить: 1 - X; 2 - Y");
        int choice = in.nextInt();
        indexing(vectors, choice, m);
        System.out.println("Угол между векторами: " + "X: " + vectors[0].getX() + ", Y: " + vectors[0].getY() + " и "  + "X: " + vectors[1].getX() + ", Y: " + vectors[1].getY()  + " равен " + angle(vectors[0], vectors[1]));;
        angle(vectors[0], vectors[1]);
        System.out.println("Угол между векторами: " + "X: " + vectors[1].getX() + ", Y: " + vectors[1].getY() + " и "  + "X: " + vectors[2].getX() + ", Y: " + vectors[2].getY() + " равен " + angle(vectors[1], vectors[2]));
        angle(vectors[1], vectors[2]);
        System.out.println("Угол между векторами: " + "X: " + vectors[0].getX() + ", Y: " + vectors[0].getY() + " и "  + "X: " + vectors[2].getX() + ", Y: " + vectors[2].getY() + " равен " + angle(vectors[0], vectors[2]));
        angle(vectors[0], vectors[2]);
    }

    public static void increment (Vector[] vectors, int m){
        for(int i = 0; i < m; i++){
            vectors[i].setX(vectors[i].getX() + 1);
            vectors[i].setY(vectors[i].getY() + 1);
            System.out.println("X: " + vectors[i].getX() + ", Y: " + vectors[i].getY());
        }
    }

    public static void decrement (Vector[] vectors, int m){
        for(int i = 0; i < m; i++){
            vectors[i].setX(vectors[i].getX() - 1);
            vectors[i].setY(vectors[i].getY() - 1);
            System.out.println("X: " + vectors[i].getX() + ", Y: " + vectors[i].getY());
        }
    }

    public static void indexing (Vector[] vectors, int choice, int m){
        if(choice == 1) {
            for(int i = 0; i < m; i++){
                System.out.println("Координата X " + (i+1) + "-ого вектора - " + vectors[i].getX());
            }
        }
        if(choice == 2) {
            for(int i = 0; i < m; i++){
                System.out.println("Координата Y " + (i+1) + "-ого вектора - " + vectors[i].getY());
            }
        }
    }

    public static double lenght_vect (Vector vector){
        return Math.sqrt(Math.pow(vector.getX(), 2) + Math.pow(vector.getY(), 2));
    }

    public static double scalar_product (Vector vector1, Vector vector2){
        return vector1.getX()*vector2.getX() + vector1.getY()*vector2.getY();
    }

    public static double angle (Vector vector1, Vector vector2){
        return Math.acos(scalar_product(vector1, vector2)/(lenght_vect(vector1)*lenght_vect(vector2)));
    }
}
