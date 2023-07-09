package com.astroblast.player;

import java.awt.image.BufferedImage;

public class Entity {

    //Position of the player on x-axis
    int playerX;

    //Position of the player on y-axis
    int playerY;

    //Speed of the player
    int playerSpeed;

    //Position of the fireball on x-axis
    static int fireballX;

    //Position of the fireball on y-axis
    static int fireballY;

    //Speed of the fireball
    int fireballSpeed;

    static boolean shootedFireball;

    //Images of the player
    public BufferedImage playerImage1, playerImage2, playerImage3, playerImage4, playerImage5, fireballImage;

    //Number of the player image
    int playerImageNumber;

}
