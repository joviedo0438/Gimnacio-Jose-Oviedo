/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gimnacio;

import java.util.Scanner;

/**
 *
 * @author joviedo
 */
public class Gimnacio {

    private static Gim NombreEmpleado;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        

    
        String[] horarios = {"2:00 p.m.", "3:00 p.m.", "4:00 p.m.", "5:00 p.m.", "6:00 p.m.", "7:00 p.m."};
        Gim[] reservacion = new Gim[horarios.length];
        Scanner scanner = new Scanner(System.in);
        
      
        while (true) {
            System.out.println(" Sistema de Reservas del Gimnasio ");
            System.out.println("1 Reservar Hora");
            System.out.println("2 Consultar Reservas");
            System.out.println("3 Salir");
            System.out.print("Seleccione una opción: ");
            int elegir = scanner.nextInt();
            
            switch (elegir) {
                case 1:
                    System.out.println(" Horarios Disponibles ");
                    for (int i = 0; i < horarios.length; i++) {
                        if (reservacion[i] == null) {
                            System.out.println((i + 1) + "  " + horarios[i]);
                        }
                    }
                    
                    System.out.print("Seleccione un horario (número): ");
                    int seleccionar = scanner.nextInt()-1;
                    
                    if (reservacion[seleccionar] != NombreEmpleado) {
                        System.out.println("El horario ya está reservado. Por favor, elija otro.");
                    }
                    else {
                        System.out.print("Ingrese el ID del empleado: ");
                        String idEmpleado = scanner.next();
                        
                        System.out.print("Ingrese el nombre del empleado: ");
                        String nombreEmpleado = scanner.next();
                        
                        reservacion[seleccionar] = new Gim(idEmpleado, nombreEmpleado);
                        System.out.println("Reserva realizada con éxito");
                    }   break;
                case 2:
                    System.out.println("--- Consultar Reservas ---");
                    for (int i = 0; i < horarios.length; i++) {
                        if (reservacion[i] != null) {
                            System.out.println((i + 1) + ". " + horarios[i] + " - " + reservacion[i].getNombreEmpleado());
                        } else {
                            System.out.println((i + 1) + ". " + horarios[i] + " - Disponible");
                        }
                    }   break;
                case 3:
                    System.out.println("¡Gracias por usar el sistema de reservas!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
                    break;
            }
        }

 
    }
       

    }
