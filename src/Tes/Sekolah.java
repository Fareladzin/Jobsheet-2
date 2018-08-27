/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tes;

/**
 *
 * @author Fareladzin Wibi
 */
public class Sekolah {
    String namaSekolah;
    String Alamat;
    String notelp;
    
    public String getnamaSekolah(){
        return namaSekolah;
    }
    public String getAlamat(){
        return Alamat;
    }
    public String getnotelp(){
        return notelp;
    }
    
    public void setnamaSekolah(String newnamaSekolah){
        this.namaSekolah = newnamaSekolah;
    }
    public void setAlamat(String newAlamat){
        this.Alamat = newAlamat;
    }
    public void setnotelp(String newnotelp){
        this.notelp = newnotelp;
    }
    
    public static void main(String[] args){
        Sekolah uji = new Sekolah();
        uji.setnamaSekolah("SMK Telkom");
        uji.setAlamat("Jln. Danau Ranau");
        uji.setnotelp("082257706877");
        
        System.out.println("Nama Sekolah : "+uji.getnamaSekolah()
                          +"\nAlamat       : "+uji.getAlamat()
                          +"\nNo.Telp      : " +uji.getnotelp());
    }

    
}
