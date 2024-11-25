/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author ASUS
 */
public class Time {
    private int days;
    public Time(int days) {
        this.days = days;
    }
    public int getDays() {
        return days;
    }
    public void addDays() {
        this.days += 1; // Menambah hari
    }

    @Override
    public String toString() {
        return ""+days;
    }
}
