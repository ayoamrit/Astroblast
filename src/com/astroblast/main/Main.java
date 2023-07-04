package com.astroblast.main;

import com.astroblast.panel.GamePanel;

import javax.swing.*;

public class Main {

    public static void main(String[] args){
        //Create a new JFrame window
        JFrame window = new JFrame();

        //Exit window on closed
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set window not to be resizable
        window.setResizable(false);

        //Set title of the window
        window.setTitle("Astroblast");

        //Create a new instance of GamePanel
        GamePanel gamePanel = new GamePanel();

        //Add the GamePanel to the window
        window.add(gamePanel);

        //Resize the window to fit the GamePanel
        window.pack();

        //Center the window on the screen
        window.setLocationRelativeTo(null);

        //Call method from the GamePanel class to execute the thread
        gamePanel.start();

        //Make the window visible
        window.setVisible(true);
    }
}
