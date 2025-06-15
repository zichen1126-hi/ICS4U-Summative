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
public class BasicData {
    public int x, y;
    public PApplet app;
    private String imagePath;
    private PImage image;
    /**
     * Constructor Method for class BasicData
     * @param x x position of object
     * @param y x position of object
     * @param imagePath Path to image
     * @param app the app
     */
    public BasicData(int x, int y, String imagePath, PApplet app){
        this.x = x;
        this.y = y;
        this.imagePath = imagePath;
        this.image = app.loadImage(imagePath);
        this.app = app;
    }
    //Getter methods
    public String getImagePath(){
        return imagePath;
    }
    public PImage getImage(){
        return image;
    }
    //Method to change the image
    public void changeImage(String imagePath){
        this.imagePath = imagePath;
        this.image = app.loadImage(imagePath);
    }
}
