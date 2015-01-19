/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monkeys;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.*;
import java.util.NoSuchElementException;
import java.util.Random;

/**
 *
 * @author Erik
 */
public class Monkeys extends JFrame {
 private Background bg;
 private Random rand = new Random();
    Monkeys() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Dimension d = new Dimension(1024,768);
	setPreferredSize(d);
	setMaximumSize(d);
	setMinimumSize(d);
        setResizable(false);
        
        
        bg = new Background();
        add(bg);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        bg.throwBanana(1, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(0, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(1, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(0, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(1, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(0, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(1, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(0, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(1, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(0, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(1, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(0, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(1, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(0, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(1, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(0, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(1, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(0, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(1, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(0, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(1, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(0, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        bg.throwBanana(1, 1, rand.nextInt((90 - 0) + 1) + 0, rand.nextInt((27 - 5) + 1) + 5);
        
        
    }

    public static void main(String[] args) {
         new Monkeys();
    }

}
