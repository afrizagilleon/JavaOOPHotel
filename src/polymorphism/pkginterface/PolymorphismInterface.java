/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package polymorphism.pkginterface;

import Hotel.Tipe;
import Interface.IHotelManagement;

public class PolymorphismInterface implements IHotelManagement{

    public static void main(String[] args) {
        
        // membuat cabang hotel
        daftarHotel.add( manager.createHotel("Indonesia Kempinski", "Jakarta") );
        daftarHotel.add( manager.createHotel("Savoy Homann", "Bandung") );
        daftarHotel.add( manager.createHotel("Santika Bogor", "Bogor") );
        
        // menambahkan alamat detail pada hotel
        daftarHotel.get(0).setAlamatDetail("Jl. MH Thamrin No. 1, Thamrin, Jakarta Pusat, DKI Jakarta.");
        daftarHotel.get(1).setAlamatDetail("Jl. Asia Afrika No. 112, Braga, Sumurbandung, Kota Bandung, Jawa Barat.");
        daftarHotel.get(2).setAlamatDetail("Jl. Raya Pajajaran No. 27, Bogor Tengah, Kota Bogor, Jawa Barat.");
        
        // menambahkan kamar pada hotel Indonesia Kempinski
        manager.createKamar( daftarHotel.get(0), Tipe.Standar, "201", 2);
        manager.createKamar( daftarHotel.get(0), Tipe.VIP, "302", 4);
        manager.createKamar( daftarHotel.get(0), Tipe.Suite, "310", 2);
        manager.createKamar( daftarHotel.get(0), Tipe.Standar, "122", 4);
        manager.createKamar( daftarHotel.get(0), Tipe.VIP, "124", 2);
        
        // menambahkan kamar pada hotel Savoy Homann
        manager.createKamar( daftarHotel.get(1), Tipe.Suite, "310", 4);
        manager.createKamar( daftarHotel.get(1), Tipe.Standar, "122", 4);
        manager.createKamar( daftarHotel.get(1), Tipe.VIP, "124", 4);
        
        // menambahkan kamar pada hotel Santika Bogor
        manager.createKamar( daftarHotel.get(2), Tipe.Standar, "201", 4);
        manager.createKamar( daftarHotel.get(2), Tipe.VIP, "302", 4);
        manager.createKamar( daftarHotel.get(2), Tipe.Suite, "310", 4);
        
        System.out.println(" == Menampilkan daftar kamar Standar pada "+ daftarHotel.get(0));
        
        var IK = daftarHotel.get(0); // hold Hotel Indonesia Kempinski
        IK.showAllbyType(Tipe.Standar);
        
        
        System.out.println("[Info] Skenario di " + IK);
        System.out.println("[Info] Orang Ganteng memesan kamar standar 201");
        var kamar = manager.searchKamar(IK, "201");
        kamar.book("Orang Ganteng", 1, 6);
        System.out.println("[Info] Orang Biasa memesan kamar standar 201");
        kamar.book("Orang Biasa", 3, 1);
        
        System.out.println("[Info] Afriza memesan kamar suite 310");
        var kamar2 = manager.searchKamar(IK, "310");
        kamar2.book("Afriza", 2, 2);
        
        System.out.println("[Info] Orang Ganteng dan Afriza Check in");
        kamar.chekcIn(days.getDays());
        kamar2.chekcIn(days.getDays());
        
        days.addDays();
        days.addDays();
        System.out.println("[Info] 2 Hari Berlalu, mereka berdua checkout");
        System.out.println("== menampilkan tagihan");
        
        kamar.checkOut( days.getDays() );
        kamar2.checkOut( days.getDays() );
        System.out.printf("%s Rp. %.1f\n", "Orang Biasa", kamar.calculateTotal());
        System.out.printf("%s Rp. %.1f\n", "Afriza", kamar2.calculateTotal());
        System.out.println("");
        
        kamar.clear();
        kamar2.clear();
        
        
       
    }




    
}
