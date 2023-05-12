/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorsincich;

import entidades.Estudiante;
import servicios.EstudianteServicio;

/**
 *
 * @author Usuario
 */
public class IntegradorSincich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstudianteServicio eS = new EstudianteServicio();
        
        Estudiante [] estudiante = new Estudiante[8];
        
        eS.crearAlumno(estudiante);
        
        eS.calcularPromedio(estudiante);
        
        eS.imprimirPromedio(estudiante);
        
        eS.alumnosSuperiores(estudiante);
        
        eS.mostrar(eS.alumnosSuperiores(estudiante));
        
    }
    
}
