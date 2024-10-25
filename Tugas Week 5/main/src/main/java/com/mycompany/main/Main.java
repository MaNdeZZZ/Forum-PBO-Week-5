package com.mycompany.main;

public class Main {
    public static void main(String[] args) {
        Toko toko = new Toko();

        Pemasok pemasok1 = new Pemasok("Ray", "Sukapura");
        Pemasok pemasok2 = new Pemasok("Helmi", "Sukabirus");
        Pemasok pemasok3 = new Pemasok("Wira", "PBB");

        toko.getInventaris().tambahPemasok(pemasok1);
        toko.getInventaris().tambahPemasok(pemasok2);
        toko.getInventaris().tambahPemasok(pemasok3);

        Barang barang1 = new Pakaian("Kaos Deus", 50000, 3, "M");
        Barang barang2 = new Pakaian("Celana Levi's", 150000, 4, "L");
        Barang barang3 = new Pakaian("Hoodie Uniqlo", 200000, 2, "L");

        toko.getInventaris().tambahBarang(barang1);
        toko.getInventaris().tambahBarang(barang2);
        toko.getInventaris().tambahBarang(barang3);

//        System.out.println("Informasi Toko");
//        toko.tampilkanInfo();
//        System.out.println(" ");
//        System.out.println("Informasi Inventaris:");
//        toko.getInventaris().tampilkanInventaris();
//        
//        barang1.tambahStok(2);
//        barang2.kurangiStok(1);
//        System.out.println("Informasi Inventaris:");
//        toko.getInventaris().tampilkanInventaris();
        
        toko.getInventaris().hapusBarang(barang3);
        toko.getInventaris().hapusPemasok(pemasok1);
        System.out.println("Informasi Inventaris:");
        toko.getInventaris().tampilkanInventaris();
        
    }
}



