/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

import Interface.IFasilitasStandar;
import java.util.Arrays;

public class KamarStandar extends Kamar implements IFasilitasStandar{
    
    public KamarStandar(String nomor, int kapasitas) {
        super(nomor, kapasitas, Tipe.Standar);
        this.setFasilitas();
    }

    @Override
    public final void setFasilitas() {
        super.setHarga(HARGA);
        super.setPenaltyLateCheckout(PENALTY_LATE_CHECKOUT);
        super.setPenaltyOverCapacity(PENALTY_OVER_CAPACITY);
        super.daftarFasilitas.addAll(Arrays.asList(IFasilitasStandar.daftarFasilitas));
    }
    
    

    
}
