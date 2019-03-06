package spelScherm;

import javafx.scene.paint.Color;
import javafx.stage.Stage;
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
        spelSchermView.getBtnAntwoord().setOnAction(e -> {
            if(model.getStrContinent().equals("afrika")){
                model.setBlVervangTest(model.hoofdstadTest(spelSchermView.getTfAntwoord().getText(),model.getStrLandenEnHooftstedenAf()));
            }
            else if(model.getStrContinent().equals("europa")){
                model.setBlVervangTest(model.hoofdstadTest(spelSchermView.getTfAntwoord().getText(),model.getStrLandenEnHooftstedenEu()));
            }
            if (model.isBlVervangTest()){
                //Label JuistOfFout zijn zichtbaarheid aan zetten, op JUIST zetten en als tekstkleur groen
                spelSchermView.getLbJuistOfFout().setText("DE VORIGE VRAAG HAD JE JUIST");
                spelSchermView.getLbJuistOfFout().setTextFill(Color.GREEN);

                //Opniew een nieuwe hoofdstad zoeken, de tekst uit het tekstvak verwijderen en een nieuwe vraag stellen.
                spelSchermView.getTfAntwoord().setText("");
                spelSchermView.getLbHoofdstad().setText("Van welk land is " + model.getRandStrHoofdstad() + " de hoofdstad?");
            }
            else{
                //Label JuistOfFout zijn zichtbaarheid aan zetten, op FOUT zetten en als tekstkleur ROOD
                spelSchermView.getLbJuistOfFout().setText("DE VORIGE VRAAG HAD JE FOUT");
                spelSchermView.getLbJuistOfFout().setTextFill(Color.RED);

                //Opniew een nieuwe hoofdstad zoeken, de tekst uit het tekstvak verwijderen en een nieuwe vraag stellen.
                spelSchermView.getTfAntwoord().setText("");
                spelSchermView.getLbHoofdstad().setText("Van welk land is " + model.getRandStrHoofdstad() + " de hoofdstad?");
            }
        });
    }
    private void updateView(){
        //fill mainMenuView with data from model

        //Keuze tussen quiz en oefenen
        if (model.isBlnQuiz()){
            spelSchermPresenter.this.spelSchermView.getLbTitel().setText("QUIZ -> " + model.getStrMode() + " -> " + model.getStrContinent());
        }
        else {
            spelSchermPresenter.this.spelSchermView.getLbTitel().setText("OEF -> "+ model.getStrMode() + " -> " + model.getStrContinent());
        }
        if(model.getStrMode().equals("hoofdsteden")){
            spelSchermView.getLbHoofdstad().setVisible(true);
            spelSchermView.getLbJuistOfFout().setVisible(true);
            spelSchermView.getLbHoofdstad().setText("Van welk land is " + model.getRandStrHoofdstad() + " de hoofdstad?");
        }
    }
}
