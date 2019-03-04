package keuzeContinent;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;

//Enkel UI code

public class keuzeContinentView extends BorderPane {
    private GridPane gpButtons;
    private Label btnAzie;
    private Label btnEuropa;
    private Label btnAfrika;
    private Label btnNoordAmerika;
    private Label btnZuidAmerika;
    private Label btnOceanie;
    private Label btnTerug;
    private Label lbTitel;
    private Image backgroundImage;

    public keuzeContinentView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        //Alle labels maken met een naam en font 15
        btnAfrika = new Label("Afrika");
        btnAfrika.setFont(Font.font(15));
        btnEuropa = new Label("Europa");
        btnEuropa.setFont(Font.font(15));
        btnAzie = new Label("Azië");
        btnAzie.setFont(Font.font(15));
        btnNoordAmerika = new Label("Noord-Amerika");
        btnNoordAmerika.setFont(Font.font(15));
        btnZuidAmerika = new Label("Zuid-Amerika");
        btnZuidAmerika.setFont(Font.font(15));
        btnOceanie = new Label("Oceanië");
        btnOceanie.setFont(Font.font(15));
        btnTerug = new Label("Terug");
        btnTerug.setFont(Font.font(15));
        //Titel aanmaken met font 30
        lbTitel = new Label("Selecteer de gewenste mode:");
        lbTitel.setFont(Font.font(30));
        //Achtergrond afbeelding selecteren
        backgroundImage = new Image("/background.jpg");

        //Gridpane aanmaken met daarin alle buttons
        gpButtons = new GridPane();
        gpButtons.add(lbTitel,0,0,1,1);
        gpButtons.add(btnAfrika, 0, 3, 1, 1);
        gpButtons.add(btnAzie, 0, 4, 1, 1);
        gpButtons.add(btnEuropa, 0, 5, 1, 1);
        gpButtons.add(btnNoordAmerika, 0, 6, 1, 1);
        gpButtons.add(btnZuidAmerika, 0, 7, 1, 1);
        gpButtons.add(btnOceanie, 0, 8, 1, 1);
        gpButtons.add(btnTerug, 0, 9, 1, 1);
        gpButtons.setHgap(20);
        gpButtons.setVgap(10);
    }

    private void layoutNodes() {
        this.setCenter(gpButtons);
        this.setBackground(new Background(new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,new BackgroundSize(BackgroundSize.AUTO,BackgroundSize.AUTO,false,false,true,false))));
    }

    public Label getBtnAzie() { return btnAzie; }
    public Label getBtnEuropa() { return btnEuropa; }
    public Label getBtnAfrika() { return btnAfrika; }
    public Label getBtnNoordAmerika() { return btnNoordAmerika; }
    public Label getBtnZuidAmerika() { return btnZuidAmerika; }
    public Label getBtnOceanie() { return btnOceanie; }
    public Label getBtnTerug() { return btnTerug; }
}

