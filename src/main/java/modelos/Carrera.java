/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Basic;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Reaper Borja
 */

@Entity
public class Carrera  implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Basic
    private String nombre;
    
    private int id_alumno;
    public Carrera() {
    }

    public Carrera(int id) {
        this.id = id;
    }

    public Carrera(int id, String nombre, int id_alumno) {
        this.id = id;
        this.nombre = nombre;
        this.id_alumno= id_alumno;
        
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }
    
    
    
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
