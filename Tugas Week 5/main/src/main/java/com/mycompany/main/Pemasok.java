package com.mycompany.main;

public class Pemasok {
    private String nama;
    private String alamat;

    public Pemasok(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pemasok: " + nama + ", Alamat: " + alamat);
    }

    public String getNama() {
        return nama;
    }
}

