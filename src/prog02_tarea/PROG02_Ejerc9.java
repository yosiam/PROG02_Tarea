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
public class PROG02_Ejerc9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el año
        System.out.print("Ingrese un año para verificar si es bisiesto: ");
        int year = scanner.nextInt();

        // Verificar si el año es bisiesto
        boolean esBisiesto = esBisiesto(year);

        // Mostrar el resultado
        if (esBisiesto) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }
    }

    // Método para verificar si un año es bisiesto
    private static boolean esBisiesto(int year) {
        // Si es divisible por 4 pero no por 100, o es divisible por 400, entonces es bisiesto
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
