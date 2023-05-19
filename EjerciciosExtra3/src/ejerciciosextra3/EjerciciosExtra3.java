/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosextra3;

import Entidades.Cliente;
import Entidades.Cuota;
import Entidades.Poliza;
import Entidades.Vehiculo;
import Servicios.ClienteService;
import Servicios.CuotaService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author clavs
 */
public class EjerciciosExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ClienteService cliServ = new ClienteService();
        CuotaService cuServ = new CuotaService();
        List<Vehiculo> vehiculos = new ArrayList();
        List<Cuota> cuotas = new ArrayList();
        List<Cliente> clientes = new ArrayList();
        cuotas.add(cuServ.crearCuota());
        Poliza poliza = new Poliza(cuotas);
        System.out.println("INGRESAR 1 O 2 AUTOS!!!");
        clientes.add(cliServ.crearCliente(vehiculos, poliza));
        
        System.out.println("DATOS COMPLETOS EN UN SOLO TO STRING!:");
        System.out.println(clientes.get(0).toString());
        
        System.out.println(" ");
        
        System.out.println("DATOS POR SEPARADO:");
        
        System.out.println(" ");
        
        System.out.println("DATOS DEL CLIENTE:");
        System.out.println(clientes.get(0).getNombreCompleto());
        System.out.println(clientes.get(0).getMail());
        System.out.println(clientes.get(0).getDni());
        System.out.println(clientes.get(0).getDomicilio());
        System.out.println(clientes.get(0).getCel());
        
        System.out.println("DATOS VEHICULO #1:");
        System.out.println(clientes.get(0).getVehiculos().get(0).getMarca());
        System.out.println(clientes.get(0).getVehiculos().get(0).getModelo());
        System.out.println(clientes.get(0).getVehiculos().get(0).getYear());
        System.out.println("Numero de motor: " + clientes.get(0).getVehiculos().get(0).getNumeroMotor());
        System.out.println("Chasis: " + clientes.get(0).getVehiculos().get(0).getChasis());
        System.out.println(clientes.get(0).getVehiculos().get(0).getColor());
        System.out.println(clientes.get(0).getVehiculos().get(0).getTipo());
        System.out.println("POLIZA:");
        System.out.println(clientes.get(0).getVehiculos().get(0).getPoliza().getNumero());
        System.out.println("Fecha Inicio: " + clientes.get(0).getVehiculos().get(0).getPoliza().getFechaInicio());
        System.out.println("Fecha Final: " + clientes.get(0).getVehiculos().get(0).getPoliza().getFechaFinal());
        System.out.println(clientes.get(0).getVehiculos().get(0).getPoliza().getFormaPago());
        System.out.println("Monto total: " + clientes.get(0).getVehiculos().get(0).getPoliza().getMontoTotal());
        System.out.println("Monto maximo de granizo: " + clientes.get(0).getVehiculos().get(0).getPoliza().getGranizoMax());
        System.out.println("Tipo de cobertura: " + clientes.get(0).getVehiculos().get(0).getPoliza().getCobertura());
        System.out.println("CUOTAS:");
        System.out.println("Numero de cuota: " + clientes.get(0).getVehiculos().get(0).getPoliza().getCantidadCuotas().get(0).getNumero());
        System.out.println("Monto: " + clientes.get(0).getVehiculos().get(0).getPoliza().getCantidadCuotas().get(0).getMonto());
        System.out.println("Vencimiento: " + clientes.get(0).getVehiculos().get(0).getPoliza().getCantidadCuotas().get(0).getVencimiento());
        System.out.println(clientes.get(0).getVehiculos().get(0).getPoliza().getCantidadCuotas().get(0).getFormaPago());
        
        System.out.println("DATOS VEHICULO #2:");
        System.out.println(clientes.get(0).getVehiculos().get(1).getMarca());
        System.out.println(clientes.get(0).getVehiculos().get(1).getModelo());
        System.out.println(clientes.get(0).getVehiculos().get(1).getYear());
        System.out.println("Numero de motor: " + clientes.get(0).getVehiculos().get(1).getNumeroMotor());
        System.out.println("Chasis: " + clientes.get(0).getVehiculos().get(1).getChasis());
        System.out.println(clientes.get(0).getVehiculos().get(1).getColor());
        System.out.println(clientes.get(0).getVehiculos().get(1).getTipo());
        System.out.println("POLIZA:");
        System.out.println(clientes.get(0).getVehiculos().get(1).getPoliza().getNumero());
        System.out.println("Fecha Inicio: " + clientes.get(0).getVehiculos().get(1).getPoliza().getFechaInicio());
        System.out.println("Fecha Final: " + clientes.get(0).getVehiculos().get(1).getPoliza().getFechaFinal());
        System.out.println(clientes.get(0).getVehiculos().get(1).getPoliza().getFormaPago());
        System.out.println("Monto total: " + clientes.get(0).getVehiculos().get(1).getPoliza().getMontoTotal());
        System.out.println("Monto maximo de granizo: " + clientes.get(0).getVehiculos().get(1).getPoliza().getGranizoMax());
        System.out.println("Tipo de cobertura: " + clientes.get(0).getVehiculos().get(1).getPoliza().getCobertura());
        System.out.println("CUOTAS:");
        System.out.println("Numero de cuota: " + clientes.get(0).getVehiculos().get(1).getPoliza().getCantidadCuotas().get(0).getNumero());
        System.out.println("Monto: " + clientes.get(0).getVehiculos().get(1).getPoliza().getCantidadCuotas().get(0).getMonto());
        System.out.println("Vencimiento: " + clientes.get(0).getVehiculos().get(1).getPoliza().getCantidadCuotas().get(0).getVencimiento());
        System.out.println(clientes.get(0).getVehiculos().get(1).getPoliza().getCantidadCuotas().get(0).getFormaPago());
        
        
    }

}
