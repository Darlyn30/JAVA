/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author darlyn
 */
public class GamePanel extends JPanel implements ActionListener{
    
    static final int SCREEN_WIDTH = 500;
    static final int SCREEN_HEIGHT = 500;
    static final int UNI_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT)/ UNI_SIZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6;
    int applesEaten;
    int AppleX;
    int AppleY;
    char direction = 'D';
    boolean running = false;
    Timer timer;
    Random random;
    
    GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }
    
    public void startGame(){
        newApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    
    public void draw(Graphics g){
        for(int i = 0; i < SCREEN_HEIGHT/UNI_SIZE; i++){
            g.drawLine(i*UNI_SIZE, 0, i*UNI_SIZE, SCREEN_HEIGHT);
            g.drawLine(0, i*UNI_SIZE, SCREEN_WIDTH, i*UNI_SIZE);
        }
        g.setColor(Color.RED);
        g.fillOval(AppleX, AppleY, UNI_SIZE, UNI_SIZE);
        
        for(int i = 0; i < bodyParts; i++){
            if(i == 0){
                g.setColor(Color.GREEN);
                g.fillRect(x[i], y[i], UNI_SIZE, UNI_SIZE);
            } else {
                g.setColor(new Color(45,180,0));
                g.fillRect(x[i], y[i], UNI_SIZE, UNI_SIZE);
            }
        }
    }
    
    public void newApple(){
        AppleX = random.nextInt((int)(SCREEN_WIDTH/UNI_SIZE)) * UNI_SIZE;
        AppleY = random.nextInt((int)(SCREEN_HEIGHT/UNI_SIZE)) * UNI_SIZE;
    }
    
    public void move(){
        for(int i = bodyParts; i > 0; i--){
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        
        switch(direction){
            case 'W':
                y[0] = y[0] - UNI_SIZE;
                break;
            case 'A':
                x[0] = x[0] - UNI_SIZE;
                break;
            case 'S':
                y[0] = y[0] + UNI_SIZE;
                break;
            case 'D':
                y[0] = y[0] + UNI_SIZE;
                break;
        }
    }
    
    public void checkApple(){
        
    }
    public void checkColission(){
        // check if head collides with body
        for(int i = bodyParts; i > 0; i--){
            if((x[0] == x[i]) && (y[0] == y[i])){
                running = false;
            }
        }
        // check if head touches left border
        if(x[0] < 0){
            running = false;
        }
        if(x[0] > SCREEN_WIDTH){
            running = false;
        }
        //check if head touch top border
        if(y[0] < 0){
            running = false;
        }
        
        if(y[0] > SCREEN_HEIGHT){
            running = false;
        }
        
        if(running){
            timer.stop();
        }
    }
    
    public void gameOver(){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        if(running){
            move();
            checkApple();
            checkColission();
        }
        repaint();
    }
    
        public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            switch(e.getKeyCode()){
                case KeyEvent.VK_LEFT:
                    if(direction != 'D'){
                        direction = 'A';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if(direction != 'A'){
                        direction = 'D';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if(direction != 'S'){
                        direction = 'W';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if(direction != 'W'){
                        direction = 'S';
                    }
                    break;
                    
            }
        }
    }
    
}
