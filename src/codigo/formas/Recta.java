/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 *
 * @author Javi, Alba, Edu
 */
public class Recta extends Line2D.Double {

    public Color color = Color.BLACK;

    public Recta(int _posX1, int _posY1, int _posX2, int _posY2, Color _color) {
        super();
        x1 = _posX1;
        y1 = _posY1;
        x2 = _posX2;
        y2 = _posY2;
        color = _color;
    }

    //Dibuja una recta entre los dos puntos que se reciben, la x e y donde se clicka con el raton
    //y la x e y donde se suelta el click
    public void Trazate(Graphics2D g2, int _posX2, int _posY2, String grosor) {
        x2 = _posX2;
        y2 = _posY2;
        g2.setColor(color);
        g2.setStroke(new BasicStroke(java.lang.Float.parseFloat(grosor)));
        g2.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
    }

}
