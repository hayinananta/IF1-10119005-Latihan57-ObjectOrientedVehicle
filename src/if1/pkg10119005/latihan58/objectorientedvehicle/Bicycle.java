/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan58.objectorientedvehicle;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini menampilkan Vehicle dengan jenis yang berbeda
 *                     dengan brand, model, dan jumlah gear dengan berbasis
 *                     objek
 */
public class Bicycle extends Vehicle {
    private int myGearCount;
    
    public Bicycle() {
        super();
        System.out.println("Bicycle");
    }
    
    public int getGearCount() {
        return this.myGearCount;
    }
    
    public void setGearCount(int gearCount) {
        this.myGearCount = gearCount;
    }
}