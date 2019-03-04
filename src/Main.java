import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.Window;
import model.Model;
import mainMenu.mainMenuPresenter;
import mainMenu.mainMenuView;

public class Main extends Application {
    public Stage window = new Stage();
    @Override
    public void start(Stage primaryStage){
        this.window = primaryStage;
        Model model = new Model();
        mainMenuView view = new mainMenuView();
        mainMenuPresenter mainMenuPresenter = new mainMenuPresenter(model, view, window);
        Scene mainMenu = new Scene(view);

        window.setScene(mainMenu);
        window.setTitle("Landen Quiz");
        window.setWidth(545);
        window.setHeight(360);
        window.getIcons().add(new Image("/globe.png"));

        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
