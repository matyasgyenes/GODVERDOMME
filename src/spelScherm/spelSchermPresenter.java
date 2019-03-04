package spelScherm;

import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import mainMenu.mainMenuPresenter;
import mainMenu.mainMenuView;
import model.Model;


public class spelSchermPresenter {
    private spelSchermView spelSchermView;
    private Stage window;
    private Model model;
    private mainMenuView mainMenuView;

    public spelSchermPresenter(Model model, spelSchermView spelSchermView, Stage window) {
        this.model = model;
        this.spelSchermView = spelSchermView;
        this.window = window;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers(){
        //Events
    }
    private void updateView(){
        //fill mainMenuView with data from model

        //Keuze tussen quiz en oefenen
        if (model.isBlnQuiz()){
            spelSchermPresenter.this.spelSchermView.getLbTitel().setText("QUIZ -> ");
        }
        else {
            spelSchermPresenter.this.spelSchermView.getLbTitel().setText("OEF -> ");
        }

        //Keuze tussen mode
        if(model.getStrMode()=="landen"){
            spelSchermPresenter.this.spelSchermView.getLbTitel().setText(spelSchermView.getLbTitel().getText() + "LANDEN -> ");
        }
        else if(model.getStrMode()=="vlaggen"){
            spelSchermPresenter.this.spelSchermView.getLbTitel().setText(spelSchermView.getLbTitel().getText() + "VLAGGEN -> ");
        }
        else if(model.getStrMode()=="hoofdsteden"){
            spelSchermPresenter.this.spelSchermView.getLbTitel().setText(spelSchermView.getLbTitel().getText() + "HOOFDSTEDEN -> ");
        }

        //Keuze tussen continent
        if(model.getStrContinent()=="afrika"){
            spelSchermPresenter.this.spelSchermView.getLbTitel().setText(spelSchermView.getLbTitel().getText() + "AF");
        }
        else if(model.getStrContinent()=="europa"){
            spelSchermPresenter.this.spelSchermView.getLbTitel().setText(spelSchermView.getLbTitel().getText() + "EU");
        }
        else if(model.getStrContinent()=="oceanie"){
            spelSchermPresenter.this.spelSchermView.getLbTitel().setText(spelSchermView.getLbTitel().getText() + "OC");
        }
        else if(model.getStrContinent()=="noordamerika"){
            spelSchermPresenter.this.spelSchermView.getLbTitel().setText(spelSchermView.getLbTitel().getText() + "N-A");
        }
        else if(model.getStrContinent()=="zuidamerika"){
            spelSchermPresenter.this.spelSchermView.getLbTitel().setText(spelSchermView.getLbTitel().getText() + "Z-A");
        }
        else if(model.getStrContinent()=="azie"){
            spelSchermPresenter.this.spelSchermView.getLbTitel().setText(spelSchermView.getLbTitel().getText() + "AZ");
        }

    }
}
