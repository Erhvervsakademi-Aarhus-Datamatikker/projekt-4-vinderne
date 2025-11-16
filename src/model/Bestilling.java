package model;

import java.time.LocalDate;

public class Bestilling {
    private final LocalDate date;
    private final Forestilling forestilling;
    private Kunde kunde;

    public Bestilling(LocalDate date, Forestilling forestilling, Kunde kunde) {
        this.date = date;
        this.forestilling = forestilling;
        this.kunde = kunde;
    }

    public LocalDate getDate() {
        return date;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public Forestilling getForestilling() {
        return forestilling;
    }
}
