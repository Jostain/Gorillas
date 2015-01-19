/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monkeys;

/**
 *
 * @author Erik
 */
public class Building {
     private int type;
     private int x;
     private int y;
     private int width;
     private int height = 539;
     Building(int x, int y, int type) {
       this.type = type;
       if (type == 0)
       {
          width = 98;
       }
       if (type == 1)
       {
           width = 128;
       }
       if (type == 2)
       {
           width = 158;
       }
       this.x = x;
       this.y = y;
    }

    
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }
  
}
