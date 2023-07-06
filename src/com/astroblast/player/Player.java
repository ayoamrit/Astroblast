package com.astroblast.player;

import com.astroblast.action.KeyHandler;
import com.astroblast.panel.GamePanel;
import com.astroblast.panel.ScreenProperties;
import org.jetbrains.annotations.NotNull;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Player extends Entity{

    //Reference to the GamePanel, KeyHandler and ScreenProperties objects
    GamePanel gamePanel;
    KeyHandler keyHandler;
    ScreenProperties screenProperties;

    //Constructor for Player class
    public Player(GamePanel gamePanel, KeyHandler keyHandler, ScreenProperties screenProperties){
        this.gamePanel = gamePanel;
        this.keyHandler = keyHandler;
        this.screenProperties = screenProperties;

        //Set the default values for the player position and speed
        setDefaultValues();

        //Load player images
        getPlayerImage();
    }

    public void getPlayerImage(){
        try{
            //Load player images from resources
            playerImage1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/rocket1.png")));
            playerImage2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/rocket2.png")));
            playerImage3 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/rocket3.png")));
            playerImage4 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/rocket4.png")));
            playerImage5 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/rocket5.png")));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //Set default values for player position and speed
    public void setDefaultValues(){
        //Set the initial player position
        playerX = 100;
        playerY = 100;

        //Set the player speed
        playerSpeed = 4;

        //Set the initial player image number
        playerImageNumber = 1;
    }

    //Update the player position based on the key inputs
    public void update(){
        if(keyHandler.upPressed){
            playerY = playerY - playerSpeed;
        }

        if(keyHandler.downPressed){
            playerY = playerY + playerSpeed;
        }

        if(keyHandler.leftPressed){
            playerX = playerX - playerSpeed;
        }

        if(keyHandler.rightPressed){
            playerX = playerX + playerSpeed;
        }
    }

    //Draw the player on the screen
    public void draw(@NotNull Graphics2D g2d){

        BufferedImage image = null;

        if(playerImageNumber == 1) {
            //Player Image 1
            image = playerImage1;
            playerImageNumber++;
        }
        else if(playerImageNumber == 2){
            //Player Image 2
            image = playerImage2;
            playerImageNumber++;
        }
        else if(playerImageNumber == 3){
            //Player Image 3
            image = playerImage3;
            playerImageNumber++;
        }
        else if(playerImageNumber == 4){
            //Player Image 4
            image = playerImage4;
            playerImageNumber++;
        }
        else{
            //Player Image 5
            image = playerImage5;

            //Reset to player image 1
            playerImageNumber = 1;
        }

        //Draw image of the player
        g2d.drawImage(image, playerX, playerY, screenProperties.tileSize, screenProperties.tileSize, null);

        g2d.dispose();
    }
}
