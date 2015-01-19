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
public class Banana {
   private double  x;
   private double y;
   private double g;
   private int v;
   private double t = 0;
   private int a;
   private boolean right = false;
   
   public Banana(int x, int y, int g,int a, int v,boolean right)
   {
       this.x = x;
       this.y = y;
       this.g = g * 9.81;
       this.v = v;
       this.a = a;
       this.right = right;
   }
   public void move()
   {
       double vy;
       double vx;
       t = 0.1+t;
       if (right)
       {
         vx = (v*t*Math.cos(Math.PI / 180 * a));
       }
       else
       {
           vx = -(v*t*Math.cos(Math.PI / 180 * a));
       }
       
       
       
       vy = -((v*t*Math.sin(Math.PI / 180 * a))-((0.5*9.81)*Math.pow(t,2)));
       x = x+vx;
       y = y+vy;
       //double sin0 = Math.cos(Math.PI / 180 * a);
       //double cos0 = Math.sin(Math.PI / 180 * a);
        //setX(v*t*cos0) ;
        //setY(v*t*sin0-(g/2)*Math.pow(t,2)); 
       
   }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
}
