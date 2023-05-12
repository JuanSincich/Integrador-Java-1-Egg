/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Estudiante;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EstudianteServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Estudiante[] crearAlumno(Estudiante[] estudiante) {
        System.out.println("Ingrese nombre y nota del alumno.");
        String nombre;
        double nota;

        for (int i = 0; i < estudiante.length; i++) {
            System.out.println("Nombre: ");
            nombre = leer.next();
            System.out.println("Nota (1/10) : ");
            nota = leer.nextDouble();
            while (nota < 1 || nota > 10) {
                System.out.println("Nota incorrecta. Ingrese nuevamente");
                nota = leer.nextDouble();
            }
            estudiante[i] = new Estudiante(nombre, nota);
        }//end for
        return estudiante;
    }//end crearAlumno

    //Calcular y mostrar el promedio de notas de todo el curso
    public double calcularPromedio(Estudiante[] estudiante) {

        double sumaNotas = 0;

        for (Estudiante estud1 : estudiante) {
            sumaNotas += estud1.getNota();
        }
        return sumaNotas / estudiante.length;
    }
    
    public void imprimirPromedio(Estudiante[] estudiante){
        System.out.println("El promedio de notas de todo el curso es : "+calcularPromedio(estudiante));
    }

    //Retornar otro arreglo con los nombre de los alumnos que recibieron 
    //una nota mayor al promedio del curso
    public String[] alumnosSuperiores(Estudiante[] estudiante) {

        double promedio = calcularPromedio(estudiante);

        int n = 0;
        for (Estudiante estud1 : estudiante) {
            if (estud1.getNota() > promedio) {
                n++;
            }
        }
        String[] nombres = new String[n];
        int j = 0;
        for (Estudiante estud1 : estudiante) {
            if (estud1.getNota() > promedio) {
                nombres[j] = estud1.getNombre();
                j++;
            }
        }
        return nombres;
    }

    //Por último, deberemos mostrar todos los estudiantes con una 
    //nota mayor al promedio.
    public void mostrar(String[] nombres) {
        System.out.println("Alumnos con nota superior al promedio de la clase : "+Arrays.toString(nombres));
    }

}//end service
