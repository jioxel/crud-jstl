/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author Jovany
 */
public class Auto {
    private String placa;
    private String marca;
    private String modelo;
    private String cilindraje;
    private String anio;
    private String consumo;

    public Auto() {
    }

    public Auto(String placa, String marca, String modelo, String cilindraje, String anio, String consumo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.anio = anio;
        this.consumo = consumo;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public String getAnio() {
        return anio;
    }

    public String getMarca() {
        return marca;
    }

    public String getConsumo() {
        return consumo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Auto" + this.anio;
    }
     
}
