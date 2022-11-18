package com.bingo;

import javax.swing.*;

public class marco  extends JFrame {
    public marco(){
        setVisible(true);
        setBounds(300,400,500,400);
        lamina milam=new lamina();
        add(milam);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
