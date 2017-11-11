package modelo;

import org.junit.Assert;
import org.junit.Test;

public class TableroTest {

    @Test
    public void tableroSeCreaDeManeraCorrecta() {
        Tablero tablero = new Tablero();
        Assert.assertNotNull(tablero);
    }

}