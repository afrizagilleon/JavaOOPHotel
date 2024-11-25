/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

import Interface.IFasilitas;
import java.util.ArrayList;

public abstract class Kamar implements IFasilitas{
    private String nomor;
    private int kapasitas, nMalam, nOrang;
    private int checkIn, checkOut;
    private Tipe type;
    private String namaPenyewa;
    
    private double harga;
    private double penaltyLateCheckout;
    private double penaltyOverCapacity;
    
    protected ArrayList<String> daftarFasilitas = new ArrayList<>();

    public Kamar(String nomor, int kapasitas, Tipe type) {
        this.nomor = nomor;
        this.kapasitas = kapasitas;
        this.type = type;
    }
    
    public double calculateTotal(){
        if( this.checkOut == 0){ // jika penyewa belum checkout
            System.out.println("[Err-] " + this + " masih belum melakukan checkout");
            return -1.0; 
        }
        
        double result = nMalam * this.harga;
        int late = this.checkOut - (this.checkIn + this.nMalam);
        if( late > 0){ // jika terdapat keterlambatan
            result += this.penaltyLateCheckout* late;
        }
        
        if( this.nOrang > this.kapasitas ){
            result += this.penaltyOverCapacity*(this.nOrang - this.kapasitas);
        }
        return result;
    };
    
    public void book(String name, int nMalam, int nOrang){
        if( this.isBooked() ){ // 
            System.out.println("[Err-] " + this + " telah di-booking oleh " + this.namaPenyewa);
            return; 
        }
        this.namaPenyewa = name;
        this.nMalam = nMalam;
        this.nOrang = nOrang;
    }
    
    public boolean isBooked(){
        return this.nMalam != 0;
    }
    
    public void chekcIn(int checkInTime){
        this.checkIn = checkInTime;
    }
    
    public void checkOut(int checkOutTime){
        this.checkOut = checkOutTime;
    }
    
    public void clear(){
        this.namaPenyewa = "";
        this.nMalam = 0;
        this.checkIn = 0;
        this.checkOut = 0;
        System.out.println("[Info] "+ this + " telah dibersihkan");
    }
    
    public String getFasilitas() {
        String output = "";
        for (String f : daftarFasilitas) {
            output += f + ", ";
        }
        return output;
    }

    public Tipe getType() {
        return type;
    }
    
    public String getNomor(){
        return this.nomor;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setPenaltyLateCheckout(double penaltyLateCheckout) {
        this.penaltyLateCheckout = penaltyLateCheckout;
    }
    public void setPenaltyOverCapacity(double penaltyOverCapacity) {
        this.penaltyOverCapacity = penaltyOverCapacity;
    }
    
    @Override
    public String toString() {
        String output =  String.format("""
                                       Kamar %s %s
                                          -Harga: Rp. %.1f/Malam
                                          -Fasilitas: %s
                                          -Kapasitas: %d
                                          -Status: %s
                                       """, 
                this.type, this.nomor, this.harga, this.getFasilitas(), this.kapasitas,
                (this.isBooked() ? "Booked" : "Ready"));
        return output;
    }
   

}
