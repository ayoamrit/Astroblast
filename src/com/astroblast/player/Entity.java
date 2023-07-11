package com.astroblast.player;

import java.awt.image.BufferedImage;

public class Entity {

    //Position of the player on x-axis
    int playerX;

    //Right boundary
    int maxPlayerX;

    //left boundary
    int minPlayerX;

    //Position of the player on y-axis
    int playerY;

    //Bottom boundary
    int maxPlayerY;

    //Top boundary
    int minPlayerY;

    //Speed of the player
    int playerSpeed;

    //Position of the fireball on x-axis
    static int fireballX;

    //Position of the fireball on y-axis
    static int fireballY;

    //Speed of the fireball
    int fireballSpeed;

    //Fireball collision
    boolean fireballCollision = true;

    static boolean fireballFlag;

    //Images of the player
    public BufferedImage playerImage1, playerImage2, playerImage3, playerImage4, playerImage5, fireballImage;

    //Number of the player image
    int playerImageNumber;

}
