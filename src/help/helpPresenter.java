package help;

import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import mainMenu.mainMenuPresenter;
import mainMenu.mainMenuView;
import model.Model;
import help.helpView;


public class helpPresenter {
    private Stage window;
    private Model model;
    private mainMenuView mainMenuView;
    private helpView helpView;

    public helpPresenter(Model model, helpView helpView, Stage window) {
        this.model = model;
        this.helpView = helpView;
        this.window = window;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers(){
        //EVENTS LABEL TERUG
        //Fontsize vergroten wanneer muis er op staat
        helpView.getBtnTerug().setOnMouseEntered(e->{
            helpView.getBtnTerug().setFont(Font.font(20));
        });
        //Fontsize verkleinen naar oorspronkelijke grote wanneer muis er van gaat
        helpView.getBtnTerug().setOnMouseExited(e->{
            helpView.getBtnTerug().setFont(Font.font(15));
        });
        //Als onlick DAN scherm veranderen naar main menu
        helpView.getBtnTerug().setOnMousePressed(e -> {
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
