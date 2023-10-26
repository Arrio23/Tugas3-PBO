/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;


import Hewan.HewanAir;

/**
 *
 * @author RIO
 */
public class Output {
    
    public static void main(String[] args) {
        HewanAir ikanCupang = new HewanAir();
        System.out.println("ikan cupang hidup " + ikanCupang.getHabitat());
        System.out.println("ikan cupang " + ikanCupang.aktif("siang hari"));
        System.out.println(ikanCupang.getMakanan() + " cacing sutra, kutu air");
        ikanCupang.berkembangBiak();
        ikanCupang.harga();
        ikanCupang.rawat();
    }
    
}
