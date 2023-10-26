/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewan;

/**
 *
 * @author RIO
 */
public class Hewan {
    private String makanan;
    private String habitat = "darat / air";
    
    public Hewan(){
        this.makanan = "makanan :";
    }
    public Hewan(String habitat){
        this.habitat = "darat / air";
    }
    /**
     * @return the makanan
     */
    public String getMakanan() {
        return makanan;
    }
    /**
     * @param makanan the makanan to set
     */
    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }
    /**
     * @return the habitat
     */
    public String getHabitat() {
        return habitat;
    }
    /**
     * @param habitat the habitat to set
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }    
    public String aktif(){
        return "aktif...";
    }    
    public String aktif(String waktu){
        return "aktif..." + "pada " + waktu;
    }
    
}
