package gui;

import model.Forestilling;
import model.Kunde;
import model.Plads;
import model.PladsType;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    private static final ArrayList<Plads> pladser = new ArrayList<>();

    public static void main(String[] args) {
        initStorage();
        System.out.println(Storage.getPladser());

    }

    public static void initStorage() {
        Forestilling forestillingEvita = new Forestilling("Evita",
                LocalDate.of(2023, 8, 10),
                LocalDate.of(2023, 8, 20));
        Forestilling forestillingLykkePer = new Forestilling("Lykke Per",
                LocalDate.of(2023, 9, 1),
                LocalDate.of(2023, 9, 10));
        Forestilling forestillingChess = new Forestilling("Chess",
                LocalDate.of(2023, 8, 21),
                LocalDate.of(2023, 8, 30));

        Kunde kundeAndersHansen = new Kunde("Anders Hansen",
                "11223344");
        Kunde kundePeterJensen = new Kunde("Peter Jensen",
                "12345678");
        Kunde kundeNielsMadsen = new Kunde("Niels Madsen",
                "12341234");


        addPladser(1, 5, 1, 2, 450, PladsType.STANDARD);
        addPladser(1, 5, 3, 18, 500, PladsType.STANDARD);
        addPladser(1, 5, 19, 20, 450, PladsType.STANDARD);
        addPladser(6, 10, 1, 2, 400, PladsType.STANDARD);
        addPladser(6, 9, 3, 18, 450, PladsType.STANDARD);
        addPladser(10, 10, 3, 7, 450, PladsType.STANDARD);
        addPladser(10, 10, 8, 12, 450, PladsType.KØRESTOL);
        addPladser(10, 10, 13, 18, 450, PladsType.STANDARD);
        addPladser(10, 10, 14, 18, 450, PladsType.STANDARD);
        addPladser(10, 10, 19, 20, 400, PladsType.STANDARD);
        addPladser(11, 11, 1, 7, 400, PladsType.STANDARD);
        addPladser(11, 11, 8, 12, 400, PladsType.EKSTRABEN);
        addPladser(11, 11, 13, 20, 400, PladsType.STANDARD);
        addPladser(12, 15, 1, 20, 400, PladsType.STANDARD);

        Storage.addForestillinger(forestillingEvita);
        Storage.addForestillinger(forestillingLykkePer);
        Storage.addForestillinger(forestillingChess);

        Storage.addKunder(kundeAndersHansen);
        Storage.addKunder(kundePeterJensen);
        Storage.addKunder(kundeNielsMadsen);

        for (Plads plads : pladser) {
            Storage.addPladser(plads);
        }

    }

    public static void addPladser(int fraRække, int tilRække, int fraKolonne, int tilKolonne,
                                  int pris, PladsType pladsType) {
        for (int i = fraRække; i <= tilRække; i++) {
            for (int j = fraKolonne; j <= tilKolonne; j++) {
                pladser.add(new Plads(i, j, pris, pladsType));
            }
        }
    }
}

