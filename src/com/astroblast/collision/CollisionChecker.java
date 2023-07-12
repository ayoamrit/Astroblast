package com.astroblast.collision;

public class CollisionChecker {
    public static int playerX;
    public static int playerY;

    public static int asteroidX;
    public static int asteroidY;

    public void setPlayer(int playerX, int playerY){
        this.playerX = playerX;
        this.playerY = playerY;
    }

    public void setAsteroid(int asteroidX, int asteroidY){
        this.asteroidX = asteroidX;
        this.asteroidY = asteroidY;
    }

    public boolean checkCollision(){
        if(asteroidX == playerX && asteroidY == playerY){
            return true;
        }
        else if(playerX > asteroidX && playerX < asteroidX + 48 && playerY == asteroidY){
            return true;
        }
        else if((playerX + 48) > asteroidX && (playerX + 48) < (asteroidX + 48) && playerY == asteroidY){
            return true;
        }
        else{
            return false;
        }
    }
}
