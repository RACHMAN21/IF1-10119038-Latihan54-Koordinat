/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.koordinat;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi menampilkan hasil data yang dimasukkan
 * 
 */

public class Tester {
    public static int x,y;
    public static String namaWarna;
    
    public static void main(String[] args) {
        WarnaKoordinat koordinat = new WarnaKoordinat(x,y,namaWarna);
        koordinat.setX(10);
        koordinat.setY(4);
        koordinat.setNamaWarna("Jingga");
        
        // Menampilkan hasil data yang dimasukkan
        System.out.println("Warna Koordinat : " + koordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + koordinat.getX() + ", y : "
                                                  + koordinat.getY());
    }
}
