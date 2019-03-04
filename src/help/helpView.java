package help;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

//Enkel UI code

    public class helpView extends BorderPane {

        //
        private GridPane gpButtons;
        private Label lbTitel;
        private Label lbHulpTekst;
        private Label btnTerug;
        private Image backgroundImage;


        public helpView() {
            initialiseNodes();
            layoutNodes();
        }

        private void initialiseNodes() {
            lbTitel = new Label("Help");
            lbTitel.setFont(Font.font(30));
            lbHulpTekst = new Label("Een landmassa die te klein is om een continent te worden genoemd, is een eiland. \n" +
                    "Over het algemeen wordt Groenland beschouwd als het grootste eiland en Australië (vier keer zo groot) \n" +
                    "als het kleinste continent. Deze keus is tamelijk arbitrair. \n" +
                    "Een kleine landmassa die via een relatief kleine landengte met een andere landmassa verbonden is, is een schiereiland.\n");
            lbHulpTekst.setFont(Font.font(10));
            btnTerug = new Label("Terug");

            //Achtergrond afbeelding selecteren
            backgroundImage = new Image("/background.jpg");

            //Gridpane aanmaken met daarin alle buttons
            gpButtons = new GridPane();
            gpButtons.add(lbTitel,0,0,1,1);
            gpButtons.add(lbHulpTekst,0,1,1,1);
            gpButtons.add(btnTerug, 0, 5, 1, 1);
            gpButtons.setHgap(20);
            gpButtons.setVgap(10);
        }

        private void layoutNodes() {
            this.setCenter(this.gpButtons);
            this.setBackground(new Background(new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,new BackgroundSize(BackgroundSize.AUTO,BackgroundSize.AUTO,false,false,true,false))));
        }

        public Label getBtnTerug() {
            return btnTerug;
        }
}

