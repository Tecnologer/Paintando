package paint;

import java.awt.Color;

public class figuras 
{
    
    int xi;
    int xf;
    int yi;
    int yf;
    int tipo;
    Color color;
    Color color1;
    boolean fill;
    int tipoB;

    public figuras(int xi, int yi, int xf, int yf, int tipo, Color color,Color color1,boolean fill,int tipoB) {
        this.xi = xi;
        this.xf = xf;
        this.yi = yi;
        this.yf = yf;
        this.tipo = tipo;
        this.color = color;
        this.fill=fill;
        this.tipoB=tipoB;
        this.color1=color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor1() {
        return color1;
    }

    
    public int getTipoB() {
        return tipoB;
    }

    public void setTipoB(int tipoB) {
        this.tipoB = tipoB;
    }
    
    
    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }   

    public int getXf() {
        return xf;
    }

    public int getXi() {
        return xi;
    }

    public int getYf() {
        return yf;
    }

    public int getYi() {
        return yi;
    }

    public void setXf(int xf) {
        this.xf = xf;
    }

    public void setXi(int xi) {
        this.xi = xi;
    }

    public void setYf(int yf) {
        this.yf = yf;
    }

    public void setYi(int yi) {
        this.yi = yi;
    }       
}
