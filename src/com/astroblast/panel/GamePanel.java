package com.astroblast.panel;

import com.astroblast.action.KeyHandler;
import com.astroblast.background.Background;
import com.astroblast.player.Fireball;
import com.astroblast.player.Player;

import javax.swing.*;
import java.awt.*;
public class GamePanel extends JPanel implements Runnable{

    ScreenProperties screenProperties = new ScreenProperties();
    KeyHandler keyHandler = new KeyHandler();
    Player player = new Player(this, keyHandler, screenProperties);
    Fireball fireball = new Fireball(screenProperties);
    Background background = new Background(screenProperties);
    Thread thread = null;

    public GamePanel(){
        //Set the preferred size of the panel
        this.setPreferredSize(new Dimension(screenProperties.screenWidth, screenProperties.screenHeight));
        //Add the key handler to the panel
        this.addKeyListener(keyHandler);
        //Enable double buffering for smoother rendering
        this.setDoubleBuffered(true);
        //Set the panel to be focusable to receive keyboard inputs
        this.setFocusable(true);
    }

    public void start(){
        //Create a new thread and start the game loop
        thread = new Thread(this);
        thread.start();
    }

    public void run(){
        double drawInterval = (double) 1000000000 /screenProperties.FPS;  //0.0166 seconds
        double nextDrawTime = System.nanoTime();

        while(thread != null){

            //UPDATE: update information such as character positions
            update();
            //DRAW: draw the screen with the updated information
            repaint();


            try{
                //Calculating remaining time until next draw
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime / 1000000;  //Converting nano time to milliseconds

                //Sleep the thread to achieve the desired frame rate
                Thread.sleep((long) remainingTime);
                nextDrawTime += drawInterval;
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public void update(){
        //Update the player's information
        player.update();

        fireball.update();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        background.draw(g2d);
        fireball.draw(g2d);
        //Draw the player on the panel
        player.draw(g2d);

    }

}
