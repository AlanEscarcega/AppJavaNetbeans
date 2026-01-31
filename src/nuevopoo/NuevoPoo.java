package nuevopoo;

import models.Borde;
import processing.core.PApplet;

public class NuevoPoo extends PApplet {
    
    Borde borde;
    
    public static void main(String[] args) {
        PApplet.main("nuevopoo.NuevoPoo");
    }

    @Override
    public void settings() {
        //Definir tamano de ventana
        size(Config.ANCHO, Config.ALTO);
    }

    @Override
    public void setup() {
        // Configuración inicial
        background(Config.COLOR_FONDO);
        borde = new Borde(6, 0);
    }

    @Override
    public void draw() {
        //borde.ancho = 6;
        //borde.setAncho(100);
        //borde.color = 0;
        //borde.setColor(0);
        // colores pueden ser texto, rgb, escala de grises
        // texto: "green"
        // rgb (100,100,100)
        // escala de grises: 0 -255 (0 negro, 255 blanco)

        // color del borde
        stroke(borde.getColor());
        // ancho del borde
        strokeWeight(borde.getAncho());
        // color de relleno
        fill(150);

        // dibuja un rectángulo
        rect(0, 0, 100, 100);
    }
}
