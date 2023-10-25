/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leluhur;

/**
 *
 * @author fatiq
 */
public class Hewan {
    private String nama;
    private String namaSpesies;
    private String habitan;

    public Hewan(String nama, String namaSpesies){
        this.nama = nama;
        this.namaSpesies = namaSpesies;
    }
    
    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @return the namaSpesies
     */
    public String getNamaSpesies() {
        return namaSpesies;
    }

    /**
     * @return the habitan
     */
    public String getHabitan() {
        return habitan;
    }
    
    public void makan(String makanan){
        System.out.println("Aku makan " + makanan);
    }
    
    public void makan(int banyak){
        System.out.println("Aku makan " + banyak + " kali");
    }
    
    public void makan(double banyak){
        System.out.println("Aku makan " + banyak + " kali");
    }

    /**
     * @param habitan the habitan to set
     */
    public void setHabitan(String habitan) {
        this.habitan = habitan;
    }
    
}
