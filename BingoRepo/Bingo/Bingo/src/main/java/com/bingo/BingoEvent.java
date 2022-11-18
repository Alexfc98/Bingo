package com.bingo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BingoEvent implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
       boolean bool = Utilities.compareNumbers(Utilities.savedCard, Utilities.generatedNumbers);
        if(bool){
            System.out.println("Enhorabuena!! Bingo!!");
        } else System.out.println("Sigue intentandolo");


    }
}
