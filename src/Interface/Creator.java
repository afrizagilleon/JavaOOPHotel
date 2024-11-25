/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import Hotel.*;
import Lokasi.Lokasi;

public class Creator {
    
    public Hotel createHotel(String nama, String namaKota){
        return new Hotel(nama, new Lokasi(namaKota));
    }
    
    public void createKamar(Hotel hotel, Tipe type, String nomor, int kapasitas){
        Kamar kamar = new KamarVIP(nomor, kapasitas);
        if( type == Tipe.Standar ){
            kamar = new KamarStandar(nomor, kapasitas);
        }else if( type == Tipe.Suite){
            kamar = new KamarSuite(nomor, kapasitas);
        }
        hotel.add(kamar);
    }
    
    public Kamar searchKamar(Hotel hotel, String nomor){
        return (Kamar)hotel.search(nomor);
    }
    
    
}

