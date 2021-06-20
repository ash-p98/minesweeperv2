package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Stack;

public class Main extends Application {
    Stage window;
    Scene scene1, scene2;
    public static int rows = 8;
    public static int cols = 8;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        int windowWidth = 800;
        int windowHeight = 800;
        int singleTile = 80;
        int xAxisTiles = windowWidth / singleTile;
        int yAxisTiles = windowHeight / singleTile;

        Label label1 = new Label("Welcome to Minesweeper");
        Button button1 = new Button("Play Minesweeper");
        button1.setOnAction(e -> window.setScene(scene2));

        StackPane layout1 = new StackPane();
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 600,200);

        Button button2 = new Button("demo to play minesweeper");
        button2.setOnAction(e -> window.setScene(scene1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, windowWidth, windowHeight);

        window.setScene(scene1);
        window.setTitle("Minesweeeper");
        window.show();
    }

    public static class Tile extends StackPane {
        int x;
        int y;
        boolean hasBomb;

        private Rectangle border = new Rectangle();
        private Text text = new Text();
        public Tile(int x, int y, boolean hasBomb){

            border.setStroke(Color.LIGHTBLUE);
            text.setText(hasBomb ? "*" : "");


        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}