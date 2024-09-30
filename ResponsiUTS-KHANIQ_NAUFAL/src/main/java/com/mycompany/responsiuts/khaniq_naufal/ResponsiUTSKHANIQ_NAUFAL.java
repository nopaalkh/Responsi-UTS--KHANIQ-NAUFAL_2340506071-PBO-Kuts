/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.responsiuts.khaniq_naufal;

/**
 *
 * @author hp
 */
public class ResponsiUTSKHANIQ_NAUFAL {

    public static void main(String[] args) {
        Produk produk1 = new Elektronik("Laptop", 15000000, 2);
        Produk produk2 = new Makanan("Snack", 15000, "2023-12-30");

        produk1.tampilkanInfo();
        System.out.println();
        produk2.tampilkanInfo();

        Pegawai pegawai1 = new PegawaiKontrak("Andi", 3000000, 12);
        Pegawai pegawai2 = new PegawaiTetap("Khaniq Naufal", 5000000, 1000000);

        pegawai1.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }
}
