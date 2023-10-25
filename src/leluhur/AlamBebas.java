/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leluhur;

import jobDesk.Hacker;
import jobDesk.Pemburu;

/**
 *
 * @author fatiq
 */
public class AlamBebas extends Hewan implements Pemburu, Hacker{
    
    public AlamBebas(String nama, String namaSpesies){
        super(nama,namaSpesies);
        this.setHabitan();
    }
    
    public void setHabitan(){
        this.setHabitan("Alam Liar");
    }
    
    public void setHabitan(String habitan){
        this.setHabitan(habitan);
    }

    @Override
    public void berburu() {
        System.out.println("Takkan kubiarkan satu mangsa pun lolos dariku");
    }

    @Override
    public void meretasSistem() {
        System.out.println("Kan kuretas semua sistem yang ada");
    }
}
