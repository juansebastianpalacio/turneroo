/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turnero.modelo;

/**
 *
 * @author jpala
 */
public class Turno {
    


      
    private String prioridad;
    private int numero;
    private String tipoServicio;
   
   
 public Turno()
    {
        // Inicialización
        prioridad = "desconocido";
        numero= 0;
        tipoServicio = "desconocido";
        
    }

    public Turno(String prioridad, int numero, String tipoServicio) {
        this.prioridad = prioridad;
        this.numero = numero;
        this.tipoServicio = tipoServicio;
    }



}
     