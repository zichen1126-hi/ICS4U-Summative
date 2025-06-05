/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics4u_summative;
import processing.core.PApplet;
/**
 *
 * @author student
 */
public class Car {
    private int x;
    private int y;
    private PApplet app;
    public Car(int x, int y, PApplet app){
        this.x = x;
        this.y = y;
        this.app = app;
    }
    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }
    public void draw(){
        app.size(400,400);
        app.rect(120, 80, 220, 220);
    }
}
