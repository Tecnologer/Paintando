
package paint;

import java.awt.Color;
import java.awt.Graphics;

public class area_grafica extends javax.swing.JPanel {
    //atributos 
      private int x0,x1,y0,y1,aux;
      //variable para administrar el color de la linea
      Color color;

       @Override
    public void paint(Graphics g) {
        super.paint(g);
              // algoritmo dda linea 
               g.setColor(color.red);
                          int dx = x1 - x0;
                          int dy = y1 - y0;

                          if (Math.abs(dx) > Math.abs(dy))
                          {         
                          float m = (float) dy / (float) dx;
                          float b = y0 - m * x0;
                          if(dx<0){
                          dx =  -1;}
                          else
                          {dx =  1;}
                         while (x0 != x1)
                            {
                        x0 += dx;
                          y0 = Math.round(m*x0 + b);
                         g.drawLine( x0, y0, x0, y0);
                         }
                         } else
                         if (dy != 0)
                         {                              
                        float m = (float) dx / (float) dy;      
                       float b = x0 - m*y0;
                          if(dy<0)
                          {dy =  -1;}
                          else
                          {dy =  1;}
                         while (y0 != y1)
                         {
                         y0 += dy;
                           x0 = Math.round(m * y0 + b);
                          g.drawLine( x0, y0, x0, y0);
                         }
                         }
                         //mostrar calculos e funciones en el area_grafica
                         g.drawString(Distancialinea(), 50, 50);
                         g.drawString(mediolinea(), 50, 60);
    }
     
     public String Distancialinea()
      {
      double distancia = Math.sqrt(Math.pow((x1- x0),2) + (Math.pow((y1- y0), 2)));
      String cad= "Distancia entre los dos puntos: " +(distancia);
      return cad;
    }
   public String mediolinea()
      {
      double x2 = ((x1+ x0)/2);
      double y2=((y1+ y0)/2);
      String cad= "Punto medio: X: " + (x2)+" Y: " + (y2);
      return cad;
    }
      
    public area_grafica() {
           this.aux=1;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
         if (aux==2){
                                 x1=evt.getX();y1=evt.getY();
                                 aux=0;
                                 repaint();}
                     if (aux==1){
                                    x0=evt.getX();y0=evt.getY();
                                 }
                     aux++;
    }//GEN-LAST:event_formMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
