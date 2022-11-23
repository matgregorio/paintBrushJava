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
public class Circulo extends D2{
    public Color corInterna;
    public float raio;
    public float diametro;
    @Override
    public void desenhar(Graphics g){
        g.setColor(corPrimaria);
        g.drawOval(x, y, x, y);
        g.setColor(corInterna);
        g.fillOval(x, y, x, y);
    }

    @Override
    public float area() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
