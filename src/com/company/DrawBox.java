package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawBox {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Counter");
        jFrame.setSize(500, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setContentPane(new DrawPanel());

    }
}
class DrawPanel extends JPanel{
    public void paintComponent(Graphics graphics){
        for (int i = 0; i < 10;i++){
            graphics.setColor(Color.BLUE);
            graphics.fillRect( 10 + i *30, 10, 20, 20);
            JLabel jLabel = new JLabel();
            jLabel.setText(String.valueOf(i));
            jLabel.setBounds(15+i*30, 35, 10, 10);
            if (i%2==0)
                jLabel.setForeground(Color.RED);
                else jLabel.setForeground(Color.BLACK);


            this.add(jLabel);
        }



    }
}
