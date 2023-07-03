package com.astroblast;
import com.astroblast.game.GamePanel;

import javax.swing.*;

public class Main {

    private final static JFrame window = new JFrame();
    public static void main(String[] args){
        GamePanel gamePanel = new GamePanel();
        configWindow(gamePanel);
    }

    private static void configWindow(GamePanel gamePanel){
        window.setLocationRelativeTo(null);
        window.setTitle("Astroblast");
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.add(gamePanel);
        window.pack();

        gamePanel.startGameThread();

        window.setVisible(true);
    }
}
