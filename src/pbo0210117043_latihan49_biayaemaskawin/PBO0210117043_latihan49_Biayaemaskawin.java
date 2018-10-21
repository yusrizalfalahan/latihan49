/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo0210117043_latihan49_biayaemaskawin;

/**
 *NAMA       : Yusrizal Falahan
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN BIAYA TOTAL EMAS
 * @author Acer
 */
public class PBO0210117043_latihan49_Biayaemaskawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         emas Emas = new emas ();
        System.out.println("Hitung Mahar Nikah");  
        System.out.println("Harga Emas Saat ini Rp. "+Emas.getHarga()+" per gramnya");
        System.out.println("Emas yang ingin dibeli Hendi : "+Emas.getBerat()+" gram");
        System.out.println("Total biaya yang harus dikeluarkan Rp. "+Emas.hitunghargaemas(Emas.getBerat(), Emas.getHarga()));
    }
    
}
