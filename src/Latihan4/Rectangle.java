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
public class Rectangle extends Shape {
    //private member variables
    private int lenght;
    private int width;
    
    public Rectangle(String color,int lenght, int width){
        super(color);
        this.lenght=lenght;
        this.width=width;
    }
    public String toString(){
        return "Rectangle[lenght=" +lenght+",width="+width+","+ super.toString()+"]";
    }
    
    @Override
    public double getArea(){
        return lenght*width;
    }
}
