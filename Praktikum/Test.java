/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author SMK TELKOM
 */
public class Test {
    public static void main(String[]args){
        Rect r1 = new Rect (2,2,4,4);
        Rect r2 = new Rect (2,3,5,7);
        Rect u = r1.union(r2);
        Rect i = r1.intersection(r2);
        
        if (u.isInside(r2.x1,r2.y1))
            System.out.println("("+r2.x1+","+r2.y1+")is indide tehe union"); 
            System.out.println(r1 + "union"+r2+ "=" +u);
            System.out.println(r2 + "intersect"+r2+ "=" +i);
    }
}
