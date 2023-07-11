package com.astroblast.asteroid;

import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

public class AsteroidManager {
    int randomNumber;
    Random randomNumberGenerator = new Random();
    LinkedList<Asteroid> asteroidList = new LinkedList<>();
    Asteroid asteroid;
    int number;

    public AsteroidManager(){
        addAsteroid(new Asteroid(100));
    }

    public void generateRandomNumber(){
        this.randomNumber = randomNumberGenerator.nextInt(0,768);
    }

    public void update(){
        for(int x = 0; x < asteroidList.size(); x++){
            asteroid = asteroidList.get(x);
            asteroid.update();
        }
        number++;
        if(number == 20){
            generateRandomNumber();
            addAsteroid(new Asteroid(this.randomNumber));
            number = 0;
        }
    }

    public void draw(Graphics2D g2d){
        for(int x = 0; x < asteroidList.size(); x++){
            asteroid = asteroidList.get(x);
            asteroid.draw(g2d);
        }
    }

    public void addAsteroid(Asteroid asteroid){
        asteroidList.add(asteroid);
    }
}
