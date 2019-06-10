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
public class Persona {
      
    private String identificacion;
    private String nombre;
   
 public Persona()
    {
        // Inicialización
        identificacion = "desconocido";
        nombre = "desconocido";
    } 

    public Persona(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }
 
 
// Escribir métodos getters y setters

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
            
   
    

