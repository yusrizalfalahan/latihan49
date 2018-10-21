/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo0210117043_latihan49_biayaemaskawin;

/**
 *
 * @author Acer
 */
public class emas {
    private double harga=570000;
    private double berat;

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }
    public double hitunghargaemas(double parHarga, double parBerat){
        return berat*harga;
    }
}
