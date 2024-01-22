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
public class PROG02_Ejerc5 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese la cantidad de segundos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de segundos: ");
        long segundos = scanner.nextLong();

        // Calcular minutos, horas y días
        long minutos = segundos / 60;
        long horas = minutos / 60;
        long dias = horas / 24;

        // Mostrar resultados
        System.out.println("Segundos ingresados: " + segundos);
        System.out.println("Minutos: " + minutos);
        System.out.println("Horas: " + horas);
        System.out.println("Días: " + dias);
    }
}
