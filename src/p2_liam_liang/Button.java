/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2_liam_liang;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Liam Liang
 */
public class Button extends JButton implements MouseListener{
    
    AppCanvas c;
    int index;
    
    public Button(String name, int index, AppCanvas c){
        super(name);
        this.addMouseListener(this);
        this.c = c;
        this.index = index;
    }
    

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //color button
        if(index >= 0 && index < 13){
            c.colorNum = index;
        }
        //up button
        if(index == 13){
           c.r += 5;
        }
        //down button
        if(index == 14){
           c.r -= 5;
           if(this.c.r <= 0){
                this.c.r = 0;
            }
        }
        //clear button
        if(index == 15){
           c.flag = true;
        }
    }
}
