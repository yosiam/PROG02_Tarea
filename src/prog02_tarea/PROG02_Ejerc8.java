/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog02_tarea;

import java.util.Scanner;

/**
 *
 * @author Joseme
 */
public class PROG02_Ejerc8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de alumnos matriculados en cada módulo
        System.out.print("Ingrese el número de alumnos matriculados en Programación: ");
        int alumnosProgramacion = scanner.nextInt();

        System.out.print("Ingrese el número de alumnos matriculados en Entornos de Desarrollo: ");
        int alumnosEntornos = scanner.nextInt();

        System.out.print("Ingrese el número de alumnos matriculados en Base de datos: ");
        int alumnosBaseDatos = scanner.nextInt();

        // Calcular el porcentaje de alumnos en cada módulo
        int totalAlumnos = alumnosProgramacion + alumnosEntornos + alumnosBaseDatos;

        double porcentajeProgramacion = (alumnosProgramacion * 100.0) / totalAlumnos;
        double porcentajeEntornos = (alumnosEntornos * 100.0) / totalAlumnos;
        double porcentajeBaseDatos = (alumnosBaseDatos * 100.0) / totalAlumnos;

        // Mostrar los resultados con un solo decimal en los porcentajes
        System.out.printf("Porcentaje de alumnos en Programación: %.1f%%%n", porcentajeProgramacion);
        System.out.printf("Porcentaje de alumnos en Entornos de Desarrollo: %.1f%%%n", porcentajeEntornos);
        System.out.printf("Porcentaje de alumnos en Base de datos: %.1f%%%n", porcentajeBaseDatos);
    }
}
