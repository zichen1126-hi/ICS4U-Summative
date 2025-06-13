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
    private Character person1;
    private Background field;
    private Background meet;
    private Background currBackground;
    private boolean showInfo;
    private String userInput = "";
    private int stage = 1;
    public void settings(){
        field = new Background(this, "images/background1.png");
        meet = new Background(this, "images/background2.png");
        currBackground = field;
        size(currBackground.width,currBackground.height);
    }
    public void setup(){
        background(100);
        textSize(20);
        person1 = new Character(this, 750, 800, "Mr Loo", 99, "images/Cowherd.png");
    }
    public void draw(){
        background(100);
        if (keyPressed){
            switch (keyCode) {
                case LEFT:
                    person1.move(-5, 0);
                    break;
                case RIGHT:
                    person1.move(5, 0);
                    break;
                default:
                    break;
            }
        }
        if (person1.x < 10 && currBackground == field){
            currBackground = meet;
            surface.setSize(currBackground.width,currBackground.height);
            person1.x = 600;
            person1.y = 600;
        }
        if (person1.x <= 400 && currBackground == meet){
            person1.x = 400;
        }
        if (person1.x <= 300 && currBackground == meet){
            fill(0);
            text("I love you", 300, 600);
        }
        currBackground.draw();
        person1.draw();
    }
}
