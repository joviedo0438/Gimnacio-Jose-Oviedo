/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimnacio;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author joviedo
 */
public class Gim {
    

    private int idEmpleado;
    private String nombreEmpleado;

    
    public Gim(String idEmpleado, String nombreEmpleado) {
        this.idEmpleado = Integer.parseInt(idEmpleado);
        this.nombreEmpleado = nombreEmpleado;
    }

    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
}
 

    





