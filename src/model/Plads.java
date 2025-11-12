package model;

import java.util.ArrayList;

public class Plads {
    private final int række;
    private final int nr;
    private final int pris;
    private final PladsType pladsType;

    private final ArrayList<Bestilling> bestillinger = new ArrayList<>();

    public Plads(int række, int nr, int pris, PladsType pladsType) {
        this.række = række;
        this.nr = nr;
        this.pris = pris;
        this.pladsType = pladsType;
    }

    public int getRække() {
        return række;
    }

    public int getNr() {
        return nr;
    }

    public int getPris() {
        return pris;
    }

    public PladsType getPladsType() {
        return pladsType;
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
        return "Plads{" +
                "række=" + række +
                ", nr=" + nr +
                ", pris=" + pris +
                ", pladsType=" + pladsType +
                '}';
    }
}
