package vista;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;

import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Estoy probando que onda esto");
        Group canvasContainer = new Group();
        Canvas canvas= new Canvas(460,200);
        canvasContainer.getChildren().add(canvas);

        Button botonMusica = new Button();
        botonMusica.setText("Musica");
        String musicFile = "sonidos/Inuyashiki_OP.wav";
        Media sound = new Media(new File(musicFile).toURI().toString());
        MusicEventHandler botonMusicaHandler = new MusicEventHandler(sound);
        botonMusica.setOnAction(botonMusicaHandler);

        HBox contenedorHorizontal = new HBox(botonMusica);
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
