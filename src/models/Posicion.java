package models;

public class Posicion {
    private float x;
    private float y;
    
    public Posicion(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public Posicion(){
        this(0,0);
    }
    
    public float getX(){
        return x;
    }
    
    public float getY(){
        return y;
    }
}
