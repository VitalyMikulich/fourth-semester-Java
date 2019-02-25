package by.bsu.lab2b;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int N = 3;
        int[][] a = new int[N][N];
        int n = N, m = N;
        boolean p = false;
        System.out.println("Матрица:");

        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
                // до 9
            }
        }
        for (int i = 0; i < m; i++, System.out.println()) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
        }


        for (int i = 0; i < n; i++) {
            p = true;
            for (int j = 0; j < m; j++)
                if (a[i][j] != 0) {
                    p = false;
                    break;
                }
            if (p) {
                for (int k = i; k < (n - 1); k++)
                    for (int j = 0; j < m; j++)
                        a[k][j] = a[k + 1][j];
                --i;
                --n;
            }
        }


        for (int j = 0; j < m; j++) {
            p = true;
            for (int i = 0; i < n; i++)
                if (a[i][j] != 0) {
                    p = false;
                    break;
                }
            if (p) {
                for (int k = j; k < (m - 1); k++)
                    for (int i = 0; i < m; i++)
                        a[i][k] = a[i][k + 1];
                --j;
                --m;
            }
        }
        System.out.println("После уплотнения:");
        for (int i = 0; i < m; i++, System.out.println()) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
        }

    }
}
