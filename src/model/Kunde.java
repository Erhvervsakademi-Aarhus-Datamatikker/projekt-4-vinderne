package model;

import java.util.ArrayList;

public class Kunde {
    private final String navn;
    private final String mobil;
    private final ArrayList<Bestilling> bestillinger = new ArrayList<>();

    public Kunde(String navn, String mobil) {
        this.navn = navn;
        this.mobil = mobil;
    }

    public String getNavn() {
        return navn;
    }

    public String getMobil() {
        return mobil;
    }

    public ArrayList<Bestilling> getBestillinger() {
        return bestillinger;
    }

    public void addBestillinger(Bestilling bestilling) {
        if (!bestillinger.contains(bestilling)) {
            bestillinger.add(bestilling);
        }
    }

    @Override
    public String toString() {
        return navn + "(" + mobil + ")";
    }
}
