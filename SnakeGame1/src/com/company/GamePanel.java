package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class GamePanel extends JPanel implements ActionListener {

    int SCREEN_WIDTH = 800;
    int SCREEN_HEIGHT = 800;
    int UNIT_SIZE_MOD = 10;
    int UNIT_SIZE = 40;
    int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT)/UNIT_SIZE;
    int[] x = new int[GAME_UNITS];
    int[] y = new int[GAME_UNITS];

    int delay = 110;
    int difficulty = 2;
    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    int appleTestX;
    int appleTestY;
    int modApple = 10;
    int modSnake = 2;
    char direction = 'R';
    boolean running = false;


    Timer timer;
    Random random;

    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH+UNIT_SIZE, SCREEN_HEIGHT+UNIT_SIZE*2));
        this.setBackground(new Color(25,25,25));
        this.setBounds(UNIT_SIZE,UNIT_SIZE,SCREEN_WIDTH+UNIT_SIZE,SCREEN_HEIGHT+UNIT_SIZE);
        this.setLayout(new BorderLayout());
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());


        //add(topPanel);

        startGame();
    }

    public void startGame(){
        running = true;
        timer = new Timer(delay,this);
        timer.start();
        newApple();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){

        if(running){
            for(int i=0;i<=SCREEN_HEIGHT/UNIT_SIZE;i++){
                g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT+UNIT_SIZE);
                g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH+UNIT_SIZE, i*UNIT_SIZE);
            }
            g.setColor(new Color(200,145,75));
            g.fillOval(appleX+modApple, appleY+modApple, UNIT_SIZE-(modApple*2), UNIT_SIZE-(modApple*2));

            for(int i=0;i<bodyParts;i++){
                if(i == 0) {                                    //head
                    g.setColor(new Color(35,50,0));
                    g.fillOval(x[i]+modSnake, y[i]+modSnake, UNIT_SIZE-(modSnake*2),UNIT_SIZE-(modSnake*2));
                }
                else if(i == 1) {                               //neck
                    g.setColor(new Color(35,100,25));
                    g.fillRoundRect(x[i]+modSnake, y[i]+modSnake, UNIT_SIZE-(modSnake*2), UNIT_SIZE-(modSnake*2),25,25);
                }
                else if(i == bodyParts-1) {                     //tail
                    g.setColor(new Color(50,60,0));
                    g.fillRoundRect(x[i]+modSnake, y[i]+modSnake, UNIT_SIZE-(modSnake*2), UNIT_SIZE-(modSnake*2),25,25);
                }
                else{                                           //body
                    g.setColor(new Color(40,120,50));
                    g.fillRoundRect(x[i]+modSnake, y[i]+modSnake, UNIT_SIZE-(modSnake*2), UNIT_SIZE-(modSnake*2),25,25);
                }
            }
            g.setColor(new Color(170,170,10));
            g.setFont(new Font("Segue UI", Font.BOLD, 30));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score:   "+applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score: "+applesEaten)), g.getFont().getSize());
        }
        else gameOver(g);
    }

    public void newApple(){
        appleTestX = random.nextInt(SCREEN_WIDTH/UNIT_SIZE)*UNIT_SIZE;
        appleTestY = random.nextInt(SCREEN_HEIGHT/UNIT_SIZE)*UNIT_SIZE;

        for (int i = 0; i < bodyParts; i++) {
            if (appleTestX == x[i] && appleTestY == y[i]){              //checks if newApple collides with snake body
                newApple();
                break;
            }
            if (i == bodyParts - 1) {
                appleX = appleTestX;
                appleY = appleTestY;
            }
        }
    }

    public void move(){
        for(int i=bodyParts; i>0; i--){
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        switch(direction){
            case 'U':
                y[0] = y[0] - UNIT_SIZE;
                if(y[0] < 0)                //top border
                    y[0] = SCREEN_HEIGHT;
                break;
            case 'D':
                y[0] = y[0] + UNIT_SIZE;
                if(y[0] > SCREEN_HEIGHT)    //bottom border
                    y[0] = 0;
                break;
            case 'L':
                x[0] = x[0] - UNIT_SIZE;
                if(x[0] < 0)                //left border
                    x[0] = SCREEN_WIDTH;
                break;
            case 'R':
                x[0] = x[0] + UNIT_SIZE;
                if(x[0] > SCREEN_WIDTH)     //right border
                    x[0] = 0;
                break;
        }
    }

    public void checkApple(){
        if((x[0] == appleX) && (y[0] == appleY)){
            bodyParts++;
            applesEaten++;
            this.delay-=difficulty;
            if(this.delay >= 40)
                timer.setDelay(this.delay);
            newApple();
        }
    }

    public void checkCollisions(){
        for (int i=bodyParts;i>0;i--){
            if( (x[0] == x[i]) && (y[0]==y[i]) ){
                running = false;
            }
        }
        /*
        if(x[0] < 0)
            running = false;
        if(x[0] > SCREEN_WIDTH)
            running = false;
        if(y[0] < 0)
            running = false;
        if(y[0] > SCREEN_HEIGHT)
            running = false;

         */

        if(!running)
            timer.stop();
    }

    public void gameOver(Graphics g){
        g.setColor(new Color(170,0,0));
        g.setFont(new Font("Segue UI", Font.BOLD, 75));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("NES JEBAT", (SCREEN_WIDTH - metrics1.stringWidth("NES JEBAT"))/2, SCREEN_HEIGHT/2);

        g.setColor(new Color(170,170,10));
        g.setFont(new Font("Segue UI", Font.BOLD, 30));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("Score:   "+applesEaten, (SCREEN_WIDTH - metrics2.stringWidth("Score: "+applesEaten)), g.getFont().getSize());


    }

//    public void checkHighscore(){
//        try{
//            FileReader reader = new FileReader("highscore.dat");
//            int data = reader.read();
//            while(data != -1){
//                int score = Integer.parseInt(data)
//            }
//            reader.close();
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }
//    }

//    public void writeHighscore(){
//        try{
//            FileWriter writer = new FileWriter(("highscore.dat"));
//            writer.write("Last high score is: " + applesEaten);
//            writer.append("\nThanks for playing");
//            writer.close();
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }
//    }



    @Override
    public void actionPerformed(ActionEvent e){
        if(running){
            move();
            checkApple();
            checkCollisions();
        }
        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            switch(e.getKeyCode()){
                case KeyEvent.VK_LEFT:
                    if(direction != 'R'){
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if(direction != 'L'){
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if(direction != 'D'){
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if(direction != 'U'){
                        direction = 'D';
                    }
                    break;
            }
        }
    }
}
