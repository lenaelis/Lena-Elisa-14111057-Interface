/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Singa {
     public void tampilkanSinga(){
        System.out.println("Ini Kelas Singa");
	Binatang Bn = new Binatang() {
            @Override
            public void ukuran() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void makanan() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void warna() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
	Bn.setKulit("Bulu Halus dan lebat");
	System.out.println("Binatang ini ditutupi oleh : "+hwn.getKulit());
        Bn.setJumlahkaki(4);
	System.out.println("Binatang ini memiliki jumlah kaki : "+hwn.getJumlahkaki());
        Bn.setJenis("Mamalia");
        System.out.println("Binatang ini termasuk jenis : "+hwn.getJenis());
} 

    void tampilkanlaba() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
