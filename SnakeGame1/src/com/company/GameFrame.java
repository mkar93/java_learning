package com.company;

import javax.swing.*;
import java.awt.*;


public class GameFrame extends JFrame {

    GameFrame(){

        GamePanel panel = new GamePanel();

        this.add(panel, BorderLayout.CENTER);
        this.setTitle("Snake game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);


    }
}
