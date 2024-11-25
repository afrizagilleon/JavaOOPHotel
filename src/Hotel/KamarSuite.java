/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

import Interface.IFasilitasSuite;
import java.util.Arrays;

public class KamarSuite extends Kamar implements IFasilitasSuite{
    
    public KamarSuite(String nomor, int kapasitas) {
        super(nomor, kapasitas, Tipe.Suite);
        this.setFasilitas();
    }

    @Override
    public void setFasilitas() {
        super.setHarga(HARGA);
        super.setPenaltyLateCheckout(PENALTY_LATE_CHECKOUT);
        super.setPenaltyOverCapacity(PENALTY_OVER_CAPACITY);
        super.daftarFasilitas.addAll(Arrays.asList(IFasilitasSuite.daftarFasilitas));
    }
    
    
    
}
