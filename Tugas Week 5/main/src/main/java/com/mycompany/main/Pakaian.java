package com.mycompany.main;

public class Pakaian extends Barang {
    private String ukuran;

    public Pakaian(String nama, double harga, int stok, String ukuran) {
        super(nama, harga, stok, "Pakaian");
        this.ukuran = ukuran;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ukuran: " + ukuran);
    }
}


