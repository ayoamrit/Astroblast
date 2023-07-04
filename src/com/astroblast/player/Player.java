package com.astroblast.player;

import com.astroblast.action.KeyHandler;
import com.astroblast.panel.GamePanel;
import com.astroblast.panel.ScreenProperties;

import javax.swing.*;
import java.awt.*;

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
    }

    //Set default values for player position and speed
    public void setDefaultValues(){
        playerX = 100;
        playerY = 100;
        playerSpeed = 4;
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
    public void draw(Graphics2D g2d){
        g2d.fillRect(playerX, playerY, screenProperties.tileSize , screenProperties.tileSize);
        g2d.dispose();
    }
}
