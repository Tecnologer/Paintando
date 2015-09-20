package paint;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class dibujos 
{
    static Graphics g= interfaz.panelP.getGraphics();

    public static void lineaDDA(int xi,int yi, int xf, int yf, Color color)
    {
        
        g.setColor(color);
        int temp;
        float x,y,m;
        //calcular la pendiente
        m=(float)(yf-yi)/(xf-xi);
        //b=yi-m*xi;
        if((Math.abs(yf-yi)>Math.abs(xf-xi))&&(yf<yi)||(Math.abs(xf-xi)>Math.abs(yf-yi)&&(xf<xi)))
        {           temp=xf;
                    xf=xi;
                    xi=temp;
                    temp=yf;
                    yf=yi;
                    yi=temp;                                                        
        }

        //ciclo para dibujar la linea punto por punto
        if(Math.abs(xf-xi)>Math.abs(yf-yi))
        {
                y=yi;
            for(x=xi;x<=xf;x++)
            {
                        y=y+m;
                        g.drawLine(xi, yi, xf, yf);
            }
        }
        else
        {
            x=xi;
            for(y=yi;y<=yf;y++)
            {
                        x=x+1/m;
                        g.drawLine(xi, yi, xf, yf);
            }
        }
    }
    
    
    public static void Bresenham(int xi, int yi, int xf, int yf, Color c)
    { 
            g.setColor(c);
            int x, y, dx, dy, p, incE, incNE, stepx, stepy;
            dx = (xf - xi);
            dy = (yf - yi);
            /* determinar que punto usar para empezar, cual para terminar */
            if (dy < 0) { 
                dy = -dy; stepy = -1; 
            } 
            else
                stepy = 1;
            if (dx < 0) {  
                dx = -dx; stepx = -1; 
            } 
            else 
                stepx = 1;
            x = xi;
            y = yi;
            g.drawLine( xi, yi, xi, yi);
            /* se cicla hasta llegar al extremo de la línea */
            if(dx>dy){
                p = 2*dy - dx;
                incE = 2*dy;
                incNE = 2*(dy-dx);
                while (x != xf){
                x = x + stepx;
                if (p < 0){
                    p = p + incE;
                }
                else {
                    y = y + stepy;
                    p = p + incNE;
                }
                g.drawLine( x, y, x, y);
                }
            }
            else{
                p = 2*dx - dy;
                incE = 2*dx;
                incNE = 2*(dx-dy);
                while (y != yf){
                y = y + stepy;
                if (p < 0){
                    p = p + incE;
                }
                else {
                    x = x + stepx;
                    p = p + incNE;
                }
                g.drawLine( x, y, x, y);
                }
            }
        }
    public static void triangulo(int xi,int yi, int xf, int yf, Color color,boolean relleno)
    {
        int distancia;
        int mediox;
        mediox = (xf-xi)/2;
        distancia = Math.abs(xf-xi);

        if(!relleno)
        {
            //TRIANGULO SIN RELLENO
            Bresenham(xi+mediox,yi,xi,yf,color);
            Bresenham(xi+mediox,yi,xf,yf,color);
            Bresenham(xi,yf,xf,yf,color);
        }
        else
        {
            //TRIANGULO CON RELLENO
            for(int x = xi; x< distancia; x++)
                Bresenham(xi+mediox,yi,xi+x,yf,color); 
        }
    }
    
    public static void cuadrado(int xi,int yi, int xf, int yf, Color color,Color c1,boolean relleno)
    {
        int dx;
        int dy;
        int distancia;
        //SACAR DISTANCIAS
                dx = xf-xi;
                dy = yf-yi;
                if(Math.abs(dx)>Math.abs(dy))
                    distancia = Math.abs(dx);
                else
                    distancia = Math.abs(dy);
                //CONDICIONES PARA LOS 4 CUADRANTES (CASOS)
               /* if(dx>=0 && dy<0)
                    yi = yi-distancia;
                else if(dx<0 && dy>=0)
                    xi = xi-distancia;
                else if(dx<0 && dy<0)
                {
                    xi = xi-distancia;
                    yi = yi-distancia;
                }*/
                    
                if(!relleno)
                {
                    //CUADRADO SIN RELLENO
                    lineaDDA(xi,yi,xf,yi,color);
                    lineaDDA(xi,yi,xi,yf,color);
                    lineaDDA(xf,yi,xf,yf,color);
                    lineaDDA(xi,yf,xf,yf,color);
                }
                else
                {
                    fillPatrones(xi, yi, xf, yf,color,c1);
                }
    }
    
    public static void CirculoBresenham(int xi,int yi, int r,Color color){
        int x = -r;
        int y = 0;
        int err = 2-2*r;
        
        do{
            Bresenham(xi-x,yi+y,xi-x,yi+y,color);
            Bresenham(xi-y,yi-x,xi-y,yi-x,color);
            Bresenham(xi+x,yi-y,xi+x,yi-y,color);
            Bresenham(xi+y,yi+x,xi+y,yi+x,color);
            r = err;
            if(r>x){err += ++x*2+1;}
            if(r<=x){err += ++y*2+1;}
        }while(x<0);
    }
    
    public static void putPixel(int xi,int yi, Color c)
    {
        g.setColor(c);
        g.drawLine(xi, yi, xi, yi);
    }
    
    public static void clean( Color c)
    {
        g.setColor(c);
        g.fillRect(0, 0, interfaz.panelP.getWidth(), interfaz.panelP.getHeight());
    }
    
    public static void borrador(int xi,int yi,Color c,int tipo)
    {
        g.setColor(c);
        if(tipo==2)
            g.fillRect(xi, yi, 10, 10);
        else if(tipo==1)
            g.fillOval(xi, yi, 10, 10);
    }
    
    public static void fillPatrones(int xi,int yi, int xf,int yf,Color c1,Color c2)
    {
        int temp;
        if(xi>xf)
        {
            temp=xi;
            xi=xf;
            xf=temp;
        }
        if(yi>yf)
        {
            temp=yi;
            yi=yf;
            yf=temp;
        }
        
        Rectangle2D rec3 = new Rectangle2D.Float(xi, yi, xf-xi, yf-xi);
        Graphics2D g2D = (Graphics2D) g;
        BufferedImage bi = new BufferedImage(5, 5, BufferedImage.TYPE_4BYTE_ABGR);
        Graphics2D big = bi.createGraphics();
        big.setColor(c1);
        big.fillRect(0, 0, 5, 5);
        big.setColor(c2);
        big.drawLine(0, 0, 5, 5);
        Rectangle r = new Rectangle(0, 0, 5, 5);
        TexturePaint tp = new TexturePaint(bi, r);
        g2D.setPaint(tp);
        g2D.fill(rec3);
    }
}
