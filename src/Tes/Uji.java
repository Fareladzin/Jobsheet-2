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
public class Uji {
    public static void main(String[] args) {
        Fareladzin uji = new Fareladzin();
        uji.setnamaAyah("YusufW");
        uji.setnamaIbu("Suciningsih");
        uji.setnama("Fareladzin Wibi");
        uji.setnamaSaudara("Alief Fahrizie");
        uji.setalamat("Jln.Keben 2A/4");
        uji.sethobi("Basket");
        uji.setCitacita("Pemain Basket");
        uji.setumur(16);
        
        System.out.print("Nama Ayah     : " + uji.getnamaAyah()
                        +"\nNamaIbu       : "+ uji.getnamaIbu()
                        +"\nNama          : "+ uji.getnama()
                        +"\nNama Saudara  : "+ uji.getnamaSaudara()
                        +"\nAlamat        : "+ uji.getalamat()
                        +"\nHobi          : "+ uji.gethobi()
                        +"\nCita-Cita     : "+ uji.getCitacita()
                        +"\nUmur          : "+ uji.getumur());
        System.out.println();
    }
    
    
    
}
