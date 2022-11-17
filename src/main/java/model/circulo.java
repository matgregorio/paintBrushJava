/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author mateus
 */
public class circulo extends d1{
    d1 dimensao1;
    public Color corInterna;
    
    public void desenhar(Graphics g){
        g.setColor(corPrimaria);
        g.drawOval(x, y, x1, y1);
        g.setColor(corInterna);
        g.fillOval(x, y, x1, y1);
    }
    
}
