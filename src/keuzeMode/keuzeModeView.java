package keuzeMode;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;

//Enkel UI code

public class keuzeModeView extends BorderPane {
    private GridPane gpButtons;
    private Label btnVlaggen;
    private Label btnHoofdsteden;
    private Label btnLanden;
    private Label btnTerug;
    private Label lbTitel;
    private Image backgroundImage;

    public keuzeModeView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        btnVlaggen = new Label("Vlaggen");
        btnVlaggen.setFont(Font.font(15));
        btnHoofdsteden = new Label("Hoofdsteden");
        btnHoofdsteden.setFont(Font.font(15));
        btnLanden = new Label("Landen");
        btnLanden.setFont(Font.font(15));
        btnTerug = new Label("Terug");
        btnTerug.setFont(Font.font(15));
        lbTitel = new Label("Selecteer de gewenste mode:");
        lbTitel.setFont(Font.font(30));
        backgroundImage = new Image("/background.jpg");

        gpButtons = new GridPane();
        gpButtons.add(lbTitel,0,0,1,1);
        gpButtons.add(btnHoofdsteden, 0, 3, 1, 1);
        gpButtons.add(btnVlaggen, 0, 4, 1, 1);
        gpButtons.add(btnLanden, 0, 5, 1, 1);
        gpButtons.add(btnTerug, 0, 6, 1, 1);
        gpButtons.setHgap(20);
        gpButtons.setVgap(10);
    }

    private void layoutNodes() {
        this.setCenter(gpButtons);
        this.setBackground(new Background(new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,new BackgroundSize(BackgroundSize.AUTO,BackgroundSize.AUTO,false,false,true,false))));
    }

    public Label getBtnVlaggen() { return btnVlaggen; }

    public Label getBtnHoofdsteden() { return btnHoofdsteden; }

    public Label getBtnLanden() { return btnLanden; }

    public Label getBtnTerug() { return btnTerug; }

}

