package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        control();
    }

    static Scanner scanner = new Scanner(System.in);


    static void control(){
        System.out.println("Opisz swój dzisiejszy dzień: ");
        String progres = scanner.nextLine();
        System.out.println("Twoje wnioski po dzisejszym dniu: " + progres);
    }
}