package com.astroblast.player;

import com.astroblast.panel.ScreenProperties;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class Fireball extends Entity{
    ScreenProperties screenProperties;

    //Constructor for Fireball class with screenProperties parameter
    public Fireball(ScreenProperties screenProperties){
        this.screenProperties = screenProperties;
        setDefault();
        getFireballImage();
    }

    //Constructor for Fireball class with initial player's position
    public Fireball(int x, int y){
        fireballX = x;
        fireballY = y;
    }

    //Set default value
    private void setDefault(){
        fireballSpeed = 8;
    }

    //Load the fireball image from resource
    private void getFireballImage(){
        try{
            fireballImage = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/shoot/fireball.png")));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //Update the fireball's position
    public void update(){
        if(fireballY > -50){
            //Move fireball up by its speed
            fireballY = fireballY - fireballSpeed;
        }
        else{
            //Reset the fireballFlag when the fireball goes off-screen
            fireballFlag = false;
        }
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(fireballImage, fireballX, fireballY, screenProperties.tileSize, screenProperties.tileSize, null);
    }
}
