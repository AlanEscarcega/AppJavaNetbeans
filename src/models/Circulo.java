package models;

import processing.core.PApplet;

public class Circulo {

    private Posicion posicion;
    private Dimension dimension;
    private Borde borde;
    private int color;

    public Circulo(){
        this.posicion = new Posicion();
        this.dimension = new Dimension();
        this.borde = new Borde();
        this.color = 150;
    }

    public Posicion getPosicion(){ return posicion; }
    public Dimension getDimension(){ return dimension; }
    public Borde getBorde(){ return borde; }
    public int getColor(){ return color; }

    public void setPosicion(Posicion p){ this.posicion = p; }
    public void setDimension(Dimension d){ this.dimension = d; }
    public void setBorde(Borde b){ this.borde = b; }
    public void setColor(int c){ this.color = c; }

    public void dibujar(PApplet p){
        p.fill(this.color); // fill primero para que el color de relleno funcione
        p.stroke(borde.getColor());
        p.strokeWeight(borde.getAncho());
        float x = posicion.getX();
        float y = posicion.getY();
        float w = dimension.getHorizontal();
        float h = dimension.getVertical();
        p.ellipse(x, y, w, h);
    }
}
