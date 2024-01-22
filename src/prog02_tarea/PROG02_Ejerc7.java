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
public class PROG02_Ejerc7 {
    public static void main(String[] args) {
        // Inicializar coeficientes de la ecuación
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de C1: ");
        double C1 = scanner.nextDouble();
        
        System.out.print("Ingrese el valor de C2: ");
        double C2 = scanner.nextDouble();

        // Resolver la ecuación de primer grado C1x + C2 = 0
        if (C1 != 0) {
            double solucion = -C2 / C1;
            System.out.printf("La solución de la ecuación %.4fx + %.4f = 0 es x = %.4f%n", C1, C2, solucion);
        } else {
            if (C2 == 0) {
                System.out.println("La ecuación tiene infinitas soluciones.");
            } else {
                System.out.println("La ecuación no tiene solución.");
            }
        }
    }
}
