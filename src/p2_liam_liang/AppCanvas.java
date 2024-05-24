/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2_liam_liang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

/**
 *
 * @author Liam Liang
 */
public class AppCanvas  extends JPanel implements ActionListener, KeyListener, MouseListener, MouseMotionListener{
    //set variables
    int x;
    int y;
    int r = 50;
    Timer timer;
    Graphics2D pen;
    Boolean flag;
    Boolean press;
    
    //set color
    Color lightred = new Color(255, 66, 66);
    Color darkred = new Color(255, 0, 0);
    Color orange = new Color(255, 140, 0);
    Color yellow = new Color(255, 255, 0);
    Color lightgreen = new Color(0, 255, 0);
    Color darkgreen = new Color(25, 112, 25);
    Color lightblue = new Color(0, 255, 255);
    Color darkblue = new Color(0, 0, 255);
    Color purple = new Color(140, 0, 255);
    Color pink  = new Color(255, 0, 255);
    Color white  = new Color(255, 255, 255);
    Color black  = new Color(0, 0, 0);
    Color brown  = new Color(110, 52, 29);
    Color color[] = {lightred, darkred, orange, yellow, lightgreen, darkgreen, lightblue, darkblue, purple, pink, white, black, brown};
    int colorNum = 0;
    Color penColor = color[0];
    
    //set buttons
    Button color1 = new Button("light red",0,this);
    Button color2 = new Button("dark red",1,this);
    Button color3 = new Button("orange",2,this);
    Button color4 = new Button("yellow",3,this);
    Button color5 = new Button("light green",4,this);
    Button color6 = new Button("dark green",5,this);
    Button color7 = new Button("light blue",6,this);
    Button color8 = new Button("dark blue",7,this);
    Button color9 = new Button("purple",8,this);
    Button color10 = new Button("pink",9,this);
    Button color11 = new Button("white",10,this);
    Button color12 = new Button("black",11,this);
    Button color13 = new Button("brown",12,this);
    Button increse = new Button("increse brush size",13,this);
    Button decrese = new Button("decrese brush size",14,this);
    Button clear = new Button("clear",15,this);
    
    
    public AppCanvas(){
        //add button and set other variable
        flag = false;
        press = false;
        this.x = -100;
        this.y = -100;
        JPanel bar = new JPanel();
        JPanel bar1 = new JPanel();
        bar.add(this.color1);
        bar.add(this.color2);
        bar.add(this.color3);
        bar.add(this.color4);
        bar.add(this.color5);
        bar.add(this.color6);
        bar.add(this.color7);
        bar.add(this.color8);
        bar.add(this.color9);
        bar.add(this.color10);
        bar.add(this.color11);
        bar.add(this.color12);
        bar1.add(this.color13);
        bar1.add(this.increse);
        bar1.add(this.decrese);
        bar1.add(this.clear);
        
        //add panel
        bar.setVisible(true);
        add(bar);
        bar1.setVisible(true);
        add(bar1);
        
        //prepare listener
        this.addKeyListener(this);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.setFocusable(true);
        timer = new Timer (0,this);
        timer.start();
    }
    
    @Override
    public void paintComponent(Graphics g){
        //clear
        if(flag){
            super.paintComponent(g);
            flag = false;
        }
        
        //set pen
        pen = (Graphics2D) g;
        this.penColor = this.color[colorNum];
        this.pen.setColor(this.penColor);
        
        //drawing
        if(press){
            Ellipse2D.Double cir = new Ellipse2D.Double(this.x, this.y, this.r, this.r);
            this.pen.fill(cir);
        }
        repaint();
    }
    
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //down/decrese
        if(e.getKeyCode() == 40){
            this.r -= 5;
            if(this.r <= 0){
                this.r = 0;
            }
        }
        
        //up/increse
        if(e.getKeyCode() == 38){
            this.r += 5;
        }
        
        //left
        if(e.getKeyCode() == 37){
            if(this.colorNum == 0){
                this.colorNum = 12;
            }else{
                this.colorNum = colorNum - 1;
            }
        }
        
        //right
        if(e.getKeyCode() == 39){
            if(this.colorNum == 12){
                this.colorNum = 0;
            }else{
                this.colorNum = colorNum + 1;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.x = e.getX() - this.r/2;
        this.y = e.getY() - this.r/2;
        press = true;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        press = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    
    @Override
    public void mouseDragged(MouseEvent e) {
        this.x = e.getX() - this.r/2;
        this.y = e.getY() - this.r/2;
        press = true;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
