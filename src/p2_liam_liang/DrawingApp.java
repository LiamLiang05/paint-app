/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2_liam_liang;

import javax.swing.*;

/**
 *
 * @author Liam Liang
 */
public class DrawingApp extends JFrame{
    public DrawingApp(){
        super("Drawing App");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AppCanvas appCanvas = new AppCanvas();
        add(appCanvas);
        setVisible(true);
        
    }
}
