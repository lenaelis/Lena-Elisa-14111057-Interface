/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptop2;

/**
 *
 * @author Asus
 */
public abstract class Laptop2 {  // kelas abstract bebas menentukan method abstract dalam interface
       String merk = "Asus";
       String warna = "Abu-abu";
       abstract void printMerk();
       abstract void printWarna();
   
    public static void main(String[] args) {
         Interface lp = new Interface();
         lp.merk();
         lp.warna(); 
    }
    public interface Laptop2 {  //interface tidak di instansiasi
    Laptop2 lp = new Laptop2() {};
}

//interface dapat mengextends lebih dari satu interface
    public interface Laptop2 extends Acer, Asus, Apple{ 
    
}

//interface tidak dapat mengimplmentasi interface lain
public interface Laptop2 implements Asus static {
} 
}
