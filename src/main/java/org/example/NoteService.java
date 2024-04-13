package org.example;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoteService {

    Scanner scanner = new Scanner(System.in);

    private Map<LocalDate, String> notes = new HashMap<>();

     void addNote(LocalDate date) {
        System.out.println("Opisz swój dzisiejszy dzień:");
        String content = scanner.nextLine();
        notes.put(date, content);
    }


    private String priintNote(LocalDate date){
        return notes.get(date);
    }

     String printNote(){
        System.out.println("Wpisz datę z jakiego dnia chciałbyś zobaczyć wpis: (RRRR-MM-DD)");
        String dataString = scanner.nextLine();
        LocalDate date = LocalDate.parse(dataString);
        String showNote = priintNote(date);
        if (showNote != null){
            System.out.println("Wpis z dnia " + date + " :");
            System.out.println(showNote);
        } else {
            System.out.println("Nie znaleziono wpisu z tą datą.");
        }
        return null;
    }
}
