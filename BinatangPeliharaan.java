/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class BinatangPeliharaan implements Binatang {
    public void sifat() {
        System.out.println("Binatang Peliharaan ini memiliki sifat jinak");
    }

    @Override
    public void makanan() {
        System.out.println("Binatang Peliharaan ini makan sayuran ");
    }

    @Override
    public void warna() {
        System.out.println("Binatang Peliharaan ini berwarna coklat");
}

    @Override
    public void ukuran() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
