/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controllers;

/**
 *
 * @author Jovany
 */
import com.mycompany.dao.AutoDao;
import com.mycompany.model.Auto;
public class TestMain {
    public static void main(String[] args) {
        
        Auto a1= new Auto("a","a","a","a","a","a");
        Auto a2= new Auto("b","b","b","b","b","b");
        Auto a3= new Auto("c","c","c","c","c","c");
        
        AutoDao autoDao = new AutoDao();
        autoDao.add(a1);
        autoDao.add(a2);
        autoDao.add(a3);
        
        for(Auto auto: autoDao.get()){
            System.out.print(auto);
        }
    }
}
