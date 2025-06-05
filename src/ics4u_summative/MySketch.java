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
public class MySketch extends PApplet{
    private Person person1;
    private boolean showInfo;
    private String userInput = "";
    private int stage = 1;
    public void settings(){
        size(400,400);
    }
    public void setup(){
        background(100,100,100);
        textSize(20);
        person1 = new Person(this, 100, 200, "Mr Loo", 99, "images/person.png");
    }
    public void draw(){
        background(100);
        person1.draw();
        if (showInfo){
            person1.displayInfo(this);
        } else {
            
        }
    }
    public void mousePressed(){
        if (person1.isClicked(mouseX, mouseY))
            showInfo = !showInfo;
        else {
            showInfo = false;
        }
    }
}
