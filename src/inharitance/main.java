/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inharitance;

/**
 *
 * @author MOKLET-2
 */
public class main {
    public static void main(String[] args) {
     
        // membuat objek bangun datar
        bangunDatar bangunDatar = new bangunDatar();

        // membuat objek persegi dan mengisi nilai properti
        perseggi persegi = new perseggi();
        persegi.sisi = 6;

        // membuat objek Lingkaran dan mengisi nilai properti
        lingkaran lingkaran = new lingkaran();
        lingkaran.r = 22;

        //membuat objek segitiga dan mengisi nilai
        segitiga SEGITIGA = new segitiga();
        SEGITIGA.alas = 12;
        SEGITIGA.tinggi = 8;

        //membuat objek persegipanjang dan mengisi nilai
        persegipanjang PERSEGIpanjang = new persegipanjang();
        PERSEGIpanjang.panjang = 16;
        PERSEGIpanjang.lebar = 10;

        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        PERSEGIpanjang.luas();
        PERSEGIpanjang.keliling();

        SEGITIGA.luas();

    }
}
