/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cliente;
import Entidades.Poliza;
import Entidades.Vehiculo;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class ClienteService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cliente crearCliente(List<Vehiculo> vehiculos, Poliza poliza) {
//        System.out.println("Ingresar nombre y apellido:");
//        String nombre = leer.next();
//        System.out.println("Ingresar documento:");
//        long dni = leer.nextLong();
//        System.out.println("Ingresar mail:");
//        String mail = leer.next();
//        System.out.println("Ingresar domicilio:");
//        String domicilio = leer.next();
//        System.out.println("Ingresar telefono:");
//        long telefono = leer.nextLong();
        VehiculoService veServ = new VehiculoService();
        System.out.println("Ingresar cantidad de vehiculos:");
        int cantidad = leer.nextInt();

        for (int i = 0; i < cantidad; i++) {
            Vehiculo nuevo = veServ.crearVehiculo(poliza);
            vehiculos.add(nuevo);
        }

        return new Cliente("Chiquito", "filomenamiamor@hotmail.com.ar", 666, "Con el pela 54", 800666, vehiculos);
    }
}
