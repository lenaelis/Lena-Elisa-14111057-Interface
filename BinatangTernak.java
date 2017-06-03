/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class BinatangTernak implements Binatang {
    public void sifat() {
        System.out.println("Binatang Ternak ini memiliki sifat : jinak");
    }

    @Override
    public void makanan() {
        System.out.println("Binatang Ternak ini makan rumput");
    }

    @Override
    public void warna() {
        System.out.println("Binatang Ternak ini berwarna putih");
}
}
