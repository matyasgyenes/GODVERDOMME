package spelScherm;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    private Label lbVraag;
    private Label lbJuistOfFout;
    private TextField tfAntwoord;
    private Label lbHoofdstad;
    private Button btnAntwoord;
    private Image backgroundImage;
    private Image kaartImage;
    private ImageView kaartImageView;


    public spelSchermView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        //TITEL
        lbTitel = new Label("Test: Test: Test");
        lbTitel.setFont(Font.font("Verdana",FontWeight.BOLD,50));

        //LabelOpgave
        lbVraag = new Label("Geef de naam van het land in: ");
        lbVraag.setFont(Font.font("Verdana", FontWeight.BOLD, 25));

        //Tekstveld
        tfAntwoord = new TextField();
        tfAntwoord.setMinSize(50,25);

        //Antwoord knop
        btnAntwoord = new Button("Antwoord");

        //Label Hoofdstad
        lbHoofdstad = new Label();
        lbHoofdstad.setFont(Font.font(25));
        lbHoofdstad.setVisible(false);

        //Label JuistOfFout
        lbJuistOfFout = new Label();
        lbJuistOfFout.setFont(Font.font(25));
        lbJuistOfFout.setVisible(false);

        //Achtergrond afbeelding selecteren
        backgroundImage = new Image("/achtergrond2.png");

        //Kaart image
        kaartImage = new Image("/Maps Afrika/Senegal.png");
        kaartImageView = new ImageView();
        kaartImageView.setFitWidth(380);
        kaartImageView.setFitHeight(400);
        kaartImageView.setImage(kaartImage);

        //Gridpane aanmaken met daarin alle buttons
        gpButtons = new GridPane();
        gpButtons.add(lbTitel,1,1,1,1);
        gpButtons.add(lbVraag, 1,2,1,1);
        gpButtons.add(tfAntwoord,1,3,1,1);
        gpButtons.add(btnAntwoord,2,3,1,1);
        gpButtons.add(lbHoofdstad,1,4,1,1);
        gpButtons.add(lbJuistOfFout,1,5,1,1);
        gpButtons.add(kaartImageView,1,6,1,1);
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

    public Label getLbHoofdstad() {
        return lbHoofdstad;
    }

    public Button getBtnAntwoord() {
        return btnAntwoord;
    }

    public TextField getTfAntwoord() {
        return tfAntwoord;
    }

    public Label getLbJuistOfFout() { return lbJuistOfFout; }
}

