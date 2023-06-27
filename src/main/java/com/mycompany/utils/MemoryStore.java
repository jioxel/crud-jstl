/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utils;

import java.util.HashMap;
import java.util.List;

import java.util.ArrayList;
import com.mycompany.model.Auto;
/**
 *
 * @author Jovany
 */
public class MemoryStore {

    private static HashMap<String, Auto> autos = new HashMap<>();
    
    //añadir auto
    public static void addAuto(Auto auto){
        String placa = auto.getPlaca();
        if(autos.containsKey(placa)){
            autos.remove(auto);
        }
        autos.put(placa, auto);
    }
    
    public static void editarAuto(Auto auto){
        autos.replace(auto.getPlaca(), auto);
    }
    
    public static List<Auto> getAutos(){
        return new ArrayList<>(autos.values());
    }
    
    public static Auto getAuto(String placa){
        return autos.get(placa);
    }
    
}
