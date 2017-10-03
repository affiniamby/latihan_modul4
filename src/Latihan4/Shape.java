/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author SMK TELKOM
 */
public class Shape {
    //private member variable 
    private String color;
    //constructor
    public Shape (String color){
        this.color = color;
    }
    @Override 
    public String toString(){
      return "Shape[color ="+ color + "]";
    }
    //all shapes must have a method called getArea().
    public double getArea(){
        System.err.println("Shape unknow! Cannot compute area!");
        return 0;
    }

    String toSting() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
