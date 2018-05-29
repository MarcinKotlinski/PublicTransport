package pl.mesayah.publictransport;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import pl.mesayah.publictransport.board.Board;

public class PublicTransport extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    public void start(Stage stage) throws Exception {

        stage.setTitle("Public Transport");

        Board board = new Board(800, 800);

        stage.setHeight(board.getHeight());
        stage.setWidth(board.getWidth());

        Scene scene = new Scene(board.getGraphics(), board.getWidth(), board.getHeight(), Color.WHITE);

        stage.setScene(scene);
        stage.show();

        StopInitializer stopInitializer = new StopInitializer();

        board.spawn(stopInitializer.getStops());
    }
}
