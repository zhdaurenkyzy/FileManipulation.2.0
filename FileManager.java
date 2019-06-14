package com.company;

import java.io.*;
import java.util.Scanner;

public class FileManager {
    String filename;
    String way;
    final static String name = "Укажите файл";
    final static String nameOfWay = "Укажите путь";

    public FileManager() {
    }

    public String getFilename() {
        return filename;
    }

    public String getWay() {
        return way;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public void copy() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(name);
            FileInputStream fileInputStream = new FileInputStream(scanner.next());
            System.out.println(nameOfWay);
            FileOutputStream fileOutputStream = new FileOutputStream(scanner.next());
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }
            fileInputStream.close();
            fileOutputStream.close();
            scanner.close();
            System.out.println("Файл скопирован");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден. Проверьте путь к файлу.");
        } catch (IOException e) {
            System.out.println("Файл не скопирован.");
        }
    }

    public void move() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name);
        File file = new File(scanner.next());
        System.out.println(nameOfWay);
        File newFile = new File(scanner.next());
        file.renameTo(newFile);
        scanner.close();
        System.out.println("Файл перемещен.");
    }

    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name);
        File file = new File(scanner.next());
        file.delete();
        scanner.close();
        System.out.println("Файл удален");
    }
}
