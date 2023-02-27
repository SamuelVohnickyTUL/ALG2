/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cvika;

/**
 * represents a point in 2D
 * @author samuel.vohnicky
 */
public class Point {
    double x;
    double y;
    //konstruktor
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    //metody které pracujís daty
    public double distance(){
        return Math.hypot(x, y);
    }
    
    //překrytí metody a předka(override)
    public String toString(){
        return String.format("x = %.2f, y = %.2f ", x , y);
    }
    
    public double getX(){
        return x;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    //test
    /**
    public static void main(String[] args)
    {
        Point pointA = new Point(3, 4);
        double result = pointA.distance();
        System.out.println(result);
        System.out.println(pointA);
    }
    */
}


        
