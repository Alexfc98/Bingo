package com.bingo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startEvent implements ActionListener {

    Card card;
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        card = new Card(Card.generateCard());
        Utilities.saveGeneratedCard(card);
        System.out.println("==== Este es tu carton =====");
        System.out.println();
        card.showCard();

    }
}
