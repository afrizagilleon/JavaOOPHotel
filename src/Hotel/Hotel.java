/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;
import java.util.ArrayList;
import Lokasi.*;
import Interface.*;

public class Hotel implements IAddRemove, ISearchable{
    private String nama;
    private Lokasi alamat;
    
    private final ArrayList<Kamar> daftarKamar = new ArrayList<>();

    public Hotel(String nama, Lokasi alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public void setAlamatDetail(String alamat){
        this.alamat.setDetailAlamat(alamat);
    }
    
    public void showDetail(){
        System.out.printf("Hotel %s\n-alamat: %s\n-jumlahKamar: %d\n",
                this.nama, this.alamat, this.daftarKamar.size());
    }

    public ArrayList<Kamar> getDaftarKamar() {
        return daftarKamar;
    }
    
    @Override
    public String toString() {
        return "Hotel " + this.nama;
    }

    @Override
    public void add(Object kmr) {
        if( !(kmr instanceof Kamar) ){
            System.out.println("[Error-dev] mohon masukkan object kamar");
            return;
        }
        Kamar kmrr = (Kamar) kmr;
        
        this.daftarKamar.add(kmrr);
        System.out.println("Hotel " + this.nama + " menambahkan " + kmrr.getType());
    }

    @Override
    public void remove(Object kmr) {
        if( !(kmr instanceof Kamar) ){
            System.out.println("[Error-dev] mohon masukkan object kamar");
            return;
        }
        this.daftarKamar.remove((Kamar)kmr);
        System.out.println("Hotel " + this.nama + " menghapus " + (Kamar)kmr);
    }

    @Override
    public Object search(Object nomor) {
        for (Kamar kamar : this.daftarKamar) {
            if ( kamar.getNomor().equals( nomor )) {
                return (Kamar)kamar;
            }
        }
        return null;
    }

    @Override
    public Object selectFrom(ArrayList<Object> objs, Object number) {
        if( (int)number > objs.size()){
            System.out.println("[Err-] Pilihan tidak tersedia");
            return null;
        }
        return objs.get((int)number-1);
    }

    @Override
    public ArrayList<Object> getAllbyType(Tipe type) {
        ArrayList<Object> result = new ArrayList<>();
        for (Kamar kamar: this.daftarKamar){
            if( kamar.getType() == type){
                result.add(kamar);
            }
        }
        return result;
    }

    @Override
    public void showAll() {
        System.out.println("========== Daftar Kamar " + this + "==========");
        int i = 1;
        for (Kamar kamar : this.daftarKamar) {
            System.out.println( i + ". " + kamar); i += 1;
        }
        System.out.println("====== End Daftar Kamar " + this + "==========");
    }

    @Override
    public void showAllbyType(Tipe criteria) {
        int i = 1;
        for (Object kamar : this.getAllbyType(criteria)) {
            System.out.println( i + ". " + kamar); i += 1;
        }
    }

    
}
