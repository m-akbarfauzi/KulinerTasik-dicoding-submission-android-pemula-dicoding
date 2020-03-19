package com.icmm.kulinertasik.model;

public class Kuliner {

    private String name, detail, kategori, harga;
    private int photo;

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getKategori() {
        return kategori;
    }

    void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getHarga() {
        return harga;
    }

    void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDetail() {
        return detail;
    }

    void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    void setPhoto(int photo) {
        this.photo = photo;
    }
}