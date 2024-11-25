/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lokasi;

public class Lokasi {
    private String nama, detailAlamat;

    public Lokasi(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Kota " + nama;
    }

    public void setDetailAlamat(String detailAlamat) {
        this.detailAlamat = detailAlamat;
    }
}
