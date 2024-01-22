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
public class PROG02_Ejerc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        switch (edad >= 18 ? 1 : 0) {
            case 1:
                System.out.println("Es mayor de edad.");
                break;
            case 0:
                System.out.println("No es mayor de edad.");
                break;
        }
    }
}
