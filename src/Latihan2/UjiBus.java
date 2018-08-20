/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

import Latihan.*;

/**
 *
 * @author ASUS
 */
public class UjiBus {
    public static void main(String[] args) {
        //membuat objek busmini dari kelas bus
         Bus busBesar = new Bus(40);
         busBesar.cetak();
         //penambahan penumpang
         busBesar.addPenumpang(15);//Menambahkan 15 Penumpang
         busBesar.cetak();
         //penambahan penumpang
         busBesar.addPenumpang(5);//Menambahkan 5 Penumpang
         busBesar.cetak();
         busBesar.addPenumpang(26);//Menambahkan 26 Penumpang
         busBesar.cetak();

    }
}
