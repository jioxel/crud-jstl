/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.utils.MemoryStore;
import com.mycompany.model.Auto;
import java.util.List;
/**
 *
 * @author Jovany
 */
public class AutoDao {
    public void add(Auto auto){
        MemoryStore.addAuto(auto);
    }
    public void update(Auto auto){
        MemoryStore.editarAuto(auto);
    }
    public List<Auto> get(){
       return MemoryStore.getAutos();
    }
    public Auto getAuto(String placa){
        return MemoryStore.getAuto(placa);
    }
}
