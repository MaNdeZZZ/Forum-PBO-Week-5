package com.mycompany.main;

public class Barang {
    protected String nama;
    protected double harga;
    protected int stok;
    private String kategori;

    public Barang(String nama, double harga, int stok, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }

    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak cukup!");
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Harga: " + harga + ", Stok: " + stok + ", Kategori: " + kategori);
    }
}
