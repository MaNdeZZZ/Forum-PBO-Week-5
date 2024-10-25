package com.mycompany.main;

public class Inventaris {
    private Barang[] daftarBarang;
    private Pemasok[] daftarPemasok;
    private int jumlahBarang;
    private int jumlahPemasok;

    public Inventaris(int kapasitasBarang, int kapasitasPemasok) {
        daftarBarang = new Barang[kapasitasBarang];
        daftarPemasok = new Pemasok[kapasitasPemasok];
        jumlahBarang = 0;
        jumlahPemasok = 0;
    }

    public void tambahBarang(Barang barang) {
        if (jumlahBarang < daftarBarang.length) {
            daftarBarang[jumlahBarang] = barang;
            jumlahBarang++;
        } else {
            System.out.println("Kapasitas barang penuh.");
        }
    }

    public void hapusBarang(Barang barang) {
        for (int i = 0; i < jumlahBarang; i++) {
            if (daftarBarang[i].equals(barang)) {
                for (int j = i; j < jumlahBarang - 1; j++) {
                    daftarBarang[j] = daftarBarang[j + 1];
                }
                daftarBarang[jumlahBarang - 1] = null;
                jumlahBarang--;
                return;
            }
        }
        System.out.println("Barang tidak ditemukan.");
    }

    public void tambahPemasok(Pemasok pemasok) {
        if (jumlahPemasok < daftarPemasok.length) {
            daftarPemasok[jumlahPemasok] = pemasok;
            jumlahPemasok++;
        } else {
            System.out.println("Kapasitas pemasok penuh.");
        }
    }

    public void hapusPemasok(Pemasok pemasok) {
        for (int i = 0; i < jumlahPemasok; i++) {
            if (daftarPemasok[i].equals(pemasok)) {
                for (int j = i; j < jumlahPemasok - 1; j++) {
                    daftarPemasok[j] = daftarPemasok[j + 1];
                }
                daftarPemasok[jumlahPemasok - 1] = null;
                jumlahPemasok--;
                return;
            }
        }
        System.out.println("Pemasok tidak ditemukan.");
    }

    public void tampilkanInventaris() {
        System.out.println("Daftar Barang:");
        for (int i = 0; i < jumlahBarang; i++) {
            daftarBarang[i].tampilkanInfo();
        }
        System.out.println("\nDaftar Pemasok:");
        for (int i = 0; i < jumlahPemasok; i++) {
            daftarPemasok[i].tampilkanInfo();
        }
    }
}
