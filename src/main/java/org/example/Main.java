package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleService simpleService = new SimpleService();

        //task 1
        simpleService.showHello(sc);
        //task 2
        simpleService.showHelloName(sc);
        //task 3
        simpleService.showMultipleElementsOfThree(sc);
    }
}