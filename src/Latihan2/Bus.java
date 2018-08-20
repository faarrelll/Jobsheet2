/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author ASUS
 */
public class Bus {
    public int penumpang;
    public int maxPenumpang;
    
    
    //konstruktor kelas Bus
    
    public Bus(int maxPenumpang){
    this.maxPenumpang = maxPenumpang;
    penumpang = 0;
    
    }
    //method mutator untuk menambahkan penumpang
    
    public void addPenumpang(int penumpang){
    int temp;
    temp = this.penumpang+penumpang;
        if (temp >= maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
        }
    }
   public void cetak() {
        System.out.println("Penumpang Bus Sekarang Adalah "+penumpang);
        System.out.println("Penumpang MAX Bus Sekarang Adalah "+maxPenumpang);
    }

   
}
