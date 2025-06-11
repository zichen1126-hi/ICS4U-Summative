/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics4u_summative;

import processing.core.PApplet;
import processing.core.PImage;

/**
 *
 * @author ziche
 */
public class Background {
    public int x, y;
    public int height, width;
    private PApplet app;
    private PImage image;
    private String place;
    private static final String DEFAULTPLACE = "Place";
    public Background(PApplet app, String imagePath, String place){
        this.x = 0;
        this.y = 0;
        this.app = app;
        this.image = app.loadImage(imagePath);
        this.place = place;
        this.height = image.pixelHeight;
        this.width = image.pixelWidth;
    }
    public Background(PApplet app, String imagePath){
        this(app, imagePath, DEFAULTPLACE);
    }
    public String getPlace(){
        return place;
    }
    public void setPlace(String place){
        this.place = place;
    }
    public void draw(){
        app.image(image, x, y);
    }
}
