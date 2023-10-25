/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import leluhur.AlamBebas;
import leluhur.Hewan;
import leluhur.Rumahan;

/**
 *
 * @author fatiq
 */
public class iniMain {
    public static void main(String[] args) {
        Rumahan brengas = new Rumahan("Brengas","Kucing");
        System.out.println(brengas.getNama()+", Spesies "+brengas.getNamaSpesies()+","
                + " Hidup di "+brengas.getHabitan());
        brengas.menjagaRumah();
        brengas.menjagaSistem();
        brengas.makan("Wiskas");
        
        System.out.println("\n\n");
        
        AlamBebas mrX = new AlamBebas("mrX","Kucing Hutan");
        System.out.println(mrX.getNama()+", Spesies "+mrX.getNamaSpesies()+","
                + " Hidup di "+mrX.getHabitan());
        mrX.berburu();
        mrX.meretasSistem();
        mrX.makan(0.75);
        
        System.out.println("\n\n");
        
        Hewan siRubah = new Hewan("siRubah","Rubah");
        siRubah.setHabitan("Alam");
        System.out.println(siRubah.getNama()+", Spesies "+siRubah.getNamaSpesies()+","
                + " Hidup di "+brengas.getHabitan());
        siRubah.makan(3);
    }
}
