/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewan;

/**
 *
 * @author RIO
 */
public class HewanAir extends Hewan implements Ternak, Hias, Menguntungkan{
    
    @Override
    public void berkembangBiak() {
        System.out.println("Berkembang biak membutuhkan waktu yang pendek");
    }

    @Override
    public void rawat() {
        System.out.println("Perawatan dengan rutin mengganti air");
    }

    @Override
    public void harga() {
        System.out.println("Harga dari puluhan ribu hingga ratusan ribu");
    }
    
    public void setHabitat(){
        super.setHabitat("pasti di air");
    }
    
    public HewanAir(){
        this.setHabitat();
    }

    
    
}
