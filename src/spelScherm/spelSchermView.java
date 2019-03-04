package spelScherm;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import sun.font.FontFamily;

import javax.swing.text.StyledEditorKit;

//Enkel UI code

public class spelSchermView extends BorderPane {

    //
    private GridPane gpButtons;
    private Label lbTitel;
    private Label lbOpgave;
    private TextField tfAntwoord;
    private Image backgroundImage;


    public spelSchermView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        //TITEL
        lbTitel = new Label("Test: Test: Test");
        lbTitel.setFont(Font.font("Verdana",FontWeight.BOLD,50));

        //LabelOpgave
        lbOpgave = new Label("Geef de naam van het land in: ");
        lbOpgave.setFont(Font.font("Verdana", FontWeight.BOLD, 25));

        //Tekstveld
        tfAntwoord = new TextField();
        tfAntwoord.setMinSize(70,25);

        //Achtergrond afbeelding selecteren
        backgroundImage = new Image("/achtergrond2.png");

        //Gridpane aanmaken met daarin alle buttons
        gpButtons = new GridPane();
        gpButtons.add(lbTitel,1,1,1,1);
        gpButtons.add(lbOpgave, 1,2,1,1);
        gpButtons.add(tfAntwoord,1,3,1,1);
        gpButtons.setHgap(20);
        gpButtons.setVgap(20);
    }

    private void layoutNodes() {
        this.setCenter(gpButtons);
        this.setBackground(new Background(new BackgroundImage(backgroundImage, BackgroundRepeat.REPEAT,BackgroundRepeat.REPEAT,BackgroundPosition.CENTER,new BackgroundSize(BackgroundSize.AUTO,BackgroundSize.AUTO,false,false,true,false))));
    }

    public Label getLbTitel() {
        return lbTitel;
    }
}

