/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monkeys;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Erik
 */
public class Background extends JPanel {

    private Monkey monkey1;
    private Monkey monkey2;
    private Banana banana;
    private ArrayList<Building> buildings;
    private static final ImageIcon monkeySprite = new ImageIcon(Background.class.getResource("Monkey.png"));
    private static final ImageIcon monkeyThrowSprite = new ImageIcon(Background.class.getResource("MonkeyThrow.png"));
    private static final ImageIcon buildingSprite3 = new ImageIcon(Background.class.getResource("Buildings-3.png"));
    private static final ImageIcon buildingSprite4 = new ImageIcon(Background.class.getResource("Buildings-4.png"));
    private static final ImageIcon buildingSprite5 = new ImageIcon(Background.class.getResource("Buildings-5.png"));
    private static final ImageIcon bananaSprite = new ImageIcon(Background.class.getResource("banana.gif"));
    private boolean throwing1 = false;
    private boolean throwing2 = false;
    private Random rand = new Random();

    public Background() {

        setBackground(Color.blue);
        createSkyline();
        PlaceFirstMonkey();
        PlaceSecondMonkey();

    }

    public void act() {
        banana.move();
    }

    private void PlaceFirstMonkey() {
        int randomPlaceOne = rand.nextInt((350 - 50) + 1) + 50;
        monkey1 = new Monkey(randomPlaceOne, 32);
        int i = 0;
        boolean placed = false;
        while (!placed) {
            if (monkey1.getX() > buildings.get(i).getX() && monkey1.getX() + 40 < buildings.get(i).getX() + buildings.get(i).getWidth()) {
                monkey1.setY(buildings.get(i).getY() - 32);
                placed = true;
            }
            i++;
            if (buildings.size() == i) {
                i = 0;
                monkey1.setX(rand.nextInt((350 - 50) + 1) + 50);
            }

        }
    }

    public void throwBanana(int monkey, int gravity,int angle,int velocity) {
        boolean end = false;
        if (monkey == 0) {
            banana = new Banana(monkey1.getX(), monkey1.getY(), gravity, angle, velocity, true);
        } else {
            banana = new Banana(monkey2.getX(), monkey2.getY(), gravity, angle, velocity, false);
        }
        if (monkey == 0) {
            throwing1 = true;
        } else {
            throwing2 = true;
        }
        while (!end) {

            long start = System.currentTimeMillis();
            act();
            repaint();
            if (banana.getY() > 2000) {
                end = true;
                if (monkey == 0) {
                    throwing1 = false;
                } else {
                    throwing2 = false;
                }

            }
            while (System.currentTimeMillis() - start < 33) {
            }
        }
    }

    private void PlaceSecondMonkey() {
        int randomPlaceOne = rand.nextInt((967 - 617) + 1) + 617;
        monkey2 = new Monkey(randomPlaceOne, 32);
        int i = 0;
        boolean placed = false;
        while (!placed) {
            if (monkey2.getX() > buildings.get(i).getX() && monkey2.getX() + 40 < buildings.get(i).getX() + buildings.get(i).getWidth()) {
                monkey2.setY(buildings.get(i).getY() - 32);
                placed = true;
            }
            i++;
            if (buildings.size() == i) {
                i = 0;
                monkey2.setX(rand.nextInt((967 - 617) + 1) + 617);
            }

        }
    }

    private void createSkyline() {
        int fieldLength = 0;
        buildings = new ArrayList<>();
        while (fieldLength <= 1024) {
            int randomHeight = rand.nextInt((600 - 300) + 1) + 300;
            int randomType = rand.nextInt((2 - 0) + 1) + 0;
            Building bldng = new Building(fieldLength, randomHeight, randomType);
            fieldLength = fieldLength + bldng.getWidth() + 10;
            buildings.add(bldng);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.setColor(Color.white);
        g.drawRect(0, 300, 1017, 300);
        g.setColor(Color.red);
        g.drawRect(50, 0, 350, 739);
        g.setColor(Color.yellow);
        g.drawRect(617, 0, 350, 739);
        g.setColor(Color.green);
        g.drawRect(0, 0, 1017, 739);

        for (int i = 0; i < buildings.size(); i++) {
            if (buildings.get(i).getType() == 0) {
                g.drawImage(buildingSprite3.getImage(), buildings.get(i).getX(), buildings.get(i).getY(), this);
            }

            if (buildings.get(i).getType() == 1) {
                g.drawImage(buildingSprite4.getImage(), buildings.get(i).getX(), buildings.get(i).getY(), this);
            }

            if (buildings.get(i).getType() == 2) {
                g.drawImage(buildingSprite5.getImage(), buildings.get(i).getX(), buildings.get(i).getY(), this);
            }
        }
        if (throwing1) {
            g.drawImage(monkeyThrowSprite.getImage(), monkey1.getX(), monkey1.getY(), this);
        }
        if (!throwing1) {
            g.drawImage(monkeySprite.getImage(), monkey1.getX(), monkey1.getY(), this);
        }

        if (throwing2) {
            g.drawImage(monkeyThrowSprite.getImage(), monkey2.getX(), monkey2.getY(), this);
        }
        if (!throwing2) {
            g.drawImage(monkeySprite.getImage(), monkey2.getX(), monkey2.getY(), this);
        }

        //g.drawImage(monkeySprite.getImage(), monkey2.getX(), monkey2.getY(), this);
        g.drawImage(bananaSprite.getImage(), (int) banana.getX(), (int) banana.getY(), this);
        // g.drawRect((int) banana.getX()+16, (int) banana.getY()+16, 20, 20);

    }
}
