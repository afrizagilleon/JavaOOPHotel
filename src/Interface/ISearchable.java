/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import Hotel.Tipe;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface ISearchable {
    Object search(Object name);
    Object selectFrom(ArrayList<Object> objs ,Object number);
    ArrayList<Object> getAllbyType(Tipe type);
    void showAll();
    void showAllbyType(Tipe type);
}
