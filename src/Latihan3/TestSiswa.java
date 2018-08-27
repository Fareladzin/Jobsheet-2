/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author Fareladzin Wibi
 */
public class TestSiswa {
    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Sugeng");
        siswa.setAbsen(15);
        siswa.setAdress("Jln. Keben");
        
        System.out.print(" Name : "+siswa.getName()+"\n Absen : "+siswa.getAbsen()+"\n Alamat : "+siswa.getAdress());
        System.out.println();
        
        
    }
}
