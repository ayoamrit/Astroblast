package com.astroblast.background;

import com.astroblast.panel.ScreenProperties;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Background {
    BufferedImage backgroundImage;
    ScreenProperties screenProperties;

    public Background(ScreenProperties screenProperties){
        this.screenProperties = screenProperties;
        setBackgroundImage();
    }

    private void setBackgroundImage(){
        try{
            backgroundImage = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/background/background.png")));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(backgroundImage, 0,0,screenProperties.screenWidth, screenProperties.screenHeight, null);
    }
}
