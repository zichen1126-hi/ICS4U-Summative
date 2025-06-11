/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics4u_summative;
import processing.core.PApplet;
import processing.core.PImage;
/**
 *
 * @author student
 */
public class Character {
    public int x, y;
    private PApplet app;
    private PImage image;
    private String name;
    private final String DEFAULTNAME = "Name";
    private int age;
    private final int DEFAULTAGE = 0;
    public Character(PApplet p, int x, int y, String name, int age, String imagePath){
        this.app = p;
        this.x = x;
        this.y = y;
        this.name = name;
        this.age = age;
        this.image = app.loadImage(imagePath);
    }
    public Character(PApplet p){
        this.app = p;
        this.x = 0;
        this.y = 0;
        this.name = DEFAULTNAME;
        this.age = DEFAULTAGE;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void draw(){
        app.image(image, x, y);
    }
    public boolean isCollidingWith(Character other){
        int centerX = x + (image.pixelWidth / 2);
        int centerY = y + (image.pixelHeight / 2);
        int otherCenterX = other.x + (image.pixelWidth / 2);
        int otherCenterY = other.y + (image.pixelHeight / 2);
        float d = PApplet.dist(otherCenterX, otherCenterY, centerX, centerY);
        return d < 32;
    }
    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }
}
