package keuzeContinent;

import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import keuzeMode.*;
import mainMenu.mainMenuView;
import model.Model;
import spelScherm.*;


public class keuzeContinentPresenter {
    private Stage window;
    private Model model;
    private mainMenuView mainMenuView;
    private keuzeContinentView keuzeContinentView;
    private keuzeModeView keuzeModeView;
    private spelSchermView spelSchermView;

    public keuzeContinentPresenter(Model model, keuzeContinentView keuzeContinentView, Stage window) {
        this.model = model;
        this.keuzeContinentView = keuzeContinentView;
        this.window = window;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers(){

        //EVENTS LABEL AFRIKA
        //Fontsize vergroten wanneer muis er op staat
        keuzeContinentView.getBtnAfrika().setOnMouseEntered(e->{
            keuzeContinentView.getBtnAfrika().setFont(Font.font(20));
        });
        //Fontsize verkleinen naar oorspronkelijke grote wanneer muis er van gaat
        keuzeContinentView.getBtnAfrika().setOnMouseExited(e->{
            keuzeContinentView.getBtnAfrika().setFont(Font.font(15));
        });
        //Als onlick DAN scherm veranderen naar spelscherm
        keuzeContinentView.getBtnAfrika().setOnMousePressed(e -> {
            //StringContinent op het gekozen continent zetten
            model.setStrContinent("afrika");
            spelSchermView = new spelSchermView();
            spelSchermPresenter spelSchermPresenter = new spelSchermPresenter(model, spelSchermView, window);
            Scene spelScherm = new Scene(spelSchermView);
            window.setScene(spelScherm);
            window.setWidth(1200);
            window.setHeight(855);
            window.show();
        });

        //EVENTS LABEL AZIE
        //Fontsize vergroten wanneer muis er op staat
        keuzeContinentView.getBtnAzie().setOnMouseEntered(e->{
            keuzeContinentView.getBtnAzie().setFont(Font.font(20));
        });
        //Fontsize verkleinen naar oorspronkelijke grote wanneer muis er van gaat
        keuzeContinentView.getBtnAzie().setOnMouseExited(e->{
            keuzeContinentView.getBtnAzie().setFont(Font.font(15));
        });
        //Als onlick DAN scherm veranderen naar spelscherm
        keuzeContinentView.getBtnAzie().setOnMousePressed(e -> {
            //StringContinent op het gekozen continent zetten
            model.setStrContinent("azie");
            spelSchermView = new spelSchermView();
            spelSchermPresenter spelSchermPresenter = new spelSchermPresenter(model, spelSchermView, window);
            Scene spelScherm = new Scene(spelSchermView);
            window.setScene(spelScherm);
            window.setWidth(1200);
            window.setHeight(855);
            window.show();
        });

        //EVENTS LABEL EUROPA
        //Fontsize vergroten wanneer muis er op staat
        keuzeContinentView.getBtnEuropa().setOnMouseEntered(e->{
            keuzeContinentView.getBtnEuropa().setFont(Font.font(20));
        });
        //Fontsize verkleinen naar oorspronkelijke grote wanneer muis er van gaat
        keuzeContinentView.getBtnEuropa().setOnMouseExited(e->{
            keuzeContinentView.getBtnEuropa().setFont(Font.font(15));
        });
        //Als onlick DAN scherm veranderen naar spelscherm
        keuzeContinentView.getBtnEuropa().setOnMousePressed(e -> {
            //StringContinent op het gekozen continent zetten
            model.setStrContinent("europa");
            spelSchermView = new spelSchermView();
            spelSchermPresenter spelSchermPresenter = new spelSchermPresenter(model, spelSchermView, window);
            Scene spelScherm = new Scene(spelSchermView);
            window.setScene(spelScherm);
            window.setWidth(1200);
            window.setHeight(855);
            window.show();
        });

        //EVENTS LABEL NOORDAMERIKA
        //Fontsize vergroten wanneer muis er op staat
        keuzeContinentView.getBtnNoordAmerika().setOnMouseEntered(e->{
            keuzeContinentView.getBtnNoordAmerika().setFont(Font.font(20));
        });
        //Fontsize verkleinen naar oorspronkelijke grote wanneer muis er van gaat
        keuzeContinentView.getBtnNoordAmerika().setOnMouseExited(e->{
            keuzeContinentView.getBtnNoordAmerika().setFont(Font.font(15));
        });
        //Als onlick DAN scherm veranderen naar spelscherm
        keuzeContinentView.getBtnNoordAmerika().setOnMousePressed(e -> {
            //StringContinent op het gekozen continent zetten
            model.setStrContinent("noordamerika");
            spelSchermView = new spelSchermView();
            spelSchermPresenter spelSchermPresenter = new spelSchermPresenter(model, spelSchermView, window);
            Scene spelScherm = new Scene(spelSchermView);
            window.setScene(spelScherm);
            window.setWidth(1200);
            window.setHeight(855);
            window.show();
        });

        //EVENTS LABEL ZUIDAMERIKA
        //Fontsize vergroten wanneer muis er op staat
        keuzeContinentView.getBtnZuidAmerika().setOnMouseEntered(e->{
            keuzeContinentView.getBtnZuidAmerika().setFont(Font.font(20));
        });
        //Fontsize verkleinen naar oorspronkelijke grote wanneer muis er van gaat
        keuzeContinentView.getBtnZuidAmerika().setOnMouseExited(e->{
            keuzeContinentView.getBtnZuidAmerika().setFont(Font.font(15));
        });
        //Als onlick DAN scherm veranderen naar spelscherm
        keuzeContinentView.getBtnZuidAmerika().setOnMousePressed(e -> {
            //StringContinent op het gekozen continent zetten
            model.setStrContinent("zuidamerika");
            spelSchermView = new spelSchermView();
            spelSchermPresenter spelSchermPresenter = new spelSchermPresenter(model, spelSchermView, window);
            Scene spelScherm = new Scene(spelSchermView);
            window.setScene(spelScherm);
            window.setWidth(1200);
            window.setHeight(855);
            window.show();
        });
        //EVENTS LABEL OCEANIE
        //Fontsize vergroten wanneer muis er op staat
        keuzeContinentView.getBtnOceanie().setOnMouseEntered(e->{
            keuzeContinentView.getBtnOceanie().setFont(Font.font(20));
        });
        //Fontsize verkleinen naar oorspronkelijke grote wanneer muis er van gaat
        keuzeContinentView.getBtnOceanie().setOnMouseExited(e->{
            keuzeContinentView.getBtnOceanie().setFont(Font.font(15));
        });
        //Als onlick DAN scherm veranderen naar spelscherm
        keuzeContinentView.getBtnOceanie().setOnMousePressed(e -> {
            //StringContinent op het gekozen continent zetten
            model.setStrContinent("oceanie");
            spelSchermView = new spelSchermView();
            spelSchermPresenter spelSchermPresenter = new spelSchermPresenter(model, spelSchermView, window);
            Scene spelScherm = new Scene(spelSchermView);
            window.setScene(spelScherm);
            window.setWidth(1200);
            window.setHeight(855);
            window.show();
        });

        //EVENTS LABEL TERUG
        //Fontsize vergroten wanneer muis er op staat
        keuzeContinentView.getBtnTerug().setOnMouseEntered(e->{
            keuzeContinentView.getBtnTerug().setFont(Font.font(20));
        });
        //Fontsize verkleinen naar oorspronkelijke grote wanneer muis er van gaat
        keuzeContinentView.getBtnTerug().setOnMouseExited(e->{
            keuzeContinentView.getBtnTerug().setFont(Font.font(15));
        });
        //Als onlick DAN scherm veranderen naar vorige scherm
        keuzeContinentView.getBtnTerug().setOnMousePressed(e -> {
            keuzeModeView = new keuzeModeView();
            keuzeModePresenter keuzeModePresenter = new keuzeModePresenter(model, keuzeModeView, window);
            Scene keuzeMode = new Scene(keuzeModeView);
            window.setScene(keuzeMode);
            window.show();
        });
    }
    private void updateView(){
        //fill mainMenuView with data from model
    }
}
