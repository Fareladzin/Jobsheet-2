/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Fareladzin Wibi
 */
public class Bus {
    public double penumpang;
    public double maxPenumpang;
    public double counter;
    public double penumpangBaru, average;
    public Bus(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    public void addPenumpang(double penumpang){
        double tmbh;
        tmbh = this.penumpang+penumpang;
        if (tmbh> maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = tmbh;
        }
    }
    public void getPenumpang(int password){
        if(password == 27)
        {
            System.out.println("Password Benar");
        }
        else{
            System.out.println("Password Salah");
        }
    }
    public void addAverage(double average)
    {
        double total;
        total = ((this.penumpang*average)+(penumpang*average))/this.penumpang;
        if (total>0){
            this.average = total;
        }else{
            System.out.println("Program Salah Input Salah");
        }
    }
    public void cetak(){
        System.out.println("Penumpang Bus Sekarang adalah "+penumpang);
        System.out.println("Penumpang Maksimum Seharusnya adalah "+maxPenumpang);
        System.out.println("Rata-rata berat Penumpang Sekarang adalah "+average);

    }   
    public static void main(String[] args) {
        Bus Coba = new Bus(50);
        Coba.getPenumpang(27);
        Coba.cetak();       
        Coba.addPenumpang(2);
        Coba.addAverage(50);
        Coba.cetak();       
        Coba.addPenumpang(2);
        Coba.addAverage(50);
        Coba.cetak();
        Coba.addPenumpang(10);
        Coba.addAverage(40);
        Coba.cetak();
        Coba.addPenumpang(3);
        Coba.addAverage(50);
        Coba.cetak();
    }
}