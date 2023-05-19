/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cuota;
import Entidades.Poliza;
import java.util.List;

/**
 *
 * @author clavs
 */
public class PolizaService {
    
    public Poliza crearPoliza(List<Cuota> cuota){
        
        Poliza poliza = new Poliza(cuota);
        
        return poliza;
    }
}
