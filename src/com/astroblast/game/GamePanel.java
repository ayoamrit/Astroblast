package com.astroblast.game;
import com.astroblast.constant.Constant;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{

    Constant.Panel panel = new Constant.Panel();
    int screenWidth = panel.screenWidth;
    int screenHeight = panel.screenHeight;

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.setFocusable(true);
    }
    public void startGameThread(){

    }
    public void run(){

    }

    private void update(){

    }

    private void draw(){

    }

    public void paintComponents(Graphics g){
        super.paintComponents(g);
    }

}
