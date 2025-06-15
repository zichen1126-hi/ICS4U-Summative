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
    public BasicData backgroundData;
    public int height, width;
    private String place;
    private static final String DEFAULTPLACE = "Place";
    /**
     * Constructor Method for class Background
     * @param app the PApplet
     * @param imagePath the path of the background's image
     * @param place what place the background is supposed to represent
     */
    public Background(PApplet app, String imagePath, String place){
        backgroundData = new BasicData(0, 0, imagePath, app);
        this.place = place;
        this.height = backgroundData.getImage().pixelHeight;
        this.width = backgroundData.getImage().pixelWidth;
    }
    /**
     * A default version of the constructor
     * @param app the PApplet
     * @param imagePath the path of the background's image
     */
    public Background(PApplet app, String imagePath){
        this(app, imagePath, DEFAULTPLACE);
    }
    //Getter and setter methods for the place variable
    public String getPlace(){
        return place;
    }
    public void setPlace(String place){
        this.place = place;
    }
    //Draw method for the background
    public void draw(){
        backgroundData.app.image(backgroundData.getImage(), backgroundData.x, backgroundData.y);
    }
}
