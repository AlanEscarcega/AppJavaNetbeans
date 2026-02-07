package nuevopoo;

import processing.core.PApplet;
import models.Caja;
import models.Circulo;
import java.util.ArrayList;

public class NuevoPoo extends PApplet {

    ArrayList<Caja> cajas = new ArrayList<>();
    ArrayList<Circulo> circulos = new ArrayList<>();
    String tipoFigura = "caja";
    int colorActual = color(255,0,0);

    public static void main(String[] args) {
        PApplet.main("nuevopoo.NuevoPoo");
    }

    @Override
    public void settings() {
        size(600, 600);
    }

    @Override
    public void draw() {
        background(255);
        for(Caja c : cajas) c.dibujar(this);
        for(Circulo cir : circulos) cir.dibujar(this);
    }

    @Override
    public void mousePressed() {
        if(tipoFigura.equals("caja")) {
            Caja c = new Caja();
            c.getPosicion().setX(mouseX);
            c.getPosicion().setY(mouseY);
            c.getDimension().setHorizontal(80);
            c.getDimension().setVertical(80);
            c.setColor(colorActual);
            cajas.add(c);
        } else {
            Circulo cir = new Circulo();
            cir.getPosicion().setX(mouseX);
            cir.getPosicion().setY(mouseY);
            cir.getDimension().setHorizontal(80);
            cir.getDimension().setVertical(80);
            cir.setColor(colorActual);
            circulos.add(cir);
        }
    }

    @Override
    public void keyPressed() {
        if(key == 'a' || key == 'A') tipoFigura = "caja";
        if(key == 'b' || key == 'B') tipoFigura = "circulo";
        if(key == '1') colorActual = color(255,0,0);
        if(key == '2') colorActual = color(0,0,255);
        if(key == '3') colorActual = color(0,255,0);
    }
}
