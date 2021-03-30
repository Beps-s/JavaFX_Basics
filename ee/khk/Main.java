package ee.khk;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        System.out.println("Launching Application");
        Application.launch(args);
    }
    @Override
    public void init() throws Exception {
        System.out.println("Application inits");
        super.init();
    }

    @Override
    public void start(Stage stage) {
        System.out.println("Application starts");
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Application stops");
        super.stop();
    }
}
