/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author ASUS
 */
public class UjiBus {
    public static void main(String[] args) {
        //membuat objek busmini dari kelas bus
         Bus busMini = new Bus();
         //memasukan nilai jumlah penumpang dan penumpang maksimal ke dalam objek busMini
         busMini.penumpang = 5;
         busMini.maxPenumpang = 15;
         // memanggil method cetak pada class bus
         busMini.cetak();
         
         //menambahkan penumpang pada busMini
         busMini.penumpang = busMini.penumpang +5;
         //memanggil method cetak pada Class Bus
         busMini.cetak();
         
         //mengurangi penumpang pada busMini 
         busMini.penumpang = busMini.penumpang -2;
         busMini.cetak();
         
         //menambahkanjumlah penumpang pada busMini
         busMini.penumpang = busMini.penumpang +8;
         busMini.cetak();
                 
    }
}
