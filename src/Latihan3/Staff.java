/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author SMK TELKOM
 */
public class Staff extends Pegawai {
     private static final int gajiStaff=50000;
    private static final int bonusStaff=10000;
    
    public int gaji(){
        return gajiStaff;
    }
    public int Bonus(){
        return bonusStaff;
    }
}
