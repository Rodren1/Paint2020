/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author xp
 */
public class Rectangulo extends Polygon {

    public Color color = null;
    public int x = 0;
    public int y = 0;
    public boolean relleno = false;

    public Rectangulo(int posX, int posY, Color _color, boolean _relleno) {
        x = posX;
        y = posY;
        relleno = _relleno;
        color = _color;
    }

    public void dibujate(Graphics2D g2, int posX, int posY, String grosor) {
        g2.setColor(color);
        g2.drawLine(x, posY, x, y);
        g2.drawLine(posX, y, x, y);
        g2.drawLine(posX, posY, posX, y);
        g2.drawLine(posX, posY, x, posY);
        g2.setStroke(new BasicStroke(Float.parseFloat(grosor)));
        if (relleno) {
               
            for (int x1 = x < posX ? x : posX; x1 < (x < posX ? posX : x); x1++) {
                for (int y1 = y < posY ? y : posY; y1 < (y < posY ? posY : y); y1++) {
                    g2.drawLine(x1, y1, x1, y1);
                }
            }
        } else {
            g2.draw(this);
        }
    }
}
