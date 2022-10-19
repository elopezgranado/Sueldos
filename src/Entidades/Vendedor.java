/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author A305649
 */
public class Vendedor {
    private String nombre;
    private Integer dni;
    private Double sueldoBasico;
    private Double comisiones;
    private Double sueldoMensual;
    private Date fechaInicio;
    
    // Constructor por defecto
    public Vendedor() {
    }
    
    // Constructos por parámetros
    public Vendedor(String nombre, Integer dni, Double sueldoBasico, Double comisiones, Double sueldoMensual, Date fechaInicio) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBasico = sueldoBasico;
        this.comisiones = comisiones;
        this.sueldoMensual = sueldoMensual;
        this.fechaInicio = fechaInicio;
    }
    
    // Getter & Setter

    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public Double getSueldoBasico() {
        return sueldoBasico;
    }

    public Double getComisiones() {
        return comisiones;
    }

    public Double getSueldoMensual() {
        return sueldoMensual;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setSueldoBasico(Double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void setComisiones(Double comisiones) {
        this.comisiones = comisiones;
    }

    public void setSueldoMensual(Double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", dni=" + dni + ", sueldoBasico=" + sueldoBasico + ", comisiones=" + comisiones + ", sueldoMensual=" + sueldoMensual + ", fechaInicio=" + fechaInicio + '}';
    }
    
    
}
