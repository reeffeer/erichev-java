package org.example;

import java.util.Scanner;

public class SimpleService {
    public void showMultipleElementsOfThree(Scanner sc) {
        System.out.println("Введите размер массива");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public void showHelloName(Scanner sc) {
        System.out.println("Введите имя");
        String name = sc.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        }
    }

    public void showHello(Scanner sc) {
        System.out.println("Введите число");
        int num = sc.nextInt();
        if (num > 7) {
            System.out.println("Привет");
        }
    }
}
