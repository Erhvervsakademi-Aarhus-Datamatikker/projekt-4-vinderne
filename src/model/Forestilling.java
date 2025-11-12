package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Forestilling {
    private final String navn;
    private final LocalDate startDato;
    private final LocalDate slutDato;
    private final ArrayList<Bestilling> bestillinger = new ArrayList<>();

    public Forestilling(String navn, LocalDate startDato, LocalDate slutDato) {
        this.navn = navn;
        this.startDato = startDato;
        this.slutDato = slutDato;
    }

    public String getNavn() {
        return navn;
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }

    public ArrayList<Bestilling> getBestillinger() {
        return new ArrayList<>(bestillinger);
    }

    public Bestilling createBestilling(LocalDate date, Kunde kunde) {
        Bestilling bestilling = new Bestilling(date, this, kunde);
        bestillinger.add(bestilling);
        return bestilling;
    }

    @Override
    public String toString() {
        return navn + " (fra " + startDato + " til " + slutDato + ")";
    }
}
