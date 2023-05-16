/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioguia1;

import Entities.DNI;
import Entities.Persona;

/**
 *
 * @author clavs
 */
public class EjercicioGuia1 {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        DNI dni = new DNI();
        
        dni.setNumero(45641208);
        dni.setSerie("F-");
        p1.setApellido("Rego");
        p1.setNombre("Joaquín");
        p1.setDni(dni);
        dni = p1.getDni();
        System.out.println("Apellido: " + p1.getApellido());
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("DNI: " + dni.getSerie() + dni.getNumero());
    }
}
