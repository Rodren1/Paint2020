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
 * @author Javi, Alba, Edu
 */
public class Goma extends Polygon {

    public Color color = Color.WHITE;
    public int x = 0;
    public int y = 0;

    public Goma(int posX, int posY, Color _color) {
        x = posX;
        y = posY;
    }

    public void dibujate(Graphics2D g2, int posX, int posY, String grosorGoma) {
        g2.setColor(color);
        g2.setStroke(new BasicStroke(Float.parseFloat(grosorGoma)));
        g2.drawLine(posX, posY, x, y);
        x = posX;
        y = posY;
    }
}
