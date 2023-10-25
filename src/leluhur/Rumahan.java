/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leluhur;

import jobDesk.CyberSecurity;
import jobDesk.PenjagaRumah;
import jobDesk.Youtuber;

/**
 *
 * @author fatiq
 */
public class Rumahan extends Hewan implements PenjagaRumah, Youtuber, CyberSecurity{
    
    public Rumahan(String nama, String namaSpesies){
        super(nama,namaSpesies);
        this.setHabitan();
    }
    
    public void setHabitan(){
        this.setHabitan("Rumahan");
    }
    
    public void setHabitan(String habitan){
        this.setHabitan(habitan);
    }

    @Override
    public void menjagaRumah() {
        System.out.println("Kan kujaga rumah ini");
    }

    @Override
    public void buatKonten() {
        System.out.println("Upload tiap Hari");
    }

    @Override
    public void menjagaSistem() {
        System.out.println("Kan kujaga sistem ini dari hacker tak bermutu");
    }
}
