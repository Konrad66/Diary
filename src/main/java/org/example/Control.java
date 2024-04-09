package org.example;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Control {

    Scanner scanner = new Scanner(System.in);

    private Map<LocalDate, String> notes = new HashMap<>();

    private void printMenu() {
        System.out.println("Witaj w swoim dzienniku. Wybierz z opcji poniżej:");
        System.out.println("1. Opisz swój dzisiejszy dzień:");
        System.out.println("2. Zobacz co się u ciebie działo w poprzednich dniach");
    }

    void doMenu(){
        while (true) {
            printMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> addNote(LocalDate.now());
                case "2" -> printNote();
                default -> System.out.println("Zły wybór, spróbuj jeszcze raz");
            }
        }
    }




    private void addNote(LocalDate date) {
        String content = scanner.nextLine();
        notes.put(date, content);
    }

    private String printNote(){

        return null;
    }
}