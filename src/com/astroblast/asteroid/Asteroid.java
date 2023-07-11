package com.astroblast.asteroid;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Asteroid {
    private BufferedImage asteroidImage;
    private int randomNumber;
    public int asteroidY;

    public Asteroid(int randomNumber){
        this.randomNumber = randomNumber;
        this.asteroidY = 0;
        setAsteroidImage();
    }

    private void setAsteroidImage(){
        try{
            asteroidImage = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/asteroid/asteroid.png")));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void update(){
        asteroidY = asteroidY + 4;
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(asteroidImage, randomNumber,asteroidY , 48, 48, null);
    }
}
