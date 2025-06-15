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
public class Character {
    public BasicData characterData;
    private String name;
    private static final String DEFAULTNAME = "Name";
    private int age;
    private static final int DEFAULTAGE = 0;
    /**
     * Constructor Method for class Character
     * @param p the PApplet
     * @param x the x coord for the starting location for the character
     * @param y the y coord for the starting location for the character
     * @param name the name of the character
     * @param age the age of the character
     * @param imagePath the image path to the image of the character
     */
    public Character(PApplet p, int x, int y, String name, int age, String imagePath){
        characterData = new BasicData(x, y, imagePath, p);
        this.name = name;
        this.age = age;
    }
    /**
     * A default version of the constructor
     * @param p the PApplet
     * @param imagePath the image path to the image of the character
     */
    public Character(PApplet p, String imagePath){
        this(p, 0, 0, DEFAULTNAME, DEFAULTAGE, imagePath);
    }
    //Getter and setter methods for the variables
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
    //Draw method for the characters
    public void draw(){
        characterData.app.image(characterData.getImage(), characterData.x, characterData.y);
    }
    //Move method for the characters
    public void move(int dx, int dy){
        characterData.x += dx;
        characterData.y += dy;
    }
}
