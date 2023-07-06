package com.astroblast.player;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class Fireball extends Entity{

    public Fireball(){
        setDefault();
        getFireballImage();
    }

    private void setDefault(){
        fireballSpeed = 5;
        getFireballImage();
    }

    private void getFireballImage(){
        try{
            fireballImage = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/shoot/fireball.png")));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
