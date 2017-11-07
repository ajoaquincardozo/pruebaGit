package vista;

import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MusicEventHandler implements EventHandler<ActionEvent>{
    private MediaPlayer reproductor;
    private Boolean pausado;

    public MusicEventHandler(Media sound){
        this.reproductor = new MediaPlayer(sound);
        this.pausado = true;
    }
    public boolean estaPausado(){
        return this.pausado == true;
    }
    @Override
    public void handle(ActionEvent event){
        if ( this.estaPausado() ) {
            this.reproductor.play();
            this.pausado = false;
        } else {
            this.reproductor.pause();
            this.pausado = true;
        }
    }
}
