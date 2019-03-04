package keuzeMode;

import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import keuzeContinent.*;
import mainMenu.*;
import model.Model;


public class keuzeModePresenter {
    private Stage window;
    private Model model;
    private mainMenuView mainMenuView;
    private keuzeModeView keuzeModeView;
    private keuzeContinentView keuzeContinentView;

    public keuzeModePresenter(Model model, keuzeModeView keuzeModeView, Stage window) {
        this.model = model;
        this.keuzeModeView = keuzeModeView;
        this.window = window;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers(){

        //EVENTS LABEL HOOFDSTEDEN
        //Fontsize vergroten wanneer muis er op staat
        keuzeModeView.getBtnHoofdsteden().setOnMouseEntered(e->{
            keuzeModeView.getBtnHoofdsteden().setFont(Font.font(20));
        });
        //Fontsize verkleinen naar oorspronkelijke grote wanneer muis er van gaat
        keuzeModeView.getBtnHoofdsteden().setOnMouseExited(e->{
            keuzeModeView.getBtnHoofdsteden().setFont(Font.font(15));
        });
        //Als onclick dan, ga naar scherm om continent te kiezen
        keuzeModeView.getBtnHoofdsteden().setOnMousePressed(e -> {
            //Quiz op true zetten omdat er op quiz gedrukt is
            model.setStrMode("hoofdsteden");
            keuzeContinentView = new keuzeContinentView();
            keuzeContinentPresenter keuzeContinentPresenter = new keuzeContinentPresenter(model, keuzeContinentView, window);
            Scene keuzeContinent = new Scene(keuzeContinentView);
            window.setScene(keuzeContinent);
            window.show();
        });

        //EVENTS LABEL VLAGGEN
        //Fontsize vergroten wanneer muis er op staat
        keuzeModeView.getBtnVlaggen().setOnMouseEntered(e->{
            keuzeModeView.getBtnVlaggen().setFont(Font.font(20));
        });
        //Fontsize verkleinen naar oorspronkelijke grote wanneer muis er van gaat
        keuzeModeView.getBtnVlaggen().setOnMouseExited(e->{
            keuzeModeView.getBtnVlaggen().setFont(Font.font(15));
        });
        //Als onclick dan, ga naar scherm om continent te kiezen
        keuzeModeView.getBtnVlaggen().setOnMousePressed(e -> {
            //Quiz op true zetten omdat er op quiz gedrukt is
            model.setStrMode("vlaggen");
            keuzeContinentView = new keuzeContinentView();
            keuzeContinentPresenter keuzeContinentPresenter = new keuzeContinentPresenter(model, keuzeContinentView, window);
            Scene keuzeContinent = new Scene(keuzeContinentView);
            window.setScene(keuzeContinent);
            window.show();
        });

        //EVENTS LABEL LANDEN
        //Fontsize vergroten wanneer muis er op staat
        keuzeModeView.getBtnLanden().setOnMouseEntered(e->{
            keuzeModeView.getBtnLanden().setFont(Font.font(20));
        });
        //Fontsize verkleinen naar oorspronkelijke grote wanneer muis er van gaat
        keuzeModeView.getBtnLanden().setOnMouseExited(e->{
            keuzeModeView.getBtnLanden().setFont(Font.font(15));
        });
        //Als onclick dan, ga naar scherm om continent te kiezen
        keuzeModeView.getBtnLanden().setOnMousePressed(e -> {
            //Quiz op true zetten omdat er op quiz gedrukt is
            model.setStrMode("landen");
            keuzeContinentView = new keuzeContinentView();
            keuzeContinentPresenter keuzeContinentPresenter = new keuzeContinentPresenter(model, keuzeContinentView, window);
            Scene keuzeContinent = new Scene(keuzeContinentView);
            window.setScene(keuzeContinent);
            window.show();
        });

        //EVENTS LABEL TERUG
        //Fontsize vergroten wanneer muis er op staat
        keuzeModeView.getBtnTerug().setOnMouseEntered(e->{
            keuzeModeView.getBtnTerug().setFont(Font.font(20));
        });
        //Fontsize verkleinen naar oorspronkelijke grote wanneer muis er van gaat
        keuzeModeView.getBtnTerug().setOnMouseExited(e->{
            keuzeModeView.getBtnTerug().setFont(Font.font(15));
        });
        //Als onlick DAN scherm veranderen naar main menu
        keuzeModeView.getBtnTerug().setOnMousePressed(e -> {
            mainMenuView = new mainMenuView();
            mainMenuPresenter mainMenuPresenter = new mainMenuPresenter(model, mainMenuView, window);
            Scene mainMenu = new Scene(mainMenuView);
            window.setScene(mainMenu);
            window.show();
        });
    }
    private void updateView(){
        //fill mainMenuView with data from model
    }
}
