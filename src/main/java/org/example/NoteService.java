package org.example;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoteService {
    Scanner scanner = new Scanner(System.in);
    private Map<LocalDate, String> notes = new HashMap<>();

    int liesOFCode;

    void addNote(LocalDate date) {
        System.out.println("Opisz swój dzisiejszy dzień:");
        String content = scanner.nextLine();
        notes.put(date, content);
    }

    void printNote() {
        System.out.println("Wpisz datę z jakiego dnia chciałbyś zobaczyć wpis: (RRRR-MM-DD)");
        String dataString = scanner.nextLine();
        LocalDate date = LocalDate.parse(dataString);
        String showNote = getNote(date);
        if (showNote != null) {
            System.out.println("Wpis z dnia " + date + " :");
            System.out.println(showNote);
        } else {
            System.out.println("Nie znaleziono wpisu z tą datą.");
        }
    }

    private String getNote(LocalDate date) {
        return notes.get(date);
    }
}