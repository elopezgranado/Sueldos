/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sueldos;

import Entidades.Vendedor;
import Servicios.VendedorServicio;

/**
 *
 * @author A305649
 */
public class Sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VendedorServicio vs = new VendedorServicio();
        Vendedor v1 = vs.altaVendedor();
        vs.sueldoMensual(v1);
        vs.vacaciones(v1);
    }
    
}
