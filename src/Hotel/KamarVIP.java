/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

import Interface.IFasilitasVIP;
import java.util.Arrays;


public class KamarVIP extends Kamar implements IFasilitasVIP {
    
    public KamarVIP(String nomor, int kapasitas) {
        super(nomor, kapasitas, Tipe.VIP);
        this.setFasilitas();
    }

    @Override
    public void setFasilitas() {
        super.setHarga(HARGA);
        super.setPenaltyLateCheckout(PENALTY_LATE_CHECKOUT);
        super.setPenaltyOverCapacity(PENALTY_OVER_CAPACITY);
        super.daftarFasilitas.addAll(Arrays.asList(IFasilitasVIP.daftarFasilitas));
    }
    
}
