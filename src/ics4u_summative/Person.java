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
public class Person {
    public int x, y;
    private String name;
    private int age;
    private PApplet app;
    private PImage image;
    public Person(PApplet p, int x, int y, String name, int age, String imagePath){
        app = p;
        this.x = x;
        this.y = y;
        this.name = name;
        this.age = age;
        this.image = app.loadImage(imagePath);
    }
    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }
    public void moveTo(int dx, int dy){
        x = dx;
        y = dy;
    }
    public void draw(){
        app.image(image, x, y);
    }
    public boolean isCollidingWith(Person other){
        int centerX = x + (image.pixelWidth / 2);
        int centerY = y + (image.pixelHeight / 2);
        int otherCenterX = other.x + (image.pixelWidth / 2);
        int otherCenterY = other.y + (image.pixelHeight / 2);
        float d = PApplet.dist(otherCenterX, otherCenterY, centerX, centerY);
        return d < 32;
    }
    public boolean isClicked(int mouseX, int mouseY){
        int centerX = x + (image.pixelWidth / 2);
        int centerY = y + (image.pixelHeight / 2);
        float d = PApplet.dist(mouseX, mouseY, centerX, centerY);
        return d < 16;
    }
    public void displayInfo(PApplet p){
        app.fill(0);
        app.text("Name: " + name, x, y - 50);
        app.text("Age: " + age, x, y - 30);
    }
}
