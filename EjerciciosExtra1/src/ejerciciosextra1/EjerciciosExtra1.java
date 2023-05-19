/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosextra1;

import Entidades.Perro;
import Entidades.Persona;

/**
 *
 * @author clavs
 */
public class EjerciciosExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();
        Perro perro3 = new Perro();
        Perro perro4 = new Perro();
        
        p1.setNombre("Joaquín");
        p1.setApellido("Rego");
        p1.setDocumento(45641208);
        p1.setEdad(19);

        p2.setNombre("Juan Ignacio");
        p2.setApellido("Rego");
        p2.setDocumento(47442475);
        p2.setEdad(16);

        perro1.setNombre("Bonnie");
        perro1.setRaza("Sin raza");
        perro1.setTamaño(110);
        perro1.setEdad(6);

        perro2.setNombre("Pepito");
        perro2.setRaza("Doberman");
        perro2.setTamaño(50);
        perro2.setEdad(1);

        int puntosPers1Perr1 = 0;
        int puntosPers1Perr2 = 0;
        int puntosPers2Perr1 = 0;
        int puntosPers2Perr2 = 0;

        // Preferencias de raza Persona #1:
        if (perro1.getRaza().equalsIgnoreCase("Doberman")) {
            puntosPers1Perr1++;
        }
        if (perro2.getRaza().equalsIgnoreCase("Doberman")) {
            puntosPers1Perr2++;
        }
        // Preferencias de raza Persona #2:
        if (perro1.getRaza().equalsIgnoreCase("Sin raza")) {
            puntosPers2Perr1++;
        }
        if (perro2.getRaza().equalsIgnoreCase("Sin raza")) {
            puntosPers2Perr2++;
        }

        // Preferencias de tamaño Persona #1:
        if (perro1.getTamaño() < 100) {
            puntosPers1Perr1++;
        }
        if (perro2.getTamaño() < 100) {
            puntosPers1Perr2++;
        }
        // Preferencias de tamaño Persona #2:
        if (perro1.getTamaño() > 100) {
            puntosPers2Perr1++;
        }
        if (perro2.getTamaño() > 100) {
            puntosPers2Perr2++;
        }

        // Preferencias de edad Persona #1:
        if (perro1.getEdad() < 3) {
            puntosPers1Perr1++;
        }
        if (perro2.getEdad() < 3) {
            puntosPers1Perr2++;
        }
        // Preferencias de edad Persona #2:
        if (perro1.getEdad() > 3) {
            puntosPers2Perr1++;
        }
        if (perro2.getEdad() > 3) {
            puntosPers2Perr2++;
        }

        // Resolución Persona #1:
        boolean perro1Adoptado = false;
        boolean perro2Adoptado = false;

        if (puntosPers1Perr1 > puntosPers1Perr2) {
            p1.setPerro(perro1);
            perro1Adoptado = true;
        } else {
            p1.setPerro(perro2);
            perro2Adoptado = true;
        }

        // Resolución Persona #2:
        if (puntosPers2Perr1 > puntosPers2Perr2 && !perro1Adoptado) {
            p2.setPerro(perro1);
        } else if (puntosPers2Perr2 >= 2 && !perro2Adoptado) {
            p2.setPerro(perro2);
        }

        System.out.println("Persona #1: ");
        System.out.println("Nombre : " + p1.getNombre());
        System.out.println("Apellido : " + p1.getApellido());
        System.out.println("Documento : " + p1.getDocumento());
        System.out.println("Edad : " + p1.getEdad());
        Perro aux1 = p1.getPerro();
        System.out.println("Perro adoptado: " + aux1.getNombre());

        System.out.println("Persona #2: ");
        System.out.println("Nombre : " + p2.getNombre());
        System.out.println("Apellido : " + p2.getApellido());
        System.out.println("Documento : " + p2.getDocumento());
        System.out.println("Edad : " + p2.getEdad());
        Perro aux2 = p2.getPerro();
        System.out.println("Perro adoptado: " + aux2.getNombre());
    }

}
