package com.bingo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class numberGenEvent implements ActionListener {

    public List<Integer> list = new ArrayList<Integer>();


    @Override
    public void actionPerformed(ActionEvent e) {
        int x = Utilities.generateRandom();
        if(!list.contains(x)){
        Utilities.saveGeneratedNumbers(x);
        System.out.println(x);

        }
    }

    }



