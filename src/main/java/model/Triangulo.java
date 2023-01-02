/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author mateu
 */
public class Triangulo extends D2 {

    public ArrayList coordX;
    public ArrayList coordY;
    public Color corSecundaria;

    public Triangulo() {
        coordX = new ArrayList<Integer>();
        coordY = new ArrayList<Integer>();
    }

    @Override
    public float area() {
        int coordXInicial = (int) coordX.get(1);
        int coordXFinal = (int) coordX.get(2);
        int coordYInicial = (int) coordY.get(0);
        int coordYFinal = (int) coordY.get(1);
        return ((coordXInicial - coordXFinal) * (coordYInicial - coordYFinal)) / 2; // (B*H)/2  
    }

    @Override
    public float perimetro() {
        int coordXInicial = (int) coordX.get(1);
        int coordXFinal = (int) coordX.get(2);
        return (float)(coordXInicial - coordXFinal) * 3;
    }

    @Override
    public void desenhar(Graphics g) {
        super.desenhar(g);
        g.setColor(corPrimaria);
        int[] vetX = new int[coordX.size()];
        int[] vetY = new int[coordX.size()];
        for (int i = 0; i < coordX.size(); i++) {
            vetX[i] = (int) coordX.get(i);
            vetY[i] = (int) coordY.get(i);
        }
        g.drawPolygon(vetX, vetY, coordX.size());
        g.setColor(corSecundaria);
        g.fillPolygon(vetX, vetY, coordX.size());
    }
}
