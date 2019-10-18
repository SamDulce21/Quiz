/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intpersona;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author estudiante
 */
public class Persona {

    public String nombre, apellido, telefono, direccion, fecha_nacimiento;
   

    // constructor 
    public void persona(String nom, String ape, String tel, String dir, String fec) {

        this.nombre = nom;
        this.apellido = ape;
        this.telefono = tel;
        this.direccion = dir;
        this.fecha_nacimiento = fec;
    }
    
    
    public void calcuEdad() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern ("dd/MM/yyyy");
        LocalDate dob = LocalDate.parse(this.fecha_nacimiento, fmt);
        LocalDate NowDate = LocalDate.now();
        Period period = Period.between(dob, NowDate);
        

    
    
    
    }
}
