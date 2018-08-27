/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author Fareladzin Wibi
 */
public class UjiBus {
    public static void main(String[] args) {
        Bus busMini = new Bus();
        busMini.penumpang = 5;
        busMini.maxpenumpang = 15;
        
        busMini.penumpang = busMini.penumpang +5;
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang -2;
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang +5;
        busMini.cetak();
}
}
