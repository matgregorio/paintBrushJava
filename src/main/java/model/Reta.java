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
public class Reta extends D2{
    public int x1, y1;
    
    @Override
    public float area() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float perimetro() {
        return x - x1;
    }
    
    @Override
    public void desenhar(Graphics g){
       super.desenhar(g);
       g.setColor(corPrimaria);
       g.fillRect(x, x1, y, y1);
    }
    
    
}
