package com.astroblast.player;

import com.astroblast.action.KeyHandler;
import com.astroblast.panel.GamePanel;
import com.astroblast.panel.ScreenProperties;
import org.jetbrains.annotations.NotNull;

import javax.imageio.ImageIO;
import java.awt.*;
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

        if(playerImageNumber == 1) {
            //Draw the player image 1
            g2d.drawImage(playerImage1, playerX, playerY, screenProperties.tileSize, screenProperties.tileSize, null);
            playerImageNumber++;
        }
        else if(playerImageNumber == 2){
            //Draw the player image 2
            g2d.drawImage(playerImage2, playerX, playerY, screenProperties.tileSize, screenProperties.tileSize, null);
            playerImageNumber++;
        }
        else if(playerImageNumber == 3){
            //Draw the player image 3
            g2d.drawImage(playerImage3, playerX, playerY, screenProperties.tileSize, screenProperties.tileSize, null);
            playerImageNumber++;
        }
        else if(playerImageNumber == 4){
            //Draw the player image 4
            g2d.drawImage(playerImage4, playerX, playerY, screenProperties.tileSize, screenProperties.tileSize, null);
            playerImageNumber++;
        }
        else{
            //Draw the player image 5 and reset to image 1
            g2d.drawImage(playerImage5, playerX, playerY, screenProperties.tileSize, screenProperties.tileSize, null);
            playerImageNumber = 1;
        }

        g2d.dispose();
    }
}
