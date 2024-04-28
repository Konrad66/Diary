package org.example;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainControl {

    Scanner scanner = new Scanner(System.in);
    NoteService noteService = new NoteService();


    private void printMenu() {
        System.out.println("Witaj w swoim dzienniku. Wybierz z opcji poniżej:");
        System.out.println("1. Opisz swój dzisiejszy dzień:");
        System.out.println("2. Zobacz co się u ciebie działo w poprzednich dniach");
    }

    void doMenu() {
        while (true) {
            printMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> noteService.addNote(LocalDate.now());
                case "2" -> noteService.printNote();
                default -> System.out.println("Zły wybór, spróbuj jeszcze raz");
            }
        }
    }


}


// dodać zmienną liczacą linie kodu
// dodać zmienną ile czasu spędziłem na programowaniu
// zapis do pliku
// program sam mi liczy ile czasu spędziłem na sesji
// statystyki - podlicza ile było w każdym tygodniu
// ile łącznie dni programowałem - statystyka