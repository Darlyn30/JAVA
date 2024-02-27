
package com.mycompany.snake;

import java.awt.Color;
import java.util.Random;
import javax.swing.JFrame;


public class GameFrame extends JFrame{
    private int objeto;
    
    private boolean running= false;
    Random random;
    public GameFrame(){
        this.setSize(500, 500);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Snake Game");
        
        loadImages();
        initgame();
    }
    
    public void loadImages(){
        
    }
    
    public void initgame(){
        objeto = 3;
        for(int i = 0; i < objeto; i++){
            
        }
    }
}
