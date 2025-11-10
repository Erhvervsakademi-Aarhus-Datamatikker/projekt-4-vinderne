package storage;

import model.Forestilling;
import model.Kunde;
import model.Plads;

import java.util.ArrayList;

public class Storage {
    private static final ArrayList<Forestilling> forestillinger = new ArrayList<>();
    private static final ArrayList<Kunde> kunder = new ArrayList<>();
    private static final ArrayList<Plads> pladser = new ArrayList<>();


    public static void addForestillinger(Forestilling forestilling) {
        if (!forestillinger.contains(forestilling)) {
            forestillinger.add(forestilling);
        }
    }

    public static void addKunder(Kunde kunde) {
        if (!kunder.contains(kunde)) {
            kunder.add(kunde);
        }
    }

    public static void addPladser(Plads plads) {
        if (!pladser.contains(plads)) {
            pladser.add(plads);
        }
    }

    public ArrayList<Forestilling> getForestillinger() {
        return forestillinger;
    }

    public ArrayList<Kunde> getKunder() {
        return kunder;
    }

    public ArrayList<Plads> getPladser() {
        return pladser;
    }
}
