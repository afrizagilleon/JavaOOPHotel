/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

/**
 *
 * @author ASUS
 */
public interface IFasilitasStandar extends IFasilitas{
    double HARGA = 120000;
    double PENALTY_LATE_CHECKOUT = 125000;
    double PENALTY_OVER_CAPACITY = 100000;
    public String daftarFasilitas[] = {"Parkir 24 Jam", "Sarapan", "TV", "Wifi"};
}
