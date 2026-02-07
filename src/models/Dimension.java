package models;

public class Dimension {
    private int vertical;
    private int horizontal;
    
    public Dimension(){
        this(80,80);
    }
    
    public Dimension(int w, int h){
        this.horizontal = w;
        this.vertical = h;
    }
    
    public int getVertical(){
        return vertical;
    }
    
    public int getHorizontal(){
        return horizontal;
    }

    public void setHorizontal(int h){
        this.horizontal = h;
    }

    public void setVertical(int v){
        this.vertical = v;
    }
}

