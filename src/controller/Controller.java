package controller;

import model.*;
import storage.Storage;

import java.time.LocalDate;

public class Controller {

    public static Forestilling createForestilling(String navn, LocalDate startDato, LocalDate slutDato) {
        Forestilling forestilling = new Forestilling(navn, startDato, slutDato);
        Storage.addForestillinger(forestilling);
        return forestilling;
    }

    public static Kunde createKunde(String navn, String mobil) {
        Kunde kunde = new Kunde(navn, mobil);
        Storage.addKunder(kunde);
        return kunde;
    }

    public static Plads createPlads(int række, int nr, int pris, PladsType pladsType) {
        Plads plads = new Plads(række, nr, pris, pladsType);
        Storage.addPladser(plads);
        return plads;
    }
}
