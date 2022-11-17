/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Graphics;

/**
 *
 * @author mateus
 */
public class d1 extends ponto{
    public int x1;
    public int y1;
    ponto p1;
    
    @Override
    public void desenhar(Graphics g){
       g.setColor(corPrimaria);
       g.drawLine(x, y, x1, y1);
    }
    
}
