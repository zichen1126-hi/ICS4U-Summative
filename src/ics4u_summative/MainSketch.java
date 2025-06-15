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
public class MainSketch extends PApplet{
    private Character person1, person2;
    private boolean hideCowherd = false;
    private boolean hideWeaverGirl = true;
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
        person1 = new Character(this, 750, 800, "Cowherd", 30, "images/Cowherd.png");
        person2 = new Character(this, 750, 800, "Weaver Girl", 30, "images/Cowherd.png");
        
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
        //if the character reaches the left edge of the screen
        if (person1.characterData.x < 10 && currBackground == field){
            currBackground = meet;
            surface.setSize(currBackground.width,currBackground.height);
            person1.characterData.x = 600;
            person1.characterData.y = 600;
        }
        //if the character reaches x = 400 and the background is meet
        if (person1.characterData.x <= 400 && currBackground == meet){
            person1.characterData.x = 400;
        }
        currBackground.draw();
        if (currBackground == meet){
            fill(0);
            text("I love you, will you marry me?", 300, 600);
        }
        if (!hideCowherd)
            person1.draw();
        if (!hideWeaverGirl)
            person2.draw();
    }
}
