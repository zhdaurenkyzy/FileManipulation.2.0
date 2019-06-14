package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие: \n 1 - копировать; \n 2 - переместить; \n 3 - удалить. ");
        int menu = scanner.nextInt();
        FileManager fileManager = new FileManager();
        switch (menu) {
            case 1:
                fileManager.copy();
                break;
            case 2:
                fileManager.move();
                break;
            case 3:
                fileManager.delete();
        }
    }
}
