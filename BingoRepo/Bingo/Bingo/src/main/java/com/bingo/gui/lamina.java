package com.bingo;

import javax.swing.*;

public class lamina extends JPanel {
    private JButton botton = new JButton("Start");
    private JButton botton1 = new JButton("Generate number");
    private JButton bingoButton = new JButton("Bingo!");
    private JLabel label = new JLabel();
    public lamina(){
        add(botton);
        add(botton1);
        add(bingoButton);
        numberGenEvent genEvent = new numberGenEvent();
        startEvent start = new startEvent();
        BingoEvent bingoEvent = new BingoEvent();
        bingoButton.addActionListener(bingoEvent);
        botton.addActionListener(start);
        botton1.addActionListener(genEvent);





    }
}
