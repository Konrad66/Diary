package org.example;

import java.time.LocalDate;

public class Note {

    String note;
    LocalDate localDate;
    int linesOfCode;

    public Note(String note, LocalDate localDate, int linesOfCode) {
        this.note = note;
        this.localDate = localDate;
        this.linesOfCode = linesOfCode;
    }

    public String getNote() {
        return note;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public int getLinesOfCode() {
        return linesOfCode;
    }

    @Override
    public String toString() {
        return "Note{" +
                "note='" + note + '\'' +
                ", localDate=" + localDate +
                ", linesOfCode=" + linesOfCode +
                '}';
    }
}
