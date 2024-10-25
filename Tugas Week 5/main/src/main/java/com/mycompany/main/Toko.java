package com.mycompany.main;

public class Toko {
    private String nama;
    private Inventaris inventaris;

    public Toko() {
        this.nama = "Hypebeast";
        this.inventaris = new Inventaris(5, 5); 
    }

    public Inventaris getInventaris() {
        return inventaris;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Toko: " + nama);
    }
}
