package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;

public class Main extends Application {

    GraphicsContext gc;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Estoy probando que onda esto");
        Group canvasContainer = new Group();
        Canvas canvas= new Canvas(460,200);
        gc = canvas.getGraphicsContext2D();
        canvasContainer.getChildren().add(canvas);

        Button botonNothing = new Button();
        botonNothing.setText("Clickeame pero no haga nada");

        HBox contenedorHorizontal = new HBox(botonNothing);
        VBox contenedorPrincipal = new VBox(contenedorHorizontal,canvasContainer);

        contenedorPrincipal.setSpacing(10);
        contenedorPrincipal.setPadding(new Insets(20));

        primaryStage.setScene(new Scene(contenedorPrincipal,500,300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
