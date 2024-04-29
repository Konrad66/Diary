package org.example;

import java.time.LocalDate;
import java.util.*;

public class NoteService {
    Scanner scanner = new Scanner(System.in);
    //private Map<LocalDate, String> notes = new HashMap<>();
    List<Note> notes = new ArrayList<>();


    void addNote() {
        System.out.println("Opisz swój dzisiejszy dzień:");
        String content = scanner.nextLine();
        System.out.println("Podaj ile lini kodu dziś napisałeś: ");
        int linesOFCode = scanner.nextInt();
        scanner.nextLine();
        notes.add(new Note(content, LocalDate.now(), linesOFCode));
    }

    void printNote() {
        System.out.println("Wpisz datę z jakiego dnia chciałbyś zobaczyć wpis: (RRRR-MM-DD)");
        String dataString = scanner.nextLine();
        LocalDate date = LocalDate.parse(dataString);
        String showNote = getNote(date);
        if (showNote != null) {
            System.out.println("Wpis z dnia " + date + " :");
            System.out.println("Napisałeś dziś: " + notes.get().getLinesOfCode());
            System.out.println(showNote);
        } else {
            System.out.println("Nie znaleziono wpisu z tą datą.");
        }
    }

    private String getNote(LocalDate date) {
        return notes.get(date);
    }
}