/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Poliza;
import Entidades.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class VehiculoService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Vehiculo crearVehiculo(Poliza poliza) {
        
//        System.out.println("Ingresar marca:");
//        String marca = leer.next();
//        System.out.println("Ingresar modelo:");
//        String modelo = leer.next();
//        System.out.println("Ingresar año:");
//        int year = leer.nextInt();
//        System.out.println("Ingresar numero de motor:");
//        int numMotor = leer.nextInt();
//        System.out.println("Ingresar chasis:");
//        String chasis = leer.next();
//        System.out.println("Ingresar color:");
//        String color = leer.next();
//        System.out.println("Ingresar tipo:");
//        String tipo = leer.next();
        
        Vehiculo vehiculo = new Vehiculo("Fiat", "Fitito", 1990, 666, "Fiat 999", "Rojo", "Automovil", poliza);
        return vehiculo;
    }
}
