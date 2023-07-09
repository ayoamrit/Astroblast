package com.astroblast.player;

import com.astroblast.panel.GamePanel;
import com.astroblast.panel.ScreenProperties;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class Fireball extends Entity{
    ScreenProperties screenProperties;

    public Fireball(ScreenProperties screenProperties){
        this.screenProperties = screenProperties;
        setDefault();
        getFireballImage();
    }

    public Fireball(int x, int y){
        fireballX = x;
        fireballY = y;
    }

    private void setDefault(){
        fireballSpeed = 8;
    }

    private void getFireballImage(){
        try{
            fireballImage = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/shoot/fireball.png")));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void update(){
        if(fireballY > -50){
            fireballY = fireballY - fireballSpeed;
        }
        else{
            shootedFireball = false;
        }
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(fireballImage, fireballX, fireballY, screenProperties.tileSize, screenProperties.tileSize, null);
    }
}
