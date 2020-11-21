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
public class Vehicle {
    private String myBrand, myModel;
    
    public Vehicle() {
    }
    
    public String getBrand() {
        return this.myBrand;
    }
    
    public void setBrand(String brand) {
        this.myBrand = brand;
    }
    
    public String getModel() {
        return this.myModel;
    }
    
    public void setModel(String model) {
        this.myModel = model;
    }
}