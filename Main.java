/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Main {
   public static void main (String[] args){
        
        Binatang Bn = new Binatang() {};
            System.out.println("Ini Kelas Binatang");
    System.out.println("");
            
    
    Binatang a = new Binatang();
    System.out.println("Ini Kelas Binatang");
	a.setKulit("Bulu");
	System.out.println("Binatang ini ditutupi oleh : "+a.getKulit());
        a.setJumlahkaki(4);
	System.out.println("Binatang ini memiliki jumlah kaki : "+a.getJumlahkaki());
        a.setJenis("Mamalia");
        System.out.println("Binatang ini termasuk jenis : "+a.getJenis());
    
            System.out.println("");

        BinatangTernak ak;
       ak = new BinatangTernak ();
        System.out.println("Ini Kelas Binatang Ternak Implement Kelas Binatang");
        ak.ukuran();
        ak.makanan();
        ak.warna();
        
            System.out.println("");

        BinatangBuas an;
       an = new BinatangBuas();
        System.out.println("Ini Kelas Binatang Buas Implement Kelas Binatang");
        an.ukuran();
        an.makanan();
        an.warna();
        
            System.out.println("");

        BinatangPeliharaan ac;
       ac = new BinatangPeliharaan();
        System.out.println("Ini Kelas Binatang Peliharaan Implement Kelas Binatang");
        ac.ukuran();
        ac.makanan();
        ac.warna();
        
            System.out.println("");
    
        Sapi sp = new Sapi();
        sp.tampilkanSapi();
        
               System.out.println("");
    
        Singa sn = new Singa();
        sn.tampilkanSinga();
} 

}
