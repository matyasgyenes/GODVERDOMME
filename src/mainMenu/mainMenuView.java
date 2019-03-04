package mainMenu;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;

//Enkel UI code

public class mainMenuView extends BorderPane {
    private GridPane gpButtons;
    private Label btnQuiz;
    private Label btnOefenen;
    private Label btnHelp;
    private Label btnSluiten;
    private Label lbTitel;
    private Image backgroundImage;

    public mainMenuView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        btnQuiz = new Label("Quiz");
        btnQuiz.setFont(Font.font(15));
        btnOefenen = new Label("Oefenen");
        btnOefenen.setFont(Font.font(15));
        btnHelp = new Label("Help");
        btnHelp.setFont(Font.font(15));
        btnSluiten = new Label("Sluiten");
        btnSluiten.setFont(Font.font(15));
        lbTitel = new Label("Landen Quiz");
        lbTitel.setFont(Font.font(60));
        backgroundImage = new Image("/background.jpg");

        gpButtons = new GridPane();
        gpButtons.add(lbTitel,2,0,1,1);
        gpButtons.add(btnQuiz, 2, 5, 1, 1);
        gpButtons.add(btnOefenen, 2, 6, 1, 1);
        gpButtons.add(btnHelp, 2, 7, 1, 1);
        gpButtons.add(btnSluiten, 2, 8, 1, 1);
        gpButtons.setHgap(0);
        gpButtons.setVgap(0);

    }

    private void layoutNodes() {
        this.setCenter(gpButtons);
        this.setBackground(new Background(new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,new BackgroundSize(BackgroundSize.AUTO,BackgroundSize.AUTO,false,false,true,false))));

    }

    public GridPane getGpButtons() {
        return gpButtons;
    }

    public Label getBtnQuiz() {
        return btnQuiz;
    }

    public Label getBtnOefenen() {
        return btnOefenen;
    }

    public Label getBtnHelp() {
        return btnHelp;
    }

    public Label getBtnSluiten() {
        return btnSluiten;
    }
}

