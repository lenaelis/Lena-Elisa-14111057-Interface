/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class BinatangBuas implements Binatang {
    public void sifat() {
        System.out.println("Binatang Ternak ini memiliki sifat Buas");
    }

    @Override
    public void makanan() {
        System.out.println("Binatang Buas ini makan daging");
    }

    @Override
    public void warna() {
        System.out.println("Binatang Buas ini berwarna Hitam");
}
}
