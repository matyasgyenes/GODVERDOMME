package mainMenu;

import help.helpPresenter;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import keuzeContinent.keuzeContinentView;
import keuzeMode.*;
import keuzeContinent.*;
import model.Model;
import help.*;
import spelScherm.*;



public class mainMenuPresenter {
    private Stage window;
    private Model model;
    private mainMenuView mainMenuView;
    private helpView helpView;
    private keuzeModeView keuzeModeView;
    private keuzeContinentView keuzeContinentView;
    private spelSchermView spelSchermView;

    public mainMenuPresenter(Model model, mainMenuView mainMenuView, Stage window) {
        this.model = model;
        this.mainMenuView = mainMenuView;
        this.window = window;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers(){

        //btnQuiz
        mainMenuView.getBtnQuiz().setOnMouseEntered(e->{
            mainMenuView.getBtnQuiz().setFont(Font.font(20));
        });
        mainMenuView.getBtnQuiz().setOnMouseExited(e->{
            mainMenuView.getBtnQuiz().setFont(Font.font(15));
        });
        mainMenuView.getBtnQuiz().setOnMousePressed(e -> {
            //Quiz op true zetten omdat er op quiz gedrukt is
            model.setBlnQuiz(true);
            keuzeModeView = new keuzeModeView();
            keuzeModePresenter keuzeModePresenter = new keuzeModePresenter(model, keuzeModeView,window);
            Scene keuzeView = new Scene(keuzeModeView);
            window.setScene(keuzeView);
            window.show();
        });

        //btnOefenen
        mainMenuView.getBtnOefenen().setOnMouseEntered(e->{
            mainMenuView.getBtnOefenen().setFont(Font.font(20));
        });
        mainMenuView.getBtnOefenen().setOnMouseExited(e->{
            mainMenuView.getBtnOefenen().setFont(Font.font(15));
        });
        mainMenuView.getBtnOefenen().setOnMousePressed(e -> {
            //Quiz op false zetten omdat er op Oefenen gedrukt is
            model.setBlnQuiz(false);
            keuzeModeView = new keuzeModeView();
            keuzeModePresenter keuzeModePresenter = new keuzeModePresenter(model, keuzeModeView,window);
            Scene keuzeMode = new Scene(keuzeModeView);
            window.setScene(keuzeMode);
            window.show();
        });

        //btnHelp
        mainMenuView.getBtnHelp().setOnMouseEntered(e->{
            mainMenuView.getBtnHelp().setFont(Font.font(20));
        });
        mainMenuView.getBtnHelp().setOnMouseExited(e->{
            mainMenuView.getBtnHelp().setFont(Font.font(15));
        });
        mainMenuView.getBtnHelp().setOnMousePressed(e -> {
            helpView = new helpView();
            helpPresenter helpPresenter = new helpPresenter(model, helpView, window);
            Scene help = new Scene(helpView);
            window.setScene(help);
            window.show();
        });

        //btnSluiten
        mainMenuView.getBtnSluiten().setOnMouseEntered(e->{
            mainMenuView.getBtnSluiten().setFont(Font.font(20));
        });
        mainMenuView.getBtnSluiten().setOnMouseExited(e->{
            mainMenuView.getBtnSluiten().setFont(Font.font(15));
        });
        mainMenuView.getBtnSluiten().setOnMousePressed(e ->{
            window.close();
        });

    }
    private void updateView(){
        //fill mainMenuView with data from model
    }
}
