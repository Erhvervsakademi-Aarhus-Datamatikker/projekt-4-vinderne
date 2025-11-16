package gui;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import model.*;

import java.util.ArrayList;


public class Gui extends Application {
    // listviews
    private ListView<Forestilling> forestillingerList = new ListView<>();
    private ListView<Kunde> kundeList = new ListView<>();

    // labels
    private Label lblForestillinger = new Label("Forestillinger");
    private Label lblKunder = new Label("Kunder");
    private Label lblNavn = new Label("Navn");
    private Label lblStartDato = new Label("Start dato");
    private Label lblSlutDato = new Label("Slut dato");
    private Label lblKundeNavn = new Label("Kunde navn");
    private Label lblKundeMobil = new Label("Kunde mobil");

    //textfield
    private TextField txtFieldNavn = new TextField();
    private TextField txtFieldStartDato = new TextField();
    private TextField txtFieldSlutDato = new TextField();
    private TextField txtFieldKundeNavn = new TextField();
    private TextField txtFieldKundeMobil = new TextField();

    //buttons
    private Button btnOpretForestilling = new Button("Opret forestilling");
    private Button btnOpretKunde = new Button("Opret kunde");

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Projekt-4-vinderne");
        GridPane grid = new GridPane();
        grid.setHgap(20);
        grid.setVgap(20);

        this.initContent(grid);

        Scene scene = new Scene(grid);

        stage.setScene(scene);


        stage.show();
    }

    private void initContent(GridPane grid) {
        grid.setPadding(new Insets(20));

        double labelWidth = 80;
        lblNavn.setMinWidth(labelWidth);
        lblStartDato.setMinWidth(labelWidth);
        lblSlutDato.setMinWidth(labelWidth);
        lblKundeNavn.setMinWidth(labelWidth);
        lblKundeMobil.setMinWidth(labelWidth);

        grid.add(lblForestillinger, 0, 0);
        grid.add(forestillingerList, 0, 1);

        grid.add(lblKunder, 1, 0);
        grid.add(kundeList, 1, 1);

        HBox navnBox = new HBox(20, lblNavn, txtFieldNavn);
        grid.add(navnBox, 0, 2, 2, 1);

        HBox startDatoBox = new HBox(20, lblStartDato, txtFieldStartDato);
        grid.add(startDatoBox, 0, 3, 2, 1);

        HBox slutDatoBox = new HBox(20, lblSlutDato, txtFieldSlutDato);
        grid.add(slutDatoBox, 0, 4, 2, 1);

        Region spacer = new Region();
        spacer.setMinWidth(labelWidth);
        HBox opretForestillingBox = new HBox(20, spacer, btnOpretForestilling);
        grid.add(opretForestillingBox, 0, 5, 2, 1);

        HBox kundeNavnBox = new HBox(20, lblKundeNavn, txtFieldKundeNavn);
        grid.add(kundeNavnBox, 1, 2, 2, 1);

        HBox kundemobilBox = new HBox(20, lblKundeMobil, txtFieldKundeMobil);
        grid.add(kundemobilBox, 1, 3, 2, 1);

        Region spacer2 = new Region();
        spacer2.setMinWidth(labelWidth);
        HBox opretKundeBox = new HBox(20, spacer2, btnOpretKunde);
        grid.add(opretKundeBox, 1, 4, 2, 1);
    }

    private static <T> void addfromArrayListToItemList(ArrayList<T> arrayList, ListView<T> listView) {
        listView.getItems().addAll(arrayList);
    }
}

