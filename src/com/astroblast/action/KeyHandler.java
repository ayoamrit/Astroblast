package com.astroblast.action;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    //Boolean variables to track key press state
    public boolean upPressed, downPressed, leftPressed, rightPressed;
    @Override
    public void keyTyped(KeyEvent e) {
        //This method is not used in the implementation
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //Get the key code of the pressed key
        int keyCode = e.getKeyCode();

        //Set the corresponding boolean variable to true
        if(keyCode == KeyEvent.VK_W){
            upPressed = true;
        }

        if(keyCode == KeyEvent.VK_S){
            downPressed = true;
        }

        if(keyCode == KeyEvent.VK_A){
            leftPressed = true;
        }

        if(keyCode == KeyEvent.VK_D){
            rightPressed = true;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        //Get the key code of the released key
        int keyCode = e.getKeyCode();

        //Set the corresponding boolean variable to false
        if(keyCode == KeyEvent.VK_W){
            upPressed = false;
        }

        if(keyCode == KeyEvent.VK_S){
            downPressed = false;
        }

        if(keyCode == KeyEvent.VK_A){
            leftPressed = false;
        }

        if(keyCode == KeyEvent.VK_D){
            rightPressed = false;
        }
    }
}
